package com.dev.encapsulation;

public class Pets {

	@Override
	public String toString() {
		return "Pets [age=" + age + ", name=" + name + ", color=" + color + ", Breed=" + Breed + ", age1=" + age1
				+ ", name1=" + name1 + ", color1=" + color1 + ", age2=" + age2 + ", name2=" + name2 + ", type=" + type
				+ "]";
	}
	//For dogs
	private int age;
	private String name;
	private String color;
	private String Breed;
	
	//For cats
	private int age1;
	private String name1;
	private String color1;
	
	//For birds
	private int age2;
	private String name2;
	private String type;
	
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return Breed;
	}
	public void setBreed(String breed) {
		Breed = breed;
	}
	public int getAge1() {
		return age1;
	}
	public void setAge1(int age1) {
		this.age1 = age1;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getColor1() {
		return color1;
	}
	public void setColor1(String color1) {
		this.color1 = color1;
	}
	public int getAge2() {
		return age2;
	}
	public void setAge2(int age2) {
		this.age2 = age2;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
