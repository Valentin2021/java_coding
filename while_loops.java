import java.util.Scanner;

public class while_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner scn = new Scanner(System.in);
		System.out.println("your number is: ");
		x = scn.nextInt();
			
		while(x>0) {
			System.out.println("decrement sequence for " + x + " is " + --x);
		}
		scn.close();
		System.out.println("Completed");
	}
}
