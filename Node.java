package mylinked;

public class Node {
	private Object Data;
	private Node Next;
	
	public Node (Object data, Node n){
		this.Next = n;
		this.Data = data;
	}
	
	public void setNode(Node NewNode){
		Next = NewNode;
	}
	
	public Object getData(){
		return Data;
	}
	
	public Node getNode(){
		return Next;
	}
}	
