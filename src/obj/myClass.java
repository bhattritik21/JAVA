package obj;
import java.util.Scanner;
public class myClass {
 
	public static void main(String[] args) {
		 int x, y;
		 Scanner myObj = new Scanner(System.in); 
		 System.out.println("Enter 1st number");
		 x = myObj.nextInt(); 
		 System.out.println("Enter 2nd number");
		y = myObj.nextInt();  	
		 System.out.println("Sum of 2 number  is: " +(x+y));
}
}