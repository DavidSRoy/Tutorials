import javax.swing.*;
import java.awt.*;

public class Central {

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		frame.getContentPane().add(label);
		JButton light = new JButton();
		 
		Component component = new Component();
		Controller controller = new Controller();
		
		
		frame.setLayout(new FlowLayout());
		frame.setForeground(Color.BLACK);
		frame.setVisible(true);
		frame.setTitle("StopLight");
		frame.setSize(new Dimension(400,300));
		
		light.setBackground(Vision.nextColor());
		light.setText("     \n      \n       \n  \n      \n   ");
		light.setSize(new Dimension(50,300));
		
		
		frame.add(light);
		
		
		int i = 1;
		while (i == 1) {  //Repeats until program terminated
			controller.update();
			
			label.setText("Speed: " + controller.speed);
			Thread.sleep(100);
		}
	}

}
