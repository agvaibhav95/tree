
public class Preorder {
static  class Node{
	int key;
	Node left,right;
	Node(int key){
		this.key=key;
		left=right=null;
	}
}
static void Preorder(Node root) {
	System.out.println(root.key);
	if(root.left != null) {
		Preorder(root.left);
	}
	if(root.right != null) {
		Preorder(root.right);
	}
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
	
	Preorder(root);
}
}
