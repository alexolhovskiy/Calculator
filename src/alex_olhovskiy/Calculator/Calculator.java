package alex_olhovskiy.Calculator;

import javax.swing.SwingUtilities;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				View view=new View();
			}
		});
	}

}
