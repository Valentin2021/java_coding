import java.util.Scanner;
public class user_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		System.out.println("Enter your age: ");
		Scanner scanAge= new Scanner(System.in);
		age= scanAge.nextInt();
		if(age<16) {
			System.out.println("Too young to join the club.");
		}else {
			System.out.println("Welcome to the JAVA coding club!");
	}}
}
