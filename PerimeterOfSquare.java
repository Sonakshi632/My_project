package Demo;
import java.util.*;
public class PerimeterOfSquare {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a,per;
		System.out.println("enter the side of a square");
		a=sc.nextInt();
		per=4*a;
		System.out.println("the perimeter is:"+per);
	}

}
