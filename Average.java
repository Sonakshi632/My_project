package Demo;
import java.util.*;
public class Average {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a,b,c,avg;
	System.out.println("enter the number a");
	a=sc.nextInt();
	System.out.println("enter the number b");
	b=sc.nextInt();
	System.out.println("enter the number c");
	c=sc.nextInt();
	avg=a+b+c/100;
	System.out.println("the average of the two numbers is"+avg);
}
}
