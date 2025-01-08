import java.util.*;
class VolumeOfACylinder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		double height = sc.nextDouble();
		double volume = Math.PI * Math.pow(radius,2) * height;
		System.out.println(volume);
	}
}