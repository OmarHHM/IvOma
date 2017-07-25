package web.app.morrito.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import web.app.morrito.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
