package com.ecomm.test;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.ecomm.dao.SupplierDAO;
import com.ecomm.model.Category;
import com.ecomm.model.Supplier;;
public class SupplierDAOTestCase 
{

	static SupplierDAO supplierDAO;

	@BeforeClass
	
	public static void executeFirst() 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.ecomm");
		context.refresh();
		supplierDAO=(SupplierDAO) context.getBean("supplierDAO");
	}
	
	@Test
	public void addSupplierTestCase()
	{
		Supplier supplier=new Supplier();
		supplier.setSupplierId(101);
		supplier.setSupplierName("yogesh");
		supplier.setSupplierAddress("kothrud");
		supplier.setSupplierEmail("yog@123");
		supplier.setSupplierContact(1234522334);
		assertTrue("Problem in Adding Supplier", supplierDAO.add(supplier));
	
	}
	
	@Test
	@Ignore
	public void updateSupplierTest() 
	{
		Supplier supplier = supplierDAO.getSupplier(66);
		supplier.setSupplierName("Santosh");
		assertTrue("Problem in Updating Supplier",supplierDAO.update(supplier));
	}
	
	@Test
	@Ignore
	public void deleteSupplierTest() 
	{
		Supplier supplier = supplierDAO.getSupplier(1);
		supplier.setSupplierName("Santosh");
		assertTrue("Problem in Updating Supplier",supplierDAO.update(supplier));
	}

	@Test
	@Ignore
	public void listSupplier()
	{
		List<Supplier> listsupplier=supplierDAO.listSupplier();
		assertTrue("Problem in listing Suplier",listsupplier.size()>0);
		
		for(Supplier supplier:listsupplier)
		{
			System.out.println("Supplier ID"+supplier.getSupplierId());
			System.out.println("Supplier Name"+supplier.getSupplierName());
			System.out.println("Supplier Address"+supplier.getSupplierAddress());
		}
	
	}
}
