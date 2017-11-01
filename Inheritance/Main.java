import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Vehicle myMobile = new Vehicle(2,15.0);
		Car benz = new Car(4,120.5, "Mercedes Benz");
		Truck bigRig = new Truck(100.0, "beef");
		
		System.out.println("myMobile has " + myMobile.seats + " seats.");
		System.out.println("Speed:"+ myMobile.getSpeed());
		
		myMobile.setSpeed(10.0);
		
		System.out.println("New speed: " + myMobile.getSpeed());
		
		myMobile.setSpeed(50.0);
		
		System.out.println("New speed: " + myMobile.getSpeed());
		
		System.out.println(benz.maxSpeed);
		
		
		benz.changeBumperSticker("I <3 Java!");
		
		System.out.println("Brand" + benz.brand);
		System.out.println("Lights on" + benz.isLightOn());
		System.out.println("BumperSticker: \"" + benz.bumperSticker + "\"");
		
		benz.setSpeed(100.7);
		
		System.out.println("New speed: " + benz.getSpeed());
		
		benz.stop();
		
		System.out.println("New speed: " + benz.getSpeed());
		
		benz.lightOn();
		System.out.println("Lights on: " + benz.isLightOn());
		
		bigRig.addContent("eggs");
		bigRig.addContent("Fridge");
		bigRig.addContent("Shelves");
		bigRig.addContent("Celery");
		bigRig.addContent("Carrots");
		bigRig.addContent("junk");
		
		
		System.out.println("Truck contents: " + bigRig.contents);
		
		

	}
}
