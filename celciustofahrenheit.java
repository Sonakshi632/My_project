package Demo;
import java.util.*;
public class celciustofahrenheit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float celsius,fahrenheit;
		System.out.println("enter the temperature in celsius");
		celsius=sc.nextFloat();
		fahrenheit= celsius*9/5+32;
		System.out.println("the temperature is"+fahrenheit);
		

	}
	

}
