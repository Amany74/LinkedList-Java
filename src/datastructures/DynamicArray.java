
package datastructures;
import java.util.*;
public class DynamicArray {
    int size ;
    int data [] ;
    // const 
    public DynamicArray (){
    size = 1; 
    data = new int [size  ];
    }
    
    // method getindex take index  and return element stored in that index
    public int getindex (int index ) {
    return data[index] ; 
    }
    
    //adding an element to the array 
    public void add (int num ){
    ensurecapacity(size+1) ;
        data[size++] = num ;
    }
    
    // method to ensure capacity of an array
    public void ensurecapacity (int mincapacity ) {
    int oldcapacity = data.length ;
      int newcapacity = 0 ;   
    if( mincapacity > oldcapacity )    
        newcapacity = oldcapacity * 2 ; 
        
    if (newcapacity  > mincapacity )
        newcapacity = oldcapacity ;
     
    data = Arrays.copyOf(data, newcapacity);
        
    }
    
    //get size off the array 
    public int getsize(){
    return data.length;
    }
}
