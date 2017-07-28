package web.app.morrito.service;

import java.util.ArrayList;

import web.app.morrito.model.Product;

public interface ProductService {
	

	public Product save (Product product);
	public Product getProducts (Product product);
	public ArrayList<Product> searchProducts (Product product);
	public ArrayList<Product> listProducts (Product product);
}
