package objects;
import java.io.FileReader;
public class testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      char[] buff = new char[100];
      try {
    	  FileReader FileRead =new FileReader("C:\\RIDE\\a.txt");
    	  FileRead.read(buff);
    	  System.out.println("DATA IN THE FILE:");
    	  System.out.println(buff);
    	  FileRead.close();
      }
      catch(Exception e){
    	  System.out.println("File not found");
    	  e.getStackTrace();
      }
	}

}
