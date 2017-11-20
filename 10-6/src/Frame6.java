import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Frame6 extends JFrame
{
        JPanel P;
        JLabel La;

        Frame6()
        {
                this.setTitle("마우스 올리기");
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                P = new JPanel();
                P.setLayout(null); //컨텐트팬의 배치관리자 삭제
                La = new JLabel("C"); //키 입력에 따라 움직일 레이블 컴포넌트
                La.setSize(20, 20);
                La.setLocation(100, 100); //La의 초기 위치는 (100,100)
                Mouse Mo = new Mouse();
                La.addMouseListener(Mo);
                P.add(La);
                this.add(P);
                this.setVisible(true);
                this.setSize(350, 350);
        }
        class Mouse implements MouseListener
        {
                public void mouseClicked(MouseEvent e)
                {
                        JLabel La = (JLabel)e.getSource();
                        int X = (int)(Math.random()*300);
                        int Y = (int)(Math.random()*300);
                        La.setLocation(X, Y);
                } //마우스로 'c'를 클릭할때 마다 랜덤의 좌표에 'c'출력
                public void mouseEntered(MouseEvent e)
                {
                }

                public void mouseExited(MouseEvent e)
                {
                }

                public void mousePressed(MouseEvent e)
                {
                }

                public void mouseReleased(MouseEvent e)
                {
                }
        }
        public static void main(String[] args)
        {
                new Frame6();
        }
}
