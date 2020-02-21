import java.util.Scanner;

public class UserInformation{
	public static void main(String[] args) {
		String name;
		int age;
		Scanner data = new Scanner(System.in);
		System.out.println("What is your name?");
		name = data.nextLine();
		System.out.println("How old are you?");
		age = data.nextInt();
		System.out.println("Your name is "+name+" and you are "+age+" years old");
	}
}