package web.app.morrito.utils.settings.dwr;

import java.math.BigDecimal;

import org.apache.log4j.Logger;
import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.springframework.stereotype.Service;

import web.app.morrito.model.product.Product;

//@Service
//@RemoteProxy(name="dwrService")
public class DwrService {

	 protected static Logger logIvoMa = Logger.getLogger(DwrService.class);
	 
	// @RemoteMethod
	 public Product consulta() {	
		 Product pro = new Product(); 
	    	pro.setDescription("Primer producto");
	    	pro.setDiscount(new  BigDecimal("100.00"));
	    	pro.setExistence(Long.valueOf("90"));
	    	pro.setId(Long.valueOf("100000"));
	    	pro.setIdCategoria(Long.valueOf("1"));
	    	pro.setTotal(new  BigDecimal("100.00"));
	    	pro.setUnitPrice(new  BigDecimal("100.00"));
	    	pro.setUrlImage("https://www.google.com.mx/search?q=imagen&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjV887i3bbVAhUs6IMKHU0jCGsQ_AUICigB&biw=1366&bih=662#imgrc=NIkfcA3v4RfGAM:");	 
		 logIvoMa.info("Consulta Objeto");
	  return pro;
	 }
	 
}
