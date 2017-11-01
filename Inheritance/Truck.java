import java.util.ArrayList;

public class Truck extends Vehicle {
	ArrayList<String> contents = new ArrayList<String>();
	public Truck(double maxSpeed, String content) {
		super(2, maxSpeed);
		contents.add(content);
		
	}
	
	public void addContent(String content) {
		contents.add(content);
	}
	
	
	
}
