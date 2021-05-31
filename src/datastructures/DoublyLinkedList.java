package datastructures;

class  node {
public int data;
public node next;
public node prev;
 
	public void displayNodeData() {
		System.out.print("{ " + data + " } " + "\t");
	}
}



public class DoublyLinkedList {
    
 public node head;
public node tail;
int size;
    
    
    public boolean isEmpty() {
    return (head == null );
    }
    
    
    // inserting an element make it as head or its already a frist node ever
    public void insertFrist (int data )
    {
        node  newNode = new node  ();
        newNode .data = data ;
        newNode.next = head ;
        newNode.prev = null ;
        if(head != null )   {
            // 34an law feh node mkan al head 2abl kda 
            head.prev =newNode ;
        }
        head = newNode ;
        
        
        if(tail == null )    {  tail = newNode ;  }
        size ++ ;
    }
    
    // used to insert a node at the start of linked list
            public void insertLast(int data) {
                    node newNode = new node();
                    newNode.data = data;
                    newNode.next = null;
                    newNode.prev=tail;
                    if(tail!=null)
                            tail.next=newNode;
                    tail = newNode;
                    if(head==null)
                            head=newNode;
                    size++;
            }

    
   // used to delete node from start of Doubly linked list
    public node deleteFirst() {
        
    if(size == 0 ) 
    throw new RuntimeException ("oops ! linked list is already Empty ");
    
    node temp = head ;
    head = head.next ;  //hoop n2alet al head 5las al link etkasr 
    head.prev = null ;
    size -- ;
    return temp ;
            }
    
    // delete after a particular node 
    public void deleteAfter (node After) {
    node temp = head ;
    
    while (temp.next != null && temp.data != After.data ) {
    temp = temp.next ;
    }
    if(temp.next != null )      (  (  temp.next )   .next )  .prev = temp ;
    
    temp.next = temp.next.next ;
    
    }
    
    // For printing Doubly Linked List forward
	public void Display() {
		System.out.println("Printing Doubly LinkedList (head --> tail) ");
		node current = head;
		while (current != null) {
			current.displayNodeData();
			current = current.next;
		}
		
	}
 
    	// For printing Doubly Linked List forward
	public void DisplayBack () {
		System.out.println("Printing Doubly LinkedList (tail --> head) ");
		node current = tail;
		while (current != null) {
			current.displayNodeData();
			current = current.prev;
		}
		System.out.println();
	}
}
    
}
