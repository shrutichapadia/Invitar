package com.npu.cs501;

import java.lang.reflect.Type;

import javax.swing.tree.TreeNode;

public abstract class AbstractTree<E> implements Tree<E> {
	public void inorder(){}
	public void postorder(){}
	public void preorder(){}
	
	public boolean isEmpty(){
		return getSize()==0;
	}
	private int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
}
