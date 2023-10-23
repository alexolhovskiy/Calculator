package alex_olhovskiy.Calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View {
	private JFrame window;
	private Presenter presenter;
	private String str;
	private StringBuilder sb;
	public View() {
		sb=new StringBuilder();
		presenter=new Presenter();
		window=new JFrame();
		window.setTitle("FlowLayout");
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setSize(500,400);
		window.setLocationRelativeTo(null);
		
		JPanel panel=new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
		panel.setBackground(Color.RED);
		window.add(panel,BorderLayout.CENTER);
		
		JTextField tf=new JTextField(20);
		
		
		JButton button=new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button '1' pressed");
				sb.append("1");
				tf.setText(sb.toString());
			}
		});
		panel.add(button);
		
		JButton button2=new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button '2' pressed");
				sb.append("2");
				tf.setText(sb.toString());
			}
		});
		panel.add(button2);
		
		JButton button3=new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button '3' pressed");
				sb.append("3");
				tf.setText(sb.toString());
			}
		});
		panel.add(button3);
		
		JButton button4=new JButton("+");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button '+' pressed");
				sb.append("+");
				tf.setText(sb.toString());
			}
		});
		panel.add(button4);
		
		JButton button5=new JButton("=");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button '=' pressed");
				tf.setText(presenter.getString(sb.toString()));
			}
		});
		panel.add(button5);
		
		
		
	
		panel.add(tf);
		
		//panel.setPreferredSize(new Dimension(250,250));
		
		window.setVisible(true);
	}
}
