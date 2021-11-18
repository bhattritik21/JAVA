package objects;
class Player {
	int x=0;
	void display() {
		System.out.println(" Player rank:" + x );  
	}
}
class Cricket_player extends Player{
	int c=1;
	void display() {
		System.out.println("Football Player rank:" + c );  
	}
}
class Football_player extends Player{
	int d=2;
	void display() {
		System.out.println("Cricket Player rank:" + d ); 
	}
}
class Hockey_player extends Player{
	int h=3;
	void display() {
		System.out.println("Hockey Player rank:" + h );  
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Football_player p=new Football_player();  
		Cricket_player c=new Cricket_player();  
		Hockey_player h=new Hockey_player(); 	
		c.display();
		p.display();
		h.display(); 	   
	}
}
