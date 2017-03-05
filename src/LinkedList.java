
public class LinkedList{

	private Node First = null;
	private Node Last = null;
	private int Size = 0;
	
	public boolean isEmpty(){
		return Size == 0;
	}
	
	public void add(Object data){
		Node n = new Node( data, null);
		if(isEmpty()){
			First = n;

		
		
		}
		else{ 
			Last.setNext(n);}
		//System.out.println(First.getNextNode());
		Last = n;
	
		Size++;
		
		
	}
	
	public void print(){
		Node p = First;
		
		while( p != null){
			
			System.out.println(p.getData());
		

			System.out.println(p.getNextNode());
			p = p.getNextNode();
		
			
		}
			
	}
	
	public void getSize(){
		System.out.println(Size);
	}
	

}
