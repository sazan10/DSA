package com.bin;

public class Binary_search_tree {
	private Tree_node root;

	public void insert(Integer data) {
		if (root == null) {
			this.root = new Tree_node(data);

		} else
			root.insert(data);

	}

	public Tree_node find(Integer data) {
		if (root != null)
			return root.find(data);
		return null;

	}

//	public void delete(Integer data) {
//		Tree_node current = this.root;
//		Tree_node parent = this.root;
//		boolean isLeftChild = false;
//		if (current == null) {
//			current = root;
//		}
//		while (current != null && current.getData() != data) {
//			parent = current;
//			if (data < current.getData()) {
//				current = current.getLeft_child();
//				isLeftChild = true;
//			} else {
//				current = current.getRight_child();
//				isLeftChild = false;
//			}
//			if (current == null) {
//				return;
//			}
//
//			if (current.getLeft_child() == null && current.getRight_child() == null) {
//				if (current == root) {
//					root = null;
//				} else {
//					if (isLeftChild)
//						parent.setLeft_child(null);
//					else
//						parent.setRight_child(null);
//				}
//			} else if (current.getLeft_child() == null) {
//				if (current == root) {
//					root = current.getRight_child();
//				} else if (isLeftChild) {
//					parent.setRight_child(current.getRight_child());
//				} else
//					parent.setRight_child(current.getLeft_child());
//			}
//
//			else if (current.getRight_child() == null) {
//				if (current == root) {
//					root = current.getLeft_child();
//				} else if (isLeftChild) {
//					parent.setRight_child(current.getRight_child());
//				} else
//					parent.setRight_child(current.getLeft_child());
//			}
//		}
//	}
	public void delete(Integer data)
	{
		Tree_node toDel=find(data);
		toDel.delete();
	}
}
