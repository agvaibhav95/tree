import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
//take queue and root to it and then iterate left child if
	//exist then call recursion for left half if not then recurse back 
	//recurse for right half
	
	//It can be called as BFS
	
	static class Node{
		Node left,right;
		int key;
		Node(int key){
			this.key=key;
			left=right=null;
		}
	}
 static void printLevelOrderTraversal(Node root) {
	 Queue<Node> queue=new LinkedList<Node>();
	 queue.add(root);
	 while(!queue.isEmpty()) {
		 Node tempnode=queue.poll();
		 System.out.println(tempnode.key);
		 if(tempnode.left != null) {
			 queue.add(tempnode.left);
		 }
		 
		 if(tempnode.right != null) {
			 queue.add(tempnode.right);
			 
		 } 
		 
		// printLevelOrderTraversal(tempnode);
	 }
	// printLevelOrderTraversal(tempnode.right);
 }
 public static void main(String[] args) {
	Node root =new Node(1);
	root.left=new Node(2);
	root.right=new Node(3);
	root.left.left=new Node(4);
	root.left.right=new Node(5);
	printLevelOrderTraversal(root);
	
}
}
