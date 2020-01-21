import java.util.Scanner;

public class ElseIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary = 123;
		Scanner cashScan= new Scanner(System.in);
		System.out.println("Salariul dorit: ");
		salary = cashScan.nextInt();
		if (salary<=0) {
			System.out.println("Error");
		}else if(salary <= 5000) {
			System.out.println("Too low.");
		}else if(salary <= 10000) {
			System.out.println("Welcome!");
		}else {
			System.out.println("Too high.");
		}
	}
}
