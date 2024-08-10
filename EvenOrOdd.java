package Demo;
import java.util.*;
public class EvenOrOdd {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a number");
	int num;
	num=sc.nextInt();
	
	if (num%2==0) {
		System.out.println("the number is an even number");
		
	}else {
		System.out.println("the number is a odd number");
		
	}
}
}
