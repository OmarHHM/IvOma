package web.app.morrito.model.product;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.directwebremoting.annotations.DataTransferObject;
import org.directwebremoting.annotations.RemoteProperty;

@Entity
@Table(name = "products")
@DataTransferObject(type="bean",javascript="productService")
public class Product {
	@RemoteProperty
	private Long id;
	@RemoteProperty
	private String description;
	@RemoteProperty
	private BigDecimal unitPrice;
	@RemoteProperty
	private BigDecimal discount;
	@RemoteProperty
	private BigDecimal total;
	@RemoteProperty
	private Long existence;
	@RemoteProperty
	private String urlImage;
	@RemoteProperty
	private Long idCategoria;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	
	public Long getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public BigDecimal getDiscount() {
		return discount;
	}
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public Long getExistence() {
		return existence;
	}
	public void setExistence(Long existence) {
		this.existence = existence;
	}
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
}
