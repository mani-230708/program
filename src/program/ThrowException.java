package program;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ThrowException {

	public static void main(String[] args) {
		try {
			ShowException();
		}
		catch(ArithmeticException e) {
			System.out.println("exception from different function");
		}
		catch(InputMismatchException e1) {
			System.out.println("input is not valid");
			
		}
		catch(NegativeArraySizeException e3) {
			System.out.println("array size cannot be negative");
		}
		catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("specified index is out of range");
		}
		catch(Exception e5) {
			System.out.println("exception handled in generic method");
		}
	}
		static void ShowException() {
			try {
				Scanner sc=new Scanner(System.in);
				System.out.println("division operations");
				System.out.println("enter the numerator");
				int num=sc.nextInt();
				System.out.println("enter the denominator");
				int den=sc.nextInt();
				int res=num/den;
				System.out.println(res);
				System.out.println("array operation");
				System.out.println("enter the array size");
				int n=sc.nextInt();
				int arr[]=new int[n];
				System.out.println("enter position number");
				int pos=sc.nextInt();
				System.out.println("enter the value to be added");
				int val=sc.nextInt();
				arr[pos]=val;
				System.out.println("data added");
			}
			catch(ArithmeticException e) {
				throw e;
			}
			catch(InputMismatchException e1) {
				throw e1;
			}
			catch(NegativeArraySizeException e3) {
				throw e3;
			}
			catch(ArrayIndexOutOfBoundsException e4) {
				throw e4;
			}
			catch(Exception e5) {
				throw e5;
			}
		}
}
