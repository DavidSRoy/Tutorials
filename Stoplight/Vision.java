import java.awt.Color;

public class Vision {
	private static Color color = Color.RED;
	private double speedLimit = 0.0;
	
	public static void findColor() { //return Color
		int x = (int) (Math.round(Math.random() * 3));
		
		
		/*switch (x) {
		case 1: return Color.RED;
		case 2: return Color.YELLOW;
		case 3: return Color.GREEN;
		default: return null;	
		}*/
	}
	
	public static Color nextColor() {
		if (color == Color.RED) {
			return Color.GREEN;
		} else if (color == Color.GREEN) {
			return Color.YELLOW;
		} else if (color == Color.YELLOW) {
			return Color.RED;
		} else {
			return color;
		}
	}
	
	public Color getColor() {
		return color;
	}
	
	public double getSpeedLimit() {
		return speedLimit;
	}
}
