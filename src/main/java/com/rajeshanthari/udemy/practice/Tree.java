package com.rajeshanthari.udemy.practice;

public class Tree {
	private TreeNode root;

	public void insert(int value) {
		if (root == null) {
			root = new TreeNode(value);
		} else {
			root.insert(value);
		}
	}

	public void traversInOrder() {
		if (root != null) {
			root.traversInOrder();
		}
	}
	public void traversPreOrder() {
		if (root != null) {
			root.traversPreOrder();
		}
	}
	public void traversPostOrder() {
		if (root != null) {
			root.traversPostOrder();
		}
	}

	public TreeNode get(int value) {
		if (root != null) {
			return root.get(value);
		}
		return null;
	}

	public int min() {
		if (root != null) {
			return root.min();
		}
		return Integer.MIN_VALUE;
	}

	public int max() {
		if (root != null) {
			return root.max();
		}
		return Integer.MAX_VALUE;
	}

	public void delete(int value) {

		root = delete(root, value);
	}

	public TreeNode delete(TreeNode subTree, int value) {
		if (subTree == null) {
			return subTree;
		}
		if (value < subTree.getData()) {
			subTree.setLeftChild(delete(subTree.getLeftChild(), value));
		} else if (value > subTree.getData()) {
			subTree.setRightChild(delete(subTree.getRightChild(), value));
		} else {
			if (subTree.getLeftChild() == null) {
				return subTree.getRightChild();
			} else if (subTree.getRightChild() == null) {
				return subTree.getLeftChild();
			}

			subTree.setData(subTree.getRightChild().min());
			subTree.setRightChild(delete(subTree.getRightChild(), subTree.getData()));

		}
		return subTree;

	}

}

class TreeNode {
	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;

	public TreeNode(int data) {
		this.data = data;
		this.leftChild = null;
		this.rightChild = null;
	}

	public TreeNode get(int value) {
		if (value == data) {
			return this;
		}
		if (value < data) {
			if (leftChild != null) {
				return leftChild.get(value);
			}
		} else {
			if (rightChild != null) {
				return rightChild.get(value);
			}
		}
		return null;
	}

	public void insert(int value) {
		if (data == value) {
			return;
		}

		if (value < data) {
			if (leftChild == null) {
				leftChild = new TreeNode(value);
			} else {
				leftChild.insert(value);
			}
		}
		if (value > data) {
			if (rightChild == null) {
				rightChild = new TreeNode(value);
			} else {
				rightChild.insert(value);
			}
		}
	}

	public void traversInOrder() {
		if (leftChild != null) {
			leftChild.traversInOrder();
		}
		System.out.print(data + ",");
		if (rightChild != null) {
			rightChild.traversInOrder();
		}
	}

	public void traversPreOrder() {
		System.out.print(data + ",");
		if (leftChild != null) {
			leftChild.traversPreOrder();
		}
		if (rightChild != null) {
			rightChild.traversPreOrder();
		}
	}

	public void traversPostOrder() {
		if (leftChild != null) {
			leftChild.traversPostOrder();
		}
		if (rightChild != null) {
			rightChild.traversPostOrder();
		}
		System.out.print(data + ",");
	}

	public int min() {
		if (leftChild != null) {
			return leftChild.min();
		}
		return data;
	}

	public int max() {
		if (rightChild != null) {
			return rightChild.max();
		}
		return data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	@Override
	public String toString() {
		return "Data = " + data;
	}

}