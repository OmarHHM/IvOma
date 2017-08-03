package web.app.morrito.service.product;

import java.util.ArrayList;
import java.util.List;

import web.app.morrito.model.product.Product;

public interface ProductService {
	

	public Product save (Product product);
	public Product getProducts (Product product);
	public List<Product> searchProducts (Product product);
	public List<Product> listProducts (Product product);
}
