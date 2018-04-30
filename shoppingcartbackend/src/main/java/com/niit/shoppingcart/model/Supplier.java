package com.niit.shoppingcart.model;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.stereotype.Component;
@Component
@Entity
@Table
public class Supplier implements Serializable {
	@Id
	private String id;
	private String name;
	private String address;
	@OneToMany(targetEntity=Product.class,mappedBy="supplierID")
	private Set<Product> product;
	
	public Set<Product> getProduct() {
		return product;
	}
	public void setProduct(Set<Product> product) {
		this.product = product;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Supplier() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Supplier [id=" + id + ", name=" + name + ", address=" + address + ", product=" + product + "]";
	}
	
	
	}
	



