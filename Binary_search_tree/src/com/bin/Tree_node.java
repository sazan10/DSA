package com.bin;
import java.util.HashSet;
import java.util.Set;

public class Tree_node {

	private Integer data;
	private Tree_node left_child;
	private Tree_node right_child;
	private boolean isDeleted=false;
	private Set <Integer> left = new HashSet<>();
	private Set <Integer> right = new HashSet<>();
	Tree_node(Integer i) {
		this.data = i;
	}

	public Tree_node getLeft_child() {
		return left_child;
	}

	public void setLeft_child(Tree_node left_child) {
		this.left_child = left_child;
	}
	public Integer smallest()
	{
		if(this.left_child==null)
		 return this.data;
		return this.left_child.smallest();
		
	}
	public Integer largest()
	{
		if(this.right_child==null)
		 return this.data;
		return this.right_child.largest();
		
	}

	public Tree_node find(Integer data) {
		if (this.data == data && !isDeleted)
			return this;
		if (data < this.data && left_child != null)
			return left_child.find(data);
		if (right_child != null)
			return right_child.find(data);
		return null;
	}

	public void insert(Integer data) {
	
		if (data >= this.data) {
			if (this.right_child == null)
				this.right_child = new Tree_node(data);
			else
				this.right_child.insert(data);
		
				
		}
		else {if(this.left_child == null)
				this.left_child = new Tree_node(data);
			else
				this.left_child.insert(data);
		
		}
		try {
		if(!right.contains(this.data))
			System.out.println("The right child of " + this.data + " is " + this.right_child.getData());
		right.add(this.data);
		} catch (Exception NullPointerException) {
		}
		try {
			if(!left.contains(this.data))
			System.out.println("The left child of " + this.data + " is " + this.left_child.getData());
		left.add(this.data);
		} catch (Exception NullPointerException) {
		}
	}

	public Integer getData() {
		return this.data;
	}
	

	public Tree_node getRight_child() {
		return right_child;
	}

	public void setRight_child(Tree_node right_child) {
		this.right_child = right_child;
	}
	public void delete()
	{
		this.isDeleted=true;
	}
	public boolean isDeleted()
	{
		return isDeleted;
	}

}
