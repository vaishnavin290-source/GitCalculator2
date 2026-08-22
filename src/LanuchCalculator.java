import java.util.Scanner;
public class LanuchCalculator {


	public static void addition() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter first Number");
		int a= scan.nextInt();
		System.out.println("Enter second  Number");
		int b= scan.nextInt();
		int c=a+b;
		System.out.println(c);
		// TODO Auto-generated method stub

	}
	
	public static void substraction() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter first Number");
		int a= scan.nextInt();
		System.out.println("Enter second  Number");
		int b= scan.nextInt();
		int c=a-b;
		System.out.println(c);
		// TODO Auto-generated method stub

	}
	
	public static void multiplication() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter first Number");
		int a= scan.nextInt();
		System.out.println("Enter second  Number");
		int b= scan.nextInt();
		int c=a*b;
		System.out.println(c);
		// TODO Auto-generated method stub

	}
	public static void divison() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter first Number");
		int a= scan.nextInt();
		System.out.println("Enter second  Number");
		int b= scan.nextInt();
		int c=a/b;
		System.out.println(c);
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);

	    System.out.println("1. Addition");
	    System.out.println("2. Subtraction");
	    System.out.println("3. Multiplication");
	    System.out.println("4. Division");
	    System.out.print("Enter your choice: ");

	    int choice = scan.nextInt();

	    switch (choice) {
	        case 1:
	            addition();
	            break;

	        case 2:
	            substraction();
	            break;

	        case 3:
	            multiplication();
	            break;

	        case 4:
	            divison();
	            break;

	        default:
	            System.out.println("Invalid Choice");
	    }

	    
	}




}
