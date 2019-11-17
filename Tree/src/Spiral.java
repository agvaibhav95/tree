import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Spiral {
// 1-2-3-5-4-6
	static class Node{
		Node left,right;
		int key;
		Node(int key){
			this.key=key;
			left=right=null;
		}
	}
	static void Spiral(Node root) {
		System.out.println(root.key);
		Deque<Node> queue=new LinkedList<Node>();
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
			if(tempnode.right.right != null) {
				queue.add(tempnode.right);
			}.
		}
		
	}
	public static void main(String[] args) {
		Node root =new Node(1);
		root.left =new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.left.right.left=new Node(6);
		}
}
