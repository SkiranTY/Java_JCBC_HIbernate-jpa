package com.tyss.flipkart.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product_info {

	@Id
	@Column
	private int product_id;
	@Column
	private String Product_name;
	@Column
	private String Product_color;
	@Column
	private double Product_cost;
	@Column
	private String Description;

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return Product_name;
	}

	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}

	public String getProduct_color() {
		return Product_color;
	}

	public void setProduct_color(String product_color) {
		Product_color = product_color;
	}

	public double getProduct_cost() {
		return Product_cost;
	}

	public void setProduct_cost(double product_cost) {
		Product_cost = product_cost;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

}
