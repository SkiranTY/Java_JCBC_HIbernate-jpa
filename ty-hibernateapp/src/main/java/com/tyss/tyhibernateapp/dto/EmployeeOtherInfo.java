package com.tyss.tyhibernateapp.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_other_info")
public class EmployeeOtherInfo {

	@Id
	private int id;
	@MapsId
	@OneToOne
	@JoinColumn(name="id")
	private EmployeeInfo info;
	@Column
	private String password;
	@Column
	private Date doj;
	@Column(name="contact_no")
	private long contactNo;
}
