import java.util.*;
class CelsiusToFahrenheitConversion{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double input = sc.nextDouble();
		double convert = (input * 9/5) +32;
		System.out.println(convert);
	}
}