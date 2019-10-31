package com.tyss.hotelbill.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Hotel_Bill {

	@Id
	@Column
	private int item_Code;
	@Column
	private String food_Name;
	@Column
	private double price;

	@Override
	public String toString() {
		return "Hotel_Bill [item_Code=" + item_Code + ", food_Name=" + food_Name + ", price=" + price + "]";
	}

	

	public int getItem_Code() {
		return item_Code;
	}

	public int setItem_Code(int item_Code) {
		return this.item_Code = item_Code;
	}

	public String getFood_Name() {
		return food_Name;
	}

	public void setFood_Name(String food_Name) {
		this.food_Name = food_Name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
