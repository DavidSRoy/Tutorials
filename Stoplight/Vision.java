import java.awt.Color;

public class Vision {
	private Color color = Color.RED;
	private double speedLimit = 0.0;
	
	public static Color findColor() {
		int x = (int) (Math.round(Math.random() * 3));
		switch (x) {
		case 1: return Color.RED;
		case 2: return Color.YELLOW;
		case 3: return Color.GREEN;
		default: return null;	
		}
	}
	
	public Color getColor() {
		return color;
	}
	
	public double getSpeedLimit() {
		return speedLimit;
	}
}
