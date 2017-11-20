import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseMotion extends JFrame 
{
    JPanel jp = new JPanel();
         
    MouseMotion()
    {
        setTitle("드래깅동안 YELLOW");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(jp);
        
        jp.addMouseMotionListener(new motionListener());
        jp.setBackground(Color.green);//백그라운드 컬러 그린 
        setSize(250,250);// 사이즈 250,250 
        setVisible(true);
    }
    public class motionListener implements MouseMotionListener
    {                      //mouse motion 임플리먼트 
        public void mouseDragged(MouseEvent e) 
        {         // 드래그시 노란색 입력 
            jp = (JPanel)e.getSource();
            jp.setBackground(Color.yellow);
        }
        public void mouseMoved(MouseEvent e) 
        {
            jp = (JPanel)e.getSource();
            jp.setBackground(Color.GREEN);
        }
        
    }
    public static void main(String[] args)
    {
        new MouseMotion();
    } 
}
 
