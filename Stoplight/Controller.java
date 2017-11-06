
public class Controller {
	
	public Controller() {
		
	}
	public int i = 1;
	public double speed = 0;
	public void update() {
		Vision vision = new Vision();
		Component component = new Component();
		i++;
		
		component.setSpeed(i);
		speed = component.getSpeed();
		
		
	}
}
