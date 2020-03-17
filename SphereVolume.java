import java.util.Scanner;

public class SphereVolume {
	public static void main(String[] args) 
{ 
		// add your declaration and code here 
		
		Scanner userInput = new Scanner (System.in);
		System.out.println("Please enter the diameter of Sphere:");
		double sphereDiam = userInput.nextDouble();
		double sphereRadius = (sphereDiam / 2.0);
		double sphereVolume = (4.0/3) * Math.PI * Math.pow(sphereRadius, 3);
		System.out.println("The volume is " + sphereVolume);
		userInput.close();
} 
}
