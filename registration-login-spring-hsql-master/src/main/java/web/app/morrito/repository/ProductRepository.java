package web.app.morrito.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import web.app.morrito.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

    @Query("SELECT p FROM Product p WHERE LOWER(p.description) = LOWER(:description)")
	public ArrayList<Product> findByDesc( @Param("description") String description);
	

}
