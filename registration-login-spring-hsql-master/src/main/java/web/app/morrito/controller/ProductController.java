package web.app.morrito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.app.morrito.model.Product;
import web.app.morrito.service.ProductService;

@Controller
public class ProductController {

  @Autowired
    private ProductService productService;

	 
  	@RequestMapping(value = {"/", "/products"}, method = RequestMethod.GET)
    public String product(Model model) {
        return "product";
    }
    
    @RequestMapping(value = {"/", "/products"}, method = RequestMethod.POST)
    public String addProduct(@ModelAttribute("productForm") Product product,   Model model) {
    	Product pro= productService.save(product);
        return "product";
    }
	
    
}
