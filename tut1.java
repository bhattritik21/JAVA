import java.util.Scanner;

public class tut1 {

	public static void main(String[] args) {
		
     int sum=0;
     
      byte[] numArray;
      Scanner sc = new Scanner(System.in);
      numArray = new byte[5];
     for(int i = 0; i<5; i++) {
    	 	System.out.println("Enter num " + i + " =\t");
    	 	numArray[i] =  sc.nextByte();
     }
     sc.close();
     for(int i =0 ;i<5; i++) {
    	 sum+=numArray[i];
     }
     System.out.println("Sum is " + sum);    
	}

}
