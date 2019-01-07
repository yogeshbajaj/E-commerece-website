package com.ecomm.dao;

import java.util.List;

import com.ecomm.model.CartItem;

public interface CartDAO 
{
	public boolean addCartItem(CartItem cartItem);
	public boolean deleteCartItem(CartItem cartItem);
	public boolean updateCartItem(CartItem cartItem);
	public List<CartItem> retrieveCartItems(String username);
	public CartItem getCartItem(int cartItemId);

}
