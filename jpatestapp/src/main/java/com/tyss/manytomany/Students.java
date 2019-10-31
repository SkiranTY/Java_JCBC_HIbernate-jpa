package com.tyss.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="student_info")
public class Students {

	@Id
	@Column
	private int sid;
	@Column
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="student_comb",joinColumns = @JoinColumn(name="sid"),
	inverseJoinColumns = @JoinColumn(name="cid"))
	List<Courses> courses;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}
	
}
