package web.app.morrito.controller.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.app.morrito.model.product.Product;
import web.app.morrito.service.product.ProductService;
import web.app.morrito.utils.settings.dwr.DwrService;

@Controller
@RemoteProxy(name="dwrService")
public class ProductController {

    @Autowired
    private ProductService productService;
//    @Resource(name="springService")
//    DwrService dwrService;
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
    @RemoteMethod 
  //  @RequestMapping(value = {"/", "/getProduct"}, method = RequestMethod.GET)
    public Product getProduct() {
    	Product pro = new Product(); 
    	pro.setDescription("Primer producto");
    	pro.setDiscount(new  BigDecimal("100.00"));
    	pro.setExistence(Long.valueOf("90"));
    	pro.setId(Long.valueOf("100000"));
    	pro.setIdCategoria(Long.valueOf("1"));
    	pro.setTotal(new  BigDecimal("100.00"));
    	pro.setUnitPrice(new  BigDecimal("100.00"));
    	pro.setUrlImage("https://www.google.com.mx/search?q=imagen&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjV887i3bbVAhUs6IMKHU0jCGsQ_AUICigB&biw=1366&bih=662#imgrc=NIkfcA3v4RfGAM:");
    	//pro=  (Product) dwrService.consulta(pro);//productService.getProducts(pro);
        return pro;
    }
    
    /*searchProduct :::::::::: Se ocupa para busqueda de productos por una descripción*/
    @RequestMapping(value = {"/", "/searchProduct"}, method = RequestMethod.GET)
    public List<Product> searchProduct(@ModelAttribute("productForm") Product product) {
    	return productService.searchProducts(product);
         
    }
    
    /*listProducts :::::::::: Se ocupa para busqueda de productos que existan en la BD*/
    /**
     * Falta Páginación 
     * 
     * **/
    @RequestMapping(value = {"/", "/listProduct"}, method = RequestMethod.GET)
    public List<Product> listProducts(@ModelAttribute("productForm") Product product ) {
    	return  productService.listProducts(product );
         
    }
    
}
