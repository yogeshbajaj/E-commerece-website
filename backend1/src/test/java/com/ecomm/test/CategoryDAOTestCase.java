package com.ecomm.test;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.dao.CategoryDAO;
import com.ecomm.model.Category;

public class CategoryDAOTestCase 
{
	@Autowired
	static CategoryDAO categoryDAO;

	@BeforeClass
	public static void executeFirst() 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.ecomm");
		context.refresh();
		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
	}

	@Test
	@Ignore
	public void addCategoryTest()
	{
		Category category = new Category();
		category.setCategoryName("Eletronic");
		category.setCategoryDesc("Mobile");
		assertTrue("Problem in Adding Category", categoryDAO.add(category));
	}

	@Test
	@Ignore
	public void updateCategoryTest() 
	{
		Category category = categoryDAO.getCategory(1);
		category.setCategoryDesc("Computer");
		assertTrue("Problem in Updating Category", categoryDAO.update(category));
	}

	@Test
	@Ignore
	public void deleteCategoryTest() 
	{
		Category category = categoryDAO.getCategory(34);
		assertTrue("Problem in deleting Category", categoryDAO.delete(category));
	}

	@Test
	@Ignore
	public void listCategoryTest()
	{
		List<Category> listCategories=categoryDAO.listCategories();
		assertTrue("Problem in listing Category",listCategories.size()>0);
		
		for(Category category:listCategories)
		{
			System.out.println("CategoryID"+category.getCategoryId());
			System.out.println("Category Name"+category.getCategoryName());
			System.out.println("Category Desc"+category.getCategoryDesc());
		}
	}	
}
