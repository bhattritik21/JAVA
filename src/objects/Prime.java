package objects;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		 int i =0;
	     int num =0;
	       
	       for (i = 1; i <= 50; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		         {  if(i%num==0)
		            {counter = counter + 1;
		          }
		   }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		    
		     System.out.println(i);
		  }	
	       }	
	      
	       
	   }

}
