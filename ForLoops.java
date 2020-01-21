import java.util.*;

public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		Scanner scn = new Scanner(System.in);
		System.out.println("your number is: ");
		x = scn.nextInt();
		
		for (int y=3; (x<=7); x+=2) {
			System.out.println(x);
		}
		scn.close();
		System.out.println("Completed");
	}

}
