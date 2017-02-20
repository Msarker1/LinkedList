package mylinked;

public class LinkedList {
	private Node First = null;
	private Node Last = null;
	private int Size = 0;
	
	
	
	
	public void Add(Object n){
		Node node = new Node(n, null);

		if(isEmpty())
			First = node;
		
		else 
			Last.setNode(node);
		Last = node; 	/// Crucial bc the last and first node are pointing to same node then last node changes the ref to another node and the first node goes from null to that change
	
		Size++;
	}
	
	public void print(){
		Node node = First;
		while(node != null){
			System.out.println(node.getData());
			node = node.getNode();// this works bc the first node has a ref to a another node and when you set it equal it goes to that node and prints data;
			System.out.println(node);
		}
	}
	
	
	
	public boolean isEmpty(){
		return Size == 0;
		
	}
}
