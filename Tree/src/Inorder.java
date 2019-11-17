

public class Inorder {
	//left,root,right
static class Node{
	int key;
	Node left,right;
	Node(int key){
		this.key=key;
		left=right=null;
	}
}
static void InorderTravrsal(Node root) {
	 if(root.left != null) 
	 {
		 InorderTravrsal(root.left);
	 }
	 System.out.println(root.key);
	 if(root.right != null) {
		 InorderTravrsal(root.right);
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
	InorderTravrsal(root);
}
}
