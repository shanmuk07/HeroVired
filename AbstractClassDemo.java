package Oops;
import java.util.*;
abstract class Vehicle{
	public abstract int getWheels();
	public abstract int getSeats();
}

class Bike extends Vehicle{
	public int getWheels() {
		return 2;
	}

	public int getSeats() {
		
		return 2;
	}
}

class Auto extends Vehicle{
	public int getWheels() {
		return 3;
	}

	public int getSeats() {
		
		return 4;
	}
}

class Car extends Vehicle{
	public int getWheels() {
		return 4;
	}

	public int getSeats() {
		
		return 5;
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v;
		int w, c;
		System.out.println("========================================");
		v = new Bike();
		c=v.getSeats();
		w=v.getWheels();
		System.out.println("Bike");
		System.out.println("No of Wheels: "+w);
		System.out.println("Seating Capacity: "+c);
		System.out.println("========================================");
		
		v = new Auto();
		c=v.getSeats();
		w=v.getWheels();
		System.out.println("Auto");
		System.out.println("No of Wheels: "+w);
		System.out.println("Seating Capacity: "+c);
		System.out.println("========================================");
		
		v = new Car();
		c=v.getSeats();
		w=v.getWheels();
		System.out.println("Car");
		System.out.println("No of Wheels: "+w);
		System.out.println("Seating Capacity: "+c);
		System.out.println("========================================");
	}

}
