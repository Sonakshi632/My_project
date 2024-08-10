package Demo;
import java.util.*;
public class program10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("enter a number");
	num=sc.nextInt();
	if (num>0) {
		System.out.println("the number is positive");
		
	}else {
		System.out.println("the number is negative");
		if (num==0) {
			System.out.println("the number is zero");
		}
	}
	
}

}
