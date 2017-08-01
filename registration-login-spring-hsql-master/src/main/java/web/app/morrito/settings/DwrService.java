package web.app.morrito.settings;

import org.apache.log4j.Logger;
import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.springframework.stereotype.Service;

@Service("springService")
@RemoteProxy(name="dwrService")
public class DwrService {

	 protected static Logger logIvoMa = Logger.getLogger(DwrService.class);
	 
	 @RemoteMethod
	 public Object consulta(Object objeto) {	 
		 logIvoMa.info("Consulta Objeto");
	  return objeto;
	 }
	 
}
