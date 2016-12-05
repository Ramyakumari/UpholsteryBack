package com.niit.upholsteryback.service;



import java.util.List;

import com.niit.upholsteryback.model.Cart;



public interface CartDAO {
	
	 public List<Cart> getAllCart();
	   public  List<Cart> getCart(String username);
	   public void insertCart(Cart cart);
	   public void updateCart(Cart cart);
	   public void deleteCart(int id);
	   public void deleteallCart(Cart cart);


}


