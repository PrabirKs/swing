package swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flowlayouyt {

	public static void main(String[] args) {
		//Layout manager = drfins thr natural layout fir componensts wthin a container
		//FLow Layout  = places compoe\nets in a row , sized at their prefreed size
		//               if the horizontal space in the container is too small
		//               the flowlayout class uses the next availale row ;
		
		JFrame frame =  new JFrame() ;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new GridLayout(3,3,0,0));  //horizontal space and the verrical space 10,10
	
		
	//	JButton button1 =  new JButton() ; // first declare then add and there is a short hand for this also
    //		frame.add(button1) ;
		JPanel panel = new JPanel() ;
		panel.setPreferredSize(new Dimension(100,250));
		panel.setBackground(Color.blue);
		panel.setLayout(new FlowLayout());
		
		
		
        frame.add(new JButton("1")) ;
        frame.add(new JButton("2")) ;
        frame.add(new JButton("3")) ;
        frame.add(new JButton("4")) ;
        frame.add(new JButton("5")) ;
        frame.add(new JButton("6")) ;
        frame.add(new JButton("7")) ;
        frame.add(new JButton("8")) ;
        frame.add(new JButton("9")) ;
        frame.setVisible(true);
        
       // frame.add(panel);
        
	}

}
