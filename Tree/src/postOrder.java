

public class postOrder {
	static class Node{
		Node left,right;
		int key;
		Node(int key){
			this.key=key;
			left=right=null;
		}
	}
	static void postOrder(Node root) {
		if(root.left !=null) {
			postOrder(root.left);
			
		}
		if(root.right != null) {
			postOrder(root.right);
		}
		System.out.println(root.key);
	}
	public static void main(String[] args) {
		Node root =new Node(1);
		root.left=new Node(2);
		root.left.right=new Node(5);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.right.right=new Node(6);
		root.left.left.left=new Node(7);
		root.right.right.right=new Node(8);
		root.left.left.left.right=new Node(9);
		
		postOrder(root);
	}

}
