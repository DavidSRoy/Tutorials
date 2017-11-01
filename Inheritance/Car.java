
public class Car extends Vehicle {
	String brand;
	String bumperSticker = "default bumper sticker";
	boolean lightOn = false;
	
	public Car(int seats, double maxSpeed, String brand) {
		super(seats, maxSpeed);
		this.brand = brand;
		
	}
	
	public void changeBumperSticker(String phrase) {
		this.bumperSticker = phrase; 
	}
	
	public boolean isLightOn() {
		return lightOn;
	}
	
	public void lightOn() {
		this.lightOn = true;
	}
	
	public void lightOff() {
		this.lightOn = false;
	}
	
}
