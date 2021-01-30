package test;

public class test1 {
	Node head;
	
	static class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        }
    }
	
	public void push(int new_data) 
	{ 
	    Node new_node = new Node(new_data); 
	  
	    new_node.next = head; 
	  
	    head = new_node; 
	} 
	
	public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+" "); 
            tnode = tnode.next; 
        } 
    } 
	
	public int getCount() 
	    { 
	        Node temp = head; 
	        int count = 0; 
	        while (temp != null) 
	        { 
	            count++; 
	            temp = temp.next; 
	        } 
	        return count; 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test1 list=new test1();
		
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		
		System.out.println(list.getCount());
		list.printList();
		
	}

}
