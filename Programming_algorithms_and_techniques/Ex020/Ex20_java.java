//Given three numbers, print them in ascending order.
import java.util.Scanner;

public class Ex20_java{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		System.out.print("Enter the first number: ");
		n1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		n2 = sc.nextInt();
		System.out.print("Enter the third number: ");
		n3 = sc.nextInt();
		if(n1==n2||n1==n3||n2==n3){
			System.out.print("The same number.Try again with different numbers");
		}
		else{
			if(n1>n2 && n1>n3){
				if(n2>n3){
					System.out.print("Ascending order is "+n1+">"+n2+">"+n3);
				}
				else{
					System.out.print("Ascending order is "+n1+">"+n3+">"+n2);	
				}
			}
			if(n2>n1 && n2>n3){
				if(n1>n3){
					System.out.print("Ascending order is "+n2+">"+n1+">"+n3);
				}
				else{
					System.out.print("Ascending order is "+n2+">"+n3+">"+n1);
				}
			}
			if(n3>n1 && n3>n2){
				if(n1>n2){
					System.out.print("Ascending order is "+n3+">"+n1+">"+n2);
				}
				else{
					System.out.print("Ascending order is "+n3+">"+n2+">"+n1);
				}
			}
		}
		
	}
}