package Demo;
import java.util.*;
public class NUMBEROFDAYSINAWEEK {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int week,totdays;
		System.out.println("enter the number of weeks");
		week=sc.nextInt();
		totdays=week*7;
		System.out.println("the total days are:"+totdays);
	}

}
