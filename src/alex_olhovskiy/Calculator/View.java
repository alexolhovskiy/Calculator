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

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View {
	private Presenter presenter;
	private JFrame window;
	private JTextField textField;
	private int bSize=70;
	private int vGape=10;
	private int hGape=10;
	private int rows=4;
	private int columns=6;
	private int fontSize=24;
	private int headSize=30;
	private int width;
	private int height;
	private StringBuilder sb;
	private String[] buttonNames={"1","2","3","-","cos","acos",
								"4","5","6","*","sin","asin",
								"7","8","9","/","tg","atg",
								"0",".","+","x^y","=","C"};
	public View() {
		presenter=new Presenter();
		sb=new StringBuilder();
		
		window=new JFrame();
		window.setTitle("GridLayout");
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		width=hGape*(columns-1)+bSize*columns;
		height=vGape*(rows-1)+bSize*rows+vGape*3+fontSize*2+headSize;
		
		window.setSize(width,height);
		window.setLocationRelativeTo(null);//in center of the screen
		window.setResizable(false);
		textField=new JTextField(16);
		textField.setFont(new Font("Arial",Font.BOLD,fontSize));
		
		JPanel panel=new JPanel();
		panel.setLayout(new BorderLayout(hGape,vGape));
		panel.setBorder(BorderFactory.createEmptyBorder(hGape,vGape,hGape,vGape));

		JPanel upperPanel=new JPanel();
		JPanel downPanel=new JPanel();
		
		//upperPanel.add(textField,BorderLayout.CENTER);
		upperPanel.setLayout(new BorderLayout(hGape,vGape));
		//upperPanel.setBackground(Color.RED);
		downPanel.setLayout(new GridLayout(rows,columns,hGape,vGape));
		//downPanel.setBackground(Color.GREEN);
		
		upperPanel.add(textField,BorderLayout.CENTER);
		
//		for(int i=0;i<(rows*columns);i++)
//		{
//			JButton button=new JButton(buttonNames[i]);
//			button.setPreferredSize(new Dimension(bSize,bSize));
//			//button.setActionCommand(""+i);
//			if(i==4){
//				button.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent e) {
//						sb.delete(0,sb.length());
//						textField.setText(sb.toString());
//					}
//				});
//			}
//			else{
//				if(i==17){
//					button.addActionListener(new ActionListener() {
//						public void actionPerformed(ActionEvent e) {
//							System.out.println("Button '=' pressed");
//							textField.setText(presenter.getString(sb.toString()));
//						}
//					});
//				}
//				else {
//					button.addActionListener(new ActionListener() {
//						public void actionPerformed(ActionEvent e) {
//							System.out.println("Button "+button.getActionCommand()+" pressed");
//							sb.append(button.getActionCommand());
//							textField.setText(sb.toString());
//						}
//					});
//				}
//			}
//			downPanel.add(button);
//		}
//		
		
		for(int i=0;i<(rows*columns);i++)
		{
			JButton button=new JButton(buttonNames[i]);
			button.setPreferredSize(new Dimension(bSize,bSize));
			switch(i)
			{
				case 4://cos
					button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							System.out.println("Button 'cos' pressed");
							sb.append("c");
							textField.setText(presenter.getString(sb.toString()));
						}
					});
					break;
				case 5://acos
					button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							System.out.println("Button 'acos' pressed");
							sb.append("a");
							textField.setText(presenter.getString(sb.toString()));
						}
					});
					break;
				case 10://sin
					button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							System.out.println("Button 'sin' pressed");
							sb.append("s");
							textField.setText(presenter.getString(sb.toString()));
						}
					});
					break;
				case 11://asin
					button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							System.out.println("Button 'asin' pressed");
							sb.append("b");
							textField.setText(presenter.getString(sb.toString()));
						}
					});
					break;
				case 16://tg
					button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							System.out.println("Button 'tg' pressed");
							sb.append("t");
							textField.setText(presenter.getString(sb.toString()));
						}
					});
					break;
				case 17://atg
					button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							System.out.println("Button 'atg' pressed");
							sb.append("d");
							textField.setText(presenter.getString(sb.toString()));
						}
					});
					break;
				case 21://^
					button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							System.out.println("Button '^' pressed");
							sb.append("^");
							textField.setText(sb.toString());
						}
					});
					break;
				case 22://=
					button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							System.out.println("Button '=' pressed");
							textField.setText(presenter.getString(sb.toString()));
						}
					});
					break;
				case 23://C
					button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						sb.delete(0,sb.length());
						textField.setText(sb.toString());
						}
					});
					break;
				default: 
					button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							System.out.println("Button "+button.getActionCommand()+" pressed");
							sb.append(button.getActionCommand());
							textField.setText(sb.toString());
						}
					});
					break;
			}
			
			//button.setActionCommand(""+i);
			downPanel.add(button);
		}
		
		panel.add(upperPanel,BorderLayout.CENTER);
		panel.add(downPanel,BorderLayout.SOUTH);
		window.add(panel);
		
		window.setVisible(true);
		
		
	}
}
