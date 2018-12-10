package com.ecomm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecomm.model.Category;
import com.ecomm.model.Product;

@Repository("ProductDAO")
@Transactional
public class ProductDAOImpl implements ProductDAO
{
	@Autowired
	SessionFactory sessionFactory;
	
	public boolean add(Product product) 
	{
		try
		{
			sessionFactory.getCurrentSession().saveOrUpdate(product);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	
	public boolean delete(Product product) 
	{
		try
		{
			sessionFactory.getCurrentSession().delete(product);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	
	public boolean update(Product product)
	{
		try
		{
			sessionFactory.getCurrentSession().update(product);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	
	public List<Product> ProductList() 
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Product");
		List<Product> productList= query.list();
		session.close();
		return productList;
	}
	

	
	
	public Product getProduct(int ProductId)
	{
		Session session=sessionFactory.openSession();
		Product product=session.get(Product.class,ProductId);
		session.close();
		return product;
	}
	

}
