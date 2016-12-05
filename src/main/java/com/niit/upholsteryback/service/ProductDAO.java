package com.niit.upholsteryback.service;




import java.util.List;

import com.niit.upholsteryback.model.Product;




public interface ProductDAO {
	 public List<Product> getAllProduct();
	   public  Product getProduct(int productid);
	   public void insertProduct(Product product);
	   public void updateProduct(Product product);
	   public void deleteProduct(int id);
	   public void deleteallProduct(Product product);

}
