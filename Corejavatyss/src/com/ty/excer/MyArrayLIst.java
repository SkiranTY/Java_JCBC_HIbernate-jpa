package com.ty.excer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayLIst<Student> implements List<Student> {

	Student s = (Student) new MyArrayLIst<Student>();
	Student s1 = (Student) new MyArrayLIst<Student>();

	MyArrayLIst<Student> myarr = new MyArrayLIst<Student>();
	MyArrayLIst<Student> myarr2 = new MyArrayLIst<Student>();

	@Override
	public boolean add(Student s) {
		boolean b = myarr.add(s);
		myarr2.add(s1);
		System.out.println("for add student s =" + b);
		return false;
	}

	@Override
	public void add(int arg0, Student arg1) {
		myarr.add(1, s1);
	}

	@Override
	public boolean addAll(Collection<? extends Student> arg0) {
		boolean b = myarr.addAll(myarr2);
		System.out.println("for addAll student =  " + b);
		return false;
	}

	@Override
	public boolean addAll(int arg0, Collection<? extends Student> arg1) {
		boolean b = myarr.addAll(1, myarr2);
		System.out.println("for addAll(int arg,collection) student s = " + b);
		return false;
	}

	@Override
	public void clear() {
		myarr.clear();
	}

	@Override
	public boolean contains(Object arg0) {
		boolean b = myarr.contains(s);
		System.out.println("for contains method of student s =" + b);
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		boolean b = myarr.containsAll(myarr);
		System.out.println("for containsAll(collection) method of student s =" + b);
		return false;
	}

	@Override
	public Student get(int arg0) {
		Student sget = myarr.get(1);
		System.out.println(sget);
		return s1;
	}

	@Override
	public int indexOf(Object arg0) {
		int index = myarr.indexOf(s);
		System.out.println("index of object is= " + index);
		return 0;
	}

	@Override
	public boolean isEmpty() {
		boolean b= myarr.isEmpty();
		System.out.println("isEmpty metod=" + b);
		return false;
	}

	@Override
	public Iterator<Student> iterator() {
		Iterator<Student> itr = myarr.iterator();
		 for(Student it: myarr)
		 System.out.println(it);
		return null;
	}

	@Override
	public int lastIndexOf(Object arg0) {
		int lastindex=myarr.lastIndexOf(s);
		System.out.println("last index is ="+ lastindex);
		return 0;
	}

	@Override
	public ListIterator<Student> listIterator() {
		ListIterator<Student> list= myarr.listIterator();
		for(Student li:myarr)
			System.out.println(li);
		return null;
	}

	@Override
	public ListIterator<Student> listIterator(int arg0) {
		myarr.listIterator(1);
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		boolean b=myarr.remove(s);
		System.out.println("remove method ="+ b);
		return false;
	}

	@Override
	public Student remove(int arg0) {
		Student getremove = myarr.remove(1);
		System.out.println("remove(int) method ="+ getremove);
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		boolean b= myarr.removeAll(myarr);
		System.out.println("removeAll method ="+ b);
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		boolean b= myarr.retainAll(myarr);
		System.out.println("retainAll method ="+ b);
		return false;
	}

	@Override
	public Student set(int arg0, Student arg1) {
		Student studset=myarr.set(1, s);
		System.out.println("remove method ="+ studset);
		return null;
	}

	@Override
	public int size() {
		int size = myarr.size();
		return 0;
	}

	@Override
	public List<Student> subList(int arg0, int arg1) {
		List<Student> sublist= myarr.subList(1, 3);
		System.out.println("sublist student ="+sublist);
		return null;
	}

	@Override
	public Object[] toArray() {
		myarr.toArray();
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		myarr.toArray();
		return null;
	}

}
