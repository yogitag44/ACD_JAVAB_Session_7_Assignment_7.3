import java.util.Scanner; //Scanner Class to take input from user

public class CapacityDemo {   //Contain main class
	
	  public static void main(String args[ ] )    
	  {           
	     StringBuffer buffer = new StringBuffer(5) ;   //Defined the capacity of buffer   
	     
	    //initial capacity and length
	    System.out.println("buffer: capacity: "+buffer.capacity());    //Printing Capacity if the buffer
	    System.out.println("buffer: length: " + buffer.length());       //Printing Length of the buffer

//Appending new string to current buffer 
	    buffer.append("new STRING");  
	    //capacity after appending
	    System.out.println("\n ============Printing new capacity after appending the string===========");
	    System.out.println("buffer new capacity: " + buffer.capacity());   //changed capacity   
	    System.out.println("buffer new length: " + buffer.length());  		//changed length
	  }    
	
}
