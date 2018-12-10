package com.ecomm.controller;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecomm.dao.CategoryDAO;
import com.ecomm.dao.ProductDAO;
import com.ecomm.model.Category;
import com.ecomm.model.Product;

@Controller
public class ProductController 
{
	
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@RequestMapping(value="/product")
	public String showProductPage(Model m)
	{
		List<Product> listProducts=productDAO.ProductList();
		m.addAttribute("productlist",listProducts);
		
		Product product=new Product();
		m.addAttribute("CategoryList", this.getCategoryList(categoryDAO.listCategories()));
		return "Product";	
	}
	
	@RequestMapping(value="/InsertProduct",method=RequestMethod.POST)
	public String insertProduct(@ModelAttribute("product")Product product,Model m)
	{
		productDAO.add(product);
		Product product1=new Product();
		m.addAttribute("product",product1);
		List<Product>ProductList=productDAO.ProductList();
		m.addAttribute("ProdcutList",ProductList);
		return "Product";	
	}
	
	@RequestMapping(value="/editProduct/{productId}")
	public String editProduct(@PathVariable("productId")int productID,Model m)
	{
		Product product=productDAO.getProduct(productID);
		m.addAttribute("product",product);
		List<Product> listProducts=productDAO. ProductList();
		m.addAttribute("productlist",listProducts);
		return "Product";
		
	}
	@RequestMapping(value="/deleteProduct/{productId}")
	public String deleteProduct(@PathVariable("productId")int productID,Model m)
	{
		Product product=productDAO.getProduct(productID);
		productDAO.delete(product);
		Product product1=new Product();
		m.addAttribute("product",product1);
		List<Product> listProducts=productDAO.ProductList();
		m.addAttribute("productlist",listProducts);
		//m.addAttribute("CategoryList" this.listCategories(categoryDAO.listCategories()));
		return "Product";
		
	}
	
	public LinkedHashMap<Integer, String> getCategoryList(List<Category> listCategory)
	{
		LinkedHashMap<Integer, String> listCategories=new LinkedHashMap<Integer,String>();
		for(Category category:listCategory)
		{
			listCategories.put(category.getCategoryId(), category.getCategoryName());
		}
		return listCategories;
		
	}
	
}
