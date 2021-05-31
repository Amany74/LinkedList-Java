/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author Amany
 */
public class Stack {
    // instance variables while creating stack
    int Stack[] ;
    int top ;
    
    public Stack (){
        // 7atena size ll array
        Stack  = new int [10];
        // 3ltol top = -1
    top = -1 ;
    
    }
    
    // lw 3aiza a5od al size mn  user a3ml const bya5od size
    public Stack(int size ){
        Stack = new int [size] ;
    
    }
    
    
    // metod isFull to check if stack is empty
    public boolean isFull (){
    if ( top == Stack.length - 1 ) 
        return true ;
    else 
        return false ;
    }
    
    
    // is empty method to check if stack is empty
    public boolean isEmpty ( ) {
    if (top == -1 ) 
        return true ;
    else 
        return false ;
    }
    
    
    // creating push method to push elements in the stack w bta5od al element ale ht3mlo push 
    public void push (int x ) { 
    
        if( !(isFull())) {
    top ++ ;
    Stack[top ] = x ;
        }
        else 
            System.out.println("stack is full Sorryy ");
  
    }
        
        // pop to remove and return element from Stack 
        public int pop () {
        int x ;
                if (!(isEmpty())){
                x = Stack[top];
                top -- ;
                return x ;
                }
                else{ 
                    System.out.println("Stack is Empty Sorry ");
                    return -1 ; 
                }
        }
        
       // method to get max in Stack  
       public int getMax (){ 
        // pop ale hoa blnsbali awl element fl stack 
        int max = pop();
        // h3ml loop tol ma al stack m4 empty 
        while (!isEmpty() ) {
        int x = pop();
        if(max < x)  max = x ;   //  dah m3nah x akbar 
            }
        return max ;
       }
       
       // peek method to get element without removing it 
       public int peek () {
         if (!isEmpty()){
           
       return Stack[top ];
 }
       else 
             return 0 ;
       }
       
        
        //method to get average 
public double getAvg (){
    int sum = 0 ; 
    
    for (int i = 0 ; i < 5 ; i++) {
    
    sum += Stack[i]; 
          
    
//    while (!isEmpty()) {
//    sum  += peek() ;
//  top--;
  }
   return (sum  ) / (Stack.length ) ; 
 
}




}
