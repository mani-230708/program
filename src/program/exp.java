package program;
class mylove extends Exception{
	public mylove(String s) {
		super(s);
	}
}
class mylove1 extends Exception{
	public mylove1(String s1) {
		super(s1);
	}
}

public class exp {

	public static void main(String[] args) {
		try {
			throw new mylove("New Exception");
		}
		catch(mylove ex) {
			System.out.println("Exception caught");
			System.out.println(ex.getMessage());
		}
		try {
			throw new mylove1("New Exception");
		}
		catch(mylove1 ex1) {
			System.out.println("Exception caught");
			System.out.println(ex1.getMessage());
		}
	}

}
