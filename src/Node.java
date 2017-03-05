
 public class Node {
	
	private Node Next;
	private Object Data;
	
	public Node(Object data, Node NextNode){
		this.Next = NextNode;
		this.Data = data;
	
		
	}
	
	public Object getData(){
		return Data;
	}
	
	public Node getNextNode(){
		return Next;
	}
	
	public void setNext(Node newNext){
		Next = newNext;
	
	;
	}
	
	
}