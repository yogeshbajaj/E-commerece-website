package com.ecomm.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ecomm.model.Category;
import org.hibernate.query.Query;;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl  implements CategoryDAO
{

	@Autowired
	SessionFactory sessionFactory;

	
	public boolean add(Category category) 
	{
		try
		{
			sessionFactory.getCurrentSession().save(category);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	
	public boolean delete(Category category)
	{
		try
		{
			sessionFactory.getCurrentSession().delete(category);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	
	public boolean update(Category category)
	{
		try
		{
			sessionFactory.getCurrentSession().update(category);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	
	public List<Category> listCategories() 
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Category");
		
		List<Category> listCategories= query.list();
		session.close();
		return listCategories;
	}

	public Category getCategory(int categoryId)
	{
		Session session=sessionFactory.openSession();
		Category category=session.get(Category.class,categoryId);
		session.close();
		return category;
	}
	

}
