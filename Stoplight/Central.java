

public class Central {

	public static void main(String[] args) throws InterruptedException {
		Controller controller = new Controller();
		
		int i = 1;
		while (i == 1) {  //Repeats until program terminated
			controller.update();
			Thread.sleep(100);
		}
	}

}
