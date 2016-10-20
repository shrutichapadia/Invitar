package com.npu.cs501;

public interface Tree<E> extends Iterable<E> {

	public boolean search(E e);
	public boolean insert(E e);
}
