package objects;

public class factorial {
	public void fun() {
		System.out.println("This is imported Package");
	}
	public int fact(int n) {
		if(n==1) {
			return 1;
		}
		return n*fact(n-1);
	}
}