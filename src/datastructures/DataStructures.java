
package datastructures;


public class DataStructures {

                public static void main(String[] args) {


                    DoublyLinkedList l = new DoublyLinkedList ();
                    
                    l.insertFrist(10);
                    l.insertLast(20);
                    l.insertLast(30);
                    l.insertLast(40);
                    l.insertLast(50);
                   l.insertLast(60);
                   l.insertLast(70);
                   
                   l.Display();
                    System.out.println("-------------");
                   l.DisplayBack();
                     System.out.println("-------------");
                   node n = new node ();
                   n.data = 40 ;
                   l.deleteAfter(n);
                    l.Display();
                   /*
                           
// loop example 
       SinglyLinkedList   list2 = new SinglyLinkedList(); 
           Node head2 = new Node ();
             list2.setHead(head2);
             list2.insertlast(7);
             list2.insertlast(5);
             list2.addToTheLast(node );
                list2.addToTheLast(node2 );
 
                    Node  result = list1.inter(head1, head2);
                        if(  result  == null)
                        {
                                System.out.println("Two linked lists do not intersect!!");
                        }
                        else
                        {
                                System.out.println("Intersecting node: "+ result.data);
                        }
                }

                
                // reversing a linked list in pairs
                public static Node reverseLinkedListInPairItr(Node head) {
 
            Node current=head;
            Node prev=null;
            Node newHead =null;
            while (current != null && current.next != null) {

                    if (prev != null) {
                            // This is important step
                            prev.next.next = current.next;
                    }
                    prev=current.next; 
                    current.next=prev.next;
                    prev.next=current;

                    if (newHead == null)
                            newHead = prev;
                    current=current.next;

            } 
            return newHead;
    }

        */        
                }}
