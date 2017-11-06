
public class Component {
	
	
	private double speed = 0.0;
	private double maxSpeed = 20.0;
	
	public void setSpeed(double speed) {
		if (speed > maxSpeed) {
			this.speed = maxSpeed;
		} else {
			this.speed = speed;
		}
	}
	
	public double getSpeed() {
		return speed;
	}
}
