package web.app.morrito.controller;

import java.util.ArrayList;

import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.app.morrito.model.Product;
import web.app.morrito.service.ProductService;

@Controller
//@RemoteProxy
public class ProductController {

  @Autowired
    private ProductService productService;

	/*Redirect Products*/
  	@RequestMapping(value = {"/", "/products"}, method = RequestMethod.GET)
    public String product(Model model) {
        return "product";
    }
    

	/*addProduct:::::::::: Se ocupa para agregar un producto a la BD*/
    @RequestMapping(value = {"/", "/addproduct"}, method = RequestMethod.POST)
    public String addProduct(@ModelAttribute("productForm") Product product,   Model model) {
    	Product pro= productService.save(product);
        return "product";
    }
	
    /*deleteProduct:::::::::: Se ocupa para eliminar o dar de baja un producto de la BD*/
    @RequestMapping(value = {"/", "/deleteProduct"}, method = RequestMethod.POST)
    public String deleteProduct(@ModelAttribute("productForm") Product product,   Model model) {
    	Product pro= productService.save(product);
        return "product";
    }

    /*getProducts :::::::::: Se ocupa para buscar un producto de la BD con su id */
  //  @RemoteMethod 
    @RequestMapping(value = {"/", "/getProduct"}, method = RequestMethod.GET)
    public Product getProduct(@ModelAttribute("productForm") Product product) {
    	Product pro= productService.getProducts(product);
        return pro;
    }
    
    /*searchProduct :::::::::: Se ocupa para busqueda de productos por una descripción*/
    @RequestMapping(value = {"/", "/searchProduct"}, method = RequestMethod.GET)
    public ArrayList<Product> searchProduct(@ModelAttribute("productForm") Product product) {
    	return productService.searchProducts(product);
         
    }
    
    /*listProducts :::::::::: Se ocupa para busqueda de productos que existan en la BD*/
    /**
     * Falta Páginación 
     * 
     * **/
    @RequestMapping(value = {"/", "/listProduct"}, method = RequestMethod.GET)
    public ArrayList<Product> listProducts(@ModelAttribute("productForm") Product product ) {
    	return  productService.listProducts(product );
         
    }
    
}
