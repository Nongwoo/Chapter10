import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventFrame extends JFrame {
	public MouseEventFrame() {
		super("마우스 올리기 내리기 연습"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		c.add(label); // 컨텐트팬에 붙이기, 초기화면 love java
		
		label.addMouseListener(new MouseAdapter() {
			@Override  //love java위에 마우스를 올리면 
			public void mouseEntered(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("Love Java");
 			}          //사랑해로 바뀌며 내리면 다시 love java 
			@Override  //로 바뀐다 
			public void mouseExited(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("사랑해");
			}			
		});
		setSize(250,150);
		setVisible(true);}
	static public void main(String [] args) {
		new MouseEventFrame();
	}    
}