package com.ecomm.dao;

import java.util.List;

import com.ecomm.model.Product;

public interface ProductDAO 
{
	public boolean add(Product product);
	public boolean delete(Product category);
	public boolean update(Product category);
	public List<Product> ProductList();
	public Product  getProduct(int ProductId);

}
