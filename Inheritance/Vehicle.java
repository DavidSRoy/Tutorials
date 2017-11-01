
public class Vehicle {
	double maxSpeed; //Speeds in miles per hour
	double speed = 0.0;
	int seats;
	
	
	
	public Vehicle(int seats, double maxSpeed) {
		this.seats = seats;
		this.maxSpeed = maxSpeed;
	}
	
	public void setSpeed(double speed) {
		if (speed <= this.maxSpeed) {
			this.speed = speed;
		} else {
			this.speed = maxSpeed;
		}
	}
	
	public double getSpeed() {
		return this.speed;
	}
	
	public void stop() {
		this.speed = 0.0;
	}
	
	
}
