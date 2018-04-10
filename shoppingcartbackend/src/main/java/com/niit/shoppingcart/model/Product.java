package com.niit.shoppingcart.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class Product  {
	@Id
	private String id;
	private String name;
	private String description;
	@ManyToOne
	@JoinColumn(name="CID")
	private Category categoryID;
	@ManyToOne
	@JoinColumn(name="SID")
	private Supplier supplierID;
	public String getId() {
		return id;
	}
	public void setId(String id) {		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Category getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(Category categoryID) {
		this.categoryID = categoryID;
	}
	public Supplier getSupplierID() {
		return supplierID;
	}
	public void setSupplierID(Supplier supplierID) {
		this.supplierID = supplierID;
	}
	 


}

	
	
	




