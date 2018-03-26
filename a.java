package list;

import javax.xml.soap.Node;

public class a {
	
		private Node header;
		
		private int size;
		
		public a() {
			
			header = new Node(null);
			size = 0;
			
		}
		
		
		
		private class Node{
			private Object data;
			
			private Node nextNode;
			
			Node(Object data){
				
				this.data = data;
				this.nextNode = null;
			}
		}
	
	public void InsertionFirst(Object data) {
		
		Node newNode = new Node(data);
		newNode.nextNode = header.nextNode;
		header.nextNode = newNode;
		
	}
	
	
public void Insertion(int index, Object data){
        
        if(index==0){
            InsertionFirst(data);
            return;
        }
        
        Node previous = getNode(index-1);
        Node next = previous.nextNode;
        
        Node newNode = new Node(data);
        previous.nextNode = newNode;
        newNode.nextNode = next;
        size++;
    }


private Node getNode(int index) {
	
	Node node = header.nextNode;
	for(int i = 0 ; i < index ; i++) {
		node = node.nextNode;
	}
	return node;
}




	
	}




