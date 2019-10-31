package com.tyss.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Pencilbox {

	@Id
	@Column
	private int boxid;
	@Column
	private String boxname;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "boxid",nullable = false)
	List<Pencils> pencils;

	public int getBoxid() {
		return boxid;
	}

	public void setBoxid(int boxid) {
		this.boxid = boxid;
	}

	public String getBoxname() {
		return boxname;
	}

	public void setBoxname(String boxname) {
		this.boxname = boxname;
	}

	public List<Pencils> getPencils() {
		return pencils;
	}

	public void setPencils(List<Pencils> pencils) {
		this.pencils = pencils;
	}

}
