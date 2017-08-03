package web.app.morrito.serviceImpl.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.app.morrito.model.product.Product;
import web.app.morrito.repository.product.ProductRepository;
import web.app.morrito.service.product.ProductService;
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
	
	@Override
	public Product getProducts(Product product) {
		return productRepository.findOne(product.getId());
	}

	@Override
	public ArrayList<Product> searchProducts(Product product) {
		if(product.getDescription().equals("")){
			return (ArrayList<Product>) productRepository.findAll();
		}else{
			return (ArrayList<Product>) productRepository.findByDesc(product.getDescription());
		}
	}

	@Override
	public List<Product> listProducts(Product product) {
		return (ArrayList<Product>) productRepository.findAll();
	}

}
