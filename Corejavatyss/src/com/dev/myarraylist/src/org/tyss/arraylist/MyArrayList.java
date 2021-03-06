package org.tyss.arraylist;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<E> implements List<E> {

	private MyArrayList<E> arrayList;
	private Object[] list;
	private int size;
	private int initialCapacity = 20;

	public MyArrayList() {
		list = new Object[initialCapacity];
		arrayList = this;
	}

	public MyArrayList(int initialCapacity) {
		this.initialCapacity = initialCapacity;
		list = new Object[initialCapacity];
		arrayList = this;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("MyArrayList [");
		for (int i = 0; i < size-1; i++) {
			sb.append(list[i] + ", ");
		}
		sb.append(list[size-1]);
		sb.append("]");
		return sb.toString();
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean contains(Object o) {
		for (Object object : list) {
			if (object.equals(o))
				return true;
		}
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		return new Itr();
	}

	@Override
	public Object[] toArray() {
		return list.clone();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return null;
	}

	@Override
	public boolean add(E e) {
		if (list.length == size) {
			resize();
		}
		list[size++] = e;
		return true;
	}

	private void resize() {
		Arrays.copyOf(list, list.length + 10);
	}

	@Override
	public boolean remove(Object o) {
		for (int i = 0; i < list.length; i++) {
			if (list[i].equals(o)) {
				System.arraycopy(list, 0, list, i - 1, list.length);
				System.arraycopy(list, i + 1, list, i, list.length);
				size--;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		for (Object object : c) {
			if (!contains(object)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		for (E e : c) {
			if (list.length == size) {
				resize();
			}
			list[size++] = e;
		}
		return true;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		if (size < index) {
			throw new MyArrayIndexOutOfBoundException(index);
		}
		Object[] temp = new Object[size + c.size()];
		int tempIndex = 0;
		for (int i = 0; i < index; i++) {
			temp[tempIndex++] = list[i];
		}
		for (E e : c) {
			temp[tempIndex++] = e;
		}
		for (int i = index; i < size; i++) {
			temp[tempIndex++] = list[i];
		}
		list = temp;
		return true;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		for (Object object : c) {
			if (contains(object)) {
				remove(object);
			}
		}
		return true;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		int index = 0;
		Object[] temp = new Object[c.size()];
		for (Object object : c) {
			if (contains(object)) {
				temp[index++] = object;
			}
		}
		for (int i = 0; i < temp.length; i++) {
			list[i] = temp[i];
		}
		size = index;
		return true;
	}

	@Override
	public void clear() {
		list = new Object[initialCapacity];
		size = 0;
	}

	@Override
	public E get(int index) {
		if (index > size) {

		}
		return (E) list[index];
	}

	@Override
	public E set(int index, E element) {
		if (index > size) {

		}
		E e = (E) list[index];
		list[index] = element;
		return e;
	}

	@Override
	public void add(int index, E element) {
		if (index > size) {

		}
		System.arraycopy(list, index, list, index + 1, list.length);
		list[index] = element;
		size++;
	}

	@Override
	public E remove(int index) {
		if (index > size) {

		}
		E e = (E) list[index];
		System.arraycopy(list, index + 1, list, index, list.length);
		return e;
	}

	@Override
	public int indexOf(Object o) {
		for (int i = 0; i < list.length; i++) {
			if (o.equals(list[i]))
				return i;
		}
		return -1;
	}

	@Override
	public int lastIndexOf(Object o) {
		for (int i = list.length; i > 0; i--) {
			if (o.equals(list[i]))
				return i;
		}
		return -1;
	}

	@Override
	public ListIterator<E> listIterator() {
		return new ListItr();
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		if(index>size){
			
		}
		return new ListItr(index);
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		return null;
	}
	private class Itr implements Iterator<E> {

		int index;
		@Override
		public boolean hasNext() {
			return index<size;
		}

		@Override
		public E next() {
			return (E)list[index++];
		}
	}
	private class ListItr extends Itr implements ListIterator<E>{

		public ListItr() {
		}
		public ListItr(int index){
			this.index = index;
		}
		@Override
		public boolean hasPrevious() {
			return index>0;
		}

		@Override
		public E previous() {
			return (E)list[index--];
		}

		@Override
		public int nextIndex() {
			return index+1;
		}

		@Override
		public int previousIndex() {
			return index-1;
		}

		@Override
		public void remove() {
			arrayList.remove(index);
		}

		@Override
		public void set(E e) {
			arrayList.set(index, e);
		}

		@Override
		public void add(E e) {
			arrayList.add(e);
		}
		
	}
}
