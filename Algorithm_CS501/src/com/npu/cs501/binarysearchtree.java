package com.npu.cs501;

import java.util.Iterator;
import java.util.List;
import java.lang.*;

public class binarysearchtree <E extends Comparable<E>, root> extends AbstractTree<E> {
	public TreeNode<E> root;
	protected int size =0;
		
	public binarysearchtree(){}
	public binarysearchtree(E[] objects){
		for(int i=0; i<objects.length; i++){
			insert(objects[i]);
		}
	}
		public boolean search(E e){
			TreeNode<E> current = root;
			while(current !=null){
				if(e.compareTo(current.element) <0){
					current = current.left;
				} else if(e.compareTo(current.element) >0){
					current = current.right;
				} else return true;
			}
			return false;}

	public boolean insert(E e){
			if(root == null){
				root = createNewNode(e);
			}else{
				TreeNode<E> parent = null;
				TreeNode<E> current = root;
				while(current !=null){
					if(e.compareTo(current.element)<0){
						parent = current;
						current = current.left;
					} else if(e.compareTo(current.element)>0){
						parent = current;
						current = current.right;
					} else return false;
				}
				if(e.compareTo(parent.element)<0){
					parent.left = createNewNode(e);
					
				} else parent.right = createNewNode(e);
			}
			size++;
			return true;
		}
	protected TreeNode<E> createNewNode(E e){
		return new TreeNode<>(e);
	}
	
	public void inorder(){
		inorder(root);
		
	}
	protected void inorder(TreeNode<E> root){
		if(root ==null) return;
		inorder(root.left);
		System.out.println(root.element + " ");
		inorder(root.right);
		
	}
	public void postorder(){
		postorder(root);
	}
	protected void postorder(TreeNode<E> root){
		if(root == null) return;
		preorder(root.left);
		preorder(root.right);
		System.out.println(root.element + " ");
		
		
	}
	public void preorder(){
		preorder(root);
	}
	protected void preorder(TreeNode<E> root){
		if(root == null) return;
		System.out.println(root.element + " ");
		
		postorder(root.left);
		postorder(root.right);
		
		
		
	}
	


	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		binarysearchtree idtree = new binarysearchtree<>();
		idtree.insert("1");
		idtree.insert("5");
		idtree.insert("5");
		idtree.insert("7");
		idtree.insert("4");
		
	
		System.out.println("Inorder (Sorted):");
		idtree.inorder();
		System.out.println("Preorder :");
		idtree.preorder();
		System.out.println("Postorder :");
		idtree.postorder();

	}
}
