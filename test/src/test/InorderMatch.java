package test;

import java.util.Stack;

public class InorderMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// private void inOrder(Node root){
	// if(root == null){
	// return;
	// }
	// inOrder(root.left());
	// root.visit();
	// inOrder(root.right());
	// }

	public boolean inorderMatch(Node root1, Node root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 == null || root2 == null) {
			return false;
		}
		Stack<Node> st1 = new Stack<Node>();
		Stack<Node> st2 = new Stack<Node>();
		st1.push(root1);
		st2.push(root2);
		while (true) {
			while (root1 != null && root2 != null) {
				if (root1.getLeft() != null) {
					st1.push(root1.getLeft());
				}
				if (root2.getLeft() != null) {
					st2.push(root2.getLeft());
				}
				root1 = root1.getLeft();
				root2 = root2.getLeft();
			}

			if (root1 == null && root2 == null) {
				if (st1.isEmpty() && st2.isEmpty()) {
					break;
				}
				root1 = st1.pop().getRight();
				root2 = st2.pop().getRight();
			} else {
				return false;
			}
		}

		return true;
	}

	class Node {
		Node left, right;

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

	}

}
