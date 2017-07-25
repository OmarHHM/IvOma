package web.app.morrito.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.app.morrito.model.Product;
import web.app.morrito.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService {

	 @Autowired
	 private ProductRepository productRepository;
	@Override
	public Product save(Product product) {
		Product products= new Product();
		productRepository.save(product);
		return products;
	}

}
