package com.ecomm.config;

import java.util.Properties;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.ecomm.model.Category;
import com.ecomm.model.Product;
import com.ecomm.model.Supplier;
import com.ecomm.model.User;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.ecomm.config")

public class DBConfig 
{
	@Bean(name="dataSource")
	public DataSource getH2DataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/yogesh");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		System.out.println("Data source object is created");
		return dataSource;
	}
	
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		Properties hibernateProperties=new Properties();
		hibernateProperties.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		hibernateProperties.setProperty("hibernate.show_sql", "true");
		LocalSessionFactoryBuilder localsessionFactory=new LocalSessionFactoryBuilder(getH2DataSource());
		localsessionFactory.addProperties(hibernateProperties);
		localsessionFactory.addAnnotatedClass(Category.class);
		localsessionFactory.addAnnotatedClass(Product.class);
		localsessionFactory.addAnnotatedClass(User.class);
		localsessionFactory.addAnnotatedClass(Supplier.class);
		System.out.println("Session Factory source object is created");
		SessionFactory sessionFactory=localsessionFactory.buildSessionFactory();
		return sessionFactory;
	}
	
	@Bean(name="txManager")
	public HibernateTransactionManager getHibernateTransactionmanager(SessionFactory sessionFactory)
	{
		System.out.println("Transaction Object is created");
		return new HibernateTransactionManager(sessionFactory);
	}

}
