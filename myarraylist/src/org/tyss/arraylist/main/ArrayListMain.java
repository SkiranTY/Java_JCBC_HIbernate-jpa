package org.tyss.arraylist.main;

import org.tyss.arraylist.MyArrayList;

public class ArrayListMain {
	public static void main(String[] args) {
		MyArrayList<Object> list = new MyArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		for (Object object : list) {
			System.out.println(object);
		}
		System.out.println();
		System.out.println(list.size());
		list.clear();
		System.out.println();
		System.out.println(list.size());
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
