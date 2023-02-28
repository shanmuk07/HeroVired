package Oops;

class Chiru{
	int bankBalance = 1000;
	public void showProperties() {
		System.out.println("Rollce Royce");
	}
	public void showIdentity() {
		System.out.println("Mega Star");
	}
}
class Charan extends Chiru{
	int bankBalance = 500;
	public void showProperties() {
		super.showProperties();
		System.out.println("Ferrari");
	}
	public void showIdentity() {
		super.showIdentity();
		System.out.println("Mega Power Star");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Charan ch = new Charan();
		ch.showProperties();
		ch.showIdentity();
	}

}
