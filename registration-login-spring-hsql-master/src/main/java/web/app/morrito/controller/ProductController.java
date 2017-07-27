package web.app.morrito.controller;

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
@RemoteProxy
public class ProductController {

  @Autowired
    private ProductService productService;

	/*Redirect Products*/
  	@RequestMapping(value = {"/", "/products"}, method = RequestMethod.GET)
    public String product(Model model) {
        return "product";
    }
    

	/*addProducts*/
    @RequestMapping(value = {"/", "/addproduct"}, method = RequestMethod.POST)
    public String addProduct(@ModelAttribute("productForm") Product product,   Model model) {
    	Product pro= productService.save(product);
        return "product";
    }
	
    /*deleteProducts*/
    @RequestMapping(value = {"/", "/deleteProduct"}, method = RequestMethod.POST)
    public String deleteProduct(@ModelAttribute("productForm") Product product,   Model model) {
    	Product pro= productService.save(product);
        return "product";
    }

    /*getProducts*/
    @RemoteMethod 
    @RequestMapping(value = {"/", "/getProduct"}, method = RequestMethod.GET)
    public String getProduct(@ModelAttribute("productForm") Product product,   Model model) {
    	Product pro= productService.save(product);
        return "product";
    }
    
}
