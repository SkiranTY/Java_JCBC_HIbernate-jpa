package com.tyss.tyhibernateapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class EmployeeAddressPk implements Serializable {

	private int id;
	@Column
	private String addrtype;
}
