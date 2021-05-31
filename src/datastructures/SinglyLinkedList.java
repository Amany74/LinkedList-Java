
package datastructures;

class Node {
public int data ;
public Node next ;





public void DisplayNodeData() {
    System.out.println("{" + data + "}");
}

public int length(Node head ){
    Node temp = head ; // keda na bd2t mn 3nd al head 
     int count = 0;
    while (temp != null ) {
       // hna ana b3de 3ala nodes w kol mara azwd 1 
        temp = temp.next ;
        count++ ;
    }
    return count ;
    }
    
}

public class SinglyLinkedList {
    
    public Node head ;  // leh 3mlnaha private 
                                     // 34an yb2a awl addres llinked list ale bngeb mno ba2e al addresses bta3t al L.L m7d4 3arfo  5ales
    
    // metthod to check if  linkes list is empty or not 
    public boolean isEmpty() {
    return (head == null) ;  
    }

    public void setHead(Node head) {
        this.head = head;
    }

    
  
    
    // another add yo the last node method 
    public void addToTheLast(Node node) {

                    if (head == null) {
                            head = node;
                    } else {
                            Node temp = head;
                            while (temp.next != null)
                                    temp = temp.next;

                            temp.next = node;
                    }
            }

    
    
    
    // inserting an element in LL bm3na asa7 al element ale al address bta3o head
    public void insertFrist(int data ) {
          // lma negy n insert h n insert f new node yb2a we need to create a new node  
    Node newNode = new Node ();
    
    newNode.data = data ;
    newNode.next = head ;
    head = newNode ;
    }
//get to head 
    public Node getHead() {
        return head ;
    }
    
    
    
    // deleting a node from frist y3ne hms7 al node ale gmb al head  w htb2a al return type bta3ha node 34an btrg3 address al head
     // deleting to the node associated with head 
    //lazm return type ykon  Nodee 34an na hms7 node not just the data inside it
    public void deleteFrist ( ) {
            Node temp = head ;
            head = temp.next ;
    
            }
    
    // deleting an aelement after a particular element in  the Linked List 
     //lw b2a hnms7 node b3d node mo3inaaa 
        public void deleteafter(Node after) {
                  Node temp = head;
                  while (temp.next != null && temp.data != after.data) {
                          temp = temp.next;
                  }
                  if (temp.next != null)
                          temp.next = temp.next.next;
          }

    
       
    // inserting an element  mn al a5r  from last 
    // bbasata ale 3mlto ttb3t al nodes l7d a5r wa7da som defet new node bs keda
    public void insertlast (int data ) { 
    Node current = head ; // k pointer dlw2te wa2f 3ala al head y3ne  
    while (current.next  !=  null  ) { // m3naha eno m4 fady w mwslna4 l a5r element 
    current = current.next ;  
    }
    // b3d al loopp de yb2a kda wslt l 2a5r element ttb3toh 
   Node newNode = new Node();
    newNode.data = data;
    current.next = newNode;
        
}
 
    
    // displaying node data 
    public void  display () {
        Node n = head ;
        while (n != null ){
        System.out.println("{ " + n.data +"}" );
        n = n.next;
          
    }
        
    }
    
    // printing lements 
    public void printLinkedList() {
    System.out.println("Printing LinkedList (head --> last) ");
    Node current = head;
    while (current != null ) {
    current.DisplayNodeData();
    // w a5le al current ka pointer yt7rk 
        current = current.next ;
    }
    System.out.println();
    }
        
    //page 2 : find length of linked list  2 ways 1) iterative  2) by recursion 
    //iterative 
    public int length(Node head ){
    Node temp = head ; // keda na bd2t mn 3nd al head 
     int count = 0;
    while (temp != null ) {
       // hna ana b3de 3ala nodes w kol mara azwd 1 
        temp = temp.next ;
        count++ ;
    }
    return count ;
    }
    
    //by recursion 
    public int lengthOfLinkedListRec(Node head){
    Node temp = head ;
        if(temp == null)
            return 0 ;
        else 
            return ( 1 + lengthOfLinkedListRec(temp.next)) ;
        //to be USED needs a get for head 
    
 }
    // finding middle of linked list by 2 pointers 
    public int  mid () {
      Node slowptr  , fastptr ;
      slowptr = fastptr = head ;
    
      while (fastptr != null ){
      fastptr = fastptr.next ;
      
      if (fastptr != null && fastptr.next != null) {
          slowptr = slowptr.next;
          fastptr = fastptr.next ;
      }
      }
   
         return slowptr.data ;
      }
      
      
// middle   by knowing the length 
     public int   middle () {
      Node current = head ;
          int mid = length() /2 ;
      for (int i = 0 ; i < mid ; i ++) {
          current = current.next;
      }
      return current.data ;
      }
      
     
   
     
     
    public Node nthFromLastNode(int n)
	{
		Node firstPtr=head;
		Node secondPtr=head;
 
		for (int i = 0 ; i < n ; i++) {
			firstPtr=firstPtr.next;
 
		}
 if (n <= length()) {
		while(firstPtr!=null)
		{
			firstPtr=firstPtr.next;
			secondPtr=secondPtr.next;
		}
 
 }	return secondPtr;
	}
     
     
     // how to reverse a linkedList 
    
    public void reverse() {
        Node curr = head ;
          Node  prev= null ;
           Node next   = head.next ;

while (curr != null  ) {
    next = curr.next ; // to save next  .......
     curr.next = prev  ; // reverse 
     
    prev = curr ;
     curr = next ; // .......
     
}
   
display();
    }
     
    //make a loop
    public void createLoop  ( Node n ) {
    // n hia al node ale h t loop m3 last node 
            Node temp = head ;
            for (int i = 0 ; i < length() ;i++){
        temp = temp.next ;
            }
               temp = n.next;  
    }
      
    //detection if a loop exists 
        public boolean loop () {
       Node fastptr = head ;
       Node slowptr = head ;
       
       while (fastptr != null && fastptr.next != null ) {
           
       fastptr = fastptr.next.next ;
       slowptr = slowptr.next ;
       
       if (slowptr == fastptr ) 
       return true ;
       }
       return false ;
            }

        
        
        
//find intersectionbetweeen 2 linked lists 
            public  Node intersection (Node list1 , Node list2  ) {

        int l1 = length(list1 );
        int l2  = length(list1 );

        Node ptr1 = list1 ;
        
        Node ptr2 = list2 ;

       int difference ;

        if (l1 > l2 ){
          difference = l1 - l2 ;

            int i = 0;
                              while(i<difference){
                                      ptr1 = ptr1.next;
                                      i++;
                                }
          }
      else
          difference = l2 - l1 ;
      int i=0;
       while(i<difference){
        ptr2 = ptr2.next;
            i++;
         }

         while (ptr1 != null && ptr2 != null ) {
              if(ptr1 == ptr2)
            return ptr1;

        ptr1 = ptr1.next ;
        ptr2 = ptr2.next ;
                          
         }
                 return null ;         
                          
          }

        
        
        
        // another approach for checking if there is an intersection point beteween 2 lists
        
        public Node  inter(Node head1  , Node head2 ) {
        if(head1 == null  && head2 ==  null   )  return null ;
        
         Node firstptr = head1 ;
        Node secondptr = head2 ;
        
        while (firstptr != secondptr   ) {
        
            if(firstptr == null )
            firstptr = head2 ;
            else 
                firstptr = firstptr.next;
            
                  if(secondptr == null )
            secondptr = head1 ;
                  
                  
            else 
                secondptr = secondptr.next;
        
        }
            return firstptr ;
        }
        
        // function to reverse in pairs
        
      public  void  reverseLinkedListInPair() {

		 // Initialize previous and current pointers 
        Node prev = head; 
        Node curr = head.next; 
  
        head = curr; // Change head before proceeeding 
  
        // Traverse the list 
        while (true) { 
            Node temp = curr.next; 
            curr.next = prev; // Change next of current as previous node 
  
            // If next NULL or next is the last node 
            if (temp == null || temp.next == null) { 
                prev.next = temp; 
                break; 
            } 
  
            // Change temp of previous to next next 
            prev.next = temp.next; 
  
            // Update previous and curr 
            prev = temp; 
            curr = prev.next; 
        } 
       
    } 
  

            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}