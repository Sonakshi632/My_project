package Demo;
import java.util.*;
public class KilometeresToMiles {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double kilometres,miles;
		System.out.println("enter the distance in kilometres");
		kilometres=sc.nextDouble();
		miles=kilometres*0.621371;
		System.out.println("the distance is"+miles);
		
		
	}

}
