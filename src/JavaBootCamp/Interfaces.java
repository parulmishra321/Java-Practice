package JavaBootCamp;

interface Bicycle{
	int a = 45;
	void applyBrake(int decrement);
	void speedUp(int increment);
}

interface HornBicycle{
	int x = 5;
	void blowHorn1();
	void blowHorn2();
}

class AvonCycle implements Bicycle, HornBicycle{
	void blowHorn(){
		System.out.println("Pee Pee Poo Poo");
	}
	public void applyBrake(int decrement){
		System.out.println("Applying Brakes");
	}
	public void speedUp(int increment){
		System.out.println("Applying SpeedUP");
	}
	public void blowHorn1(){
		System.out.println("Pee pee pee pee");
	}
	public void blowHorn2(){
		System.out.println("Honk Honk Honk");
	}
}
public class Interfaces {
	public static void main(String[] args) {
		AvonCycle myCycle = new AvonCycle();
		myCycle.applyBrake(1);
		// You can create properties in Interfaces
		System.out.println(myCycle.a);
		System.out.println(myCycle.x);

		/*Cannot modify the properties in Interfaces as they are final
		 myCycle.a = 454;
		System.out.println(myCycle.a);*/

		myCycle.blowHorn1();
		myCycle.blowHorn2();
	}
}
