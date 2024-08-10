package Demo;
import java.util.*;
public class TotalSalary {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int hrwage,towork,totalsal;
	System.out.println("enter the hourly wage");
	hrwage=sc.nextInt();
	System.out.println("total hours of work");
	towork=sc.nextInt();
	totalsal=hrwage*towork;
	System.out.println("the totalsal is:"+totalsal);
}
}
