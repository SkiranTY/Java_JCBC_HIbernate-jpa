package com.tyss.tyhibernateapp.dto;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class EmployeeAddressInfo{
	
	@EmbeddedId
	private EmployeeAddressPk addressPk;
	@MapsId("id")
	@ManyToOne
	@JoinColumn(name="id")
	private EmployeeInfo info;
	@Column
	private String address1;
	@Column
	private String address2;
	@Column
	private String city;
	@Column
	private String  state;
	@Column
	private int pincode;
}
