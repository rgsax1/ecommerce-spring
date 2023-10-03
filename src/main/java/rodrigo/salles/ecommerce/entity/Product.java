package rodrigo.salles.ecommerce.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class Product {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToAny
	@JoinColumn(name = "category_id", nullable = false)
	private ProductCategory category;
	
	
	@Column
	private String sku;
	
	@Column
	private String name;
	
	@Column
	private String description;
	
	@Column (name = "unit_price")
	private BigDecimal unitPrice;
	
	@Column (name = "image_url")
	private String image_url;
	private boolean active;
	private int unitsInStock;
	
	@CreationTimestamp
	private Date dateCreated;
	
	@UpdateTimestamp
	private Date lastUpdated;
	
	
}
