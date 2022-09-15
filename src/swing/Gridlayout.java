package swing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gridlayout {

	public static void main(String[] args) {
		// GridLayout :  places components in a grid of cells
		// Each omponents in a grid of cells
		// each components takes all the available space witin its cell and each cell is the same size
		
		JFrame frame =  new JFrame() ;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new GridLayout());  //horizontal space and the verrical space 10,10
		
		
		frame.add(new JButton("1")) ;
		frame.add(new JButton("1")) ;
		frame.add(new JButton("1")) ;
		frame.add(new JButton("1")) ;
		frame.add(new JButton("1")) ;
		frame.add(new JButton("1")) ;
		frame.add(new JButton("1")) ;
		frame.add(new JButton("1")) ;
		frame.add(new JButton("1")) ;
        frame.setVisible(true);
	}

}
