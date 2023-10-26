package alex_olhovskiy.Calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View {
	private Presenter presenter;
	private JFrame window;
	private JTextField textField;
	private int width=360;
	private int height=400;
	private int vGape=10;
	private int hGape=10;
	private int rows=4;
	private int columns=5;
	private int bSize=(width-(vGape*(columns-1)))/columns;
	private StringBuilder sb;
	private String[] buttonNames={"1","2","3","+","C","4","5","6","-","x^y","7","8","9","/","cos","0",".","=","*","sin"};
	public View() {
		presenter=new Presenter();
		sb=new StringBuilder();
		window=new JFrame();
		window.setTitle("GridLayout");
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setSize(width,height);
		window.setLocationRelativeTo(null);//in center of the screen
		window.setResizable(false);
		textField=new JTextField(16);
		textField.setFont(new Font("",Font.BOLD,24));

		JPanel upperPanel=new JPanel();
		JPanel downPanel=new JPanel();
		
		upperPanel.add(textField,BorderLayout.CENTER);
		downPanel.setLayout(new GridLayout(4,5,10,10));
		
		for(int i=0;i<20;i++)
		{
			JButton button=new JButton(buttonNames[i]);
			button.setPreferredSize(new Dimension(bSize,bSize));
			//button.setActionCommand(""+i);
			if(i==4){
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						sb.delete(0,sb.length());
						textField.setText(sb.toString());
					}
				});
			}
			else{
				if(i==17){
					button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							System.out.println("Button '=' pressed");
							textField.setText(presenter.getString(sb.toString()));
						}
					});
				}
				else {
					button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							System.out.println("Button "+button.getActionCommand()+" pressed");
							sb.append(button.getActionCommand());
							textField.setText(sb.toString());
						}
					});
				}
			}
			downPanel.add(button);
		}
		
		window.add(upperPanel,BorderLayout.NORTH);
		window.add(downPanel,BorderLayout.SOUTH);
		
		window.setVisible(true);
	}
}
