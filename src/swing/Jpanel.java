package swing;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jpanel {
	//JPanel : that functions as a conatainer to hold other componenets

	public static void main(String[] args) {
		    ImageIcon icon = new ImageIcon("pic.png") ;
		
		    JLabel label = new JLabel() ;
		    label.setText("Hi");
		    label.setIcon(icon);
		    label.setVerticalAlignment(JLabel.BOTTOM);   //if we use border layout () in layout then it is necessery
		    label.setHorizontalAlignment(JLabel.RIGHT);  //same
		    label.setBounds(0,0,190,160);  // it is useful when a panel has null layout, and the (x,y) are relative to the containing panel not the frame
		    
		    
		//JPanel : that functions as a conatainer to hold other componenets
		    //all the panels create and initilise here 
		    JPanel redPanel = new JPanel() ;
		    redPanel.setBackground(Color.RED);
		    redPanel.setBounds(0,0,250,250);
		    redPanel.setLayout(new BorderLayout());    // if the panel's layout manageer is border layout then we just have to set the position of the label
		
		    JPanel bluePanel = new JPanel() ;
		    bluePanel.setBackground(Color.blue);
		    bluePanel.setBounds(250,0,250,250);	
		    bluePanel.setLayout(null) ;   // now we hane no layout manager

		
		    JPanel greenPanel = new JPanel() ;
		    greenPanel.setBackground(Color.green);
		    greenPanel.setBounds(0,250,500,250);
		    greenPanel.setLayout(new BorderLayout());   //we first have to set the layout to place the label inside it
		
		
		    JFrame frame = new JFrame() ;  //creating a JFrame object
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //exit out of aplplication ,(default:HIde)
			frame.setSize(750,750);        //set x-dimension and y-dimension
			frame.setLayout(null);         // it first create a layout of the jframe
			frame.setVisible(true);        // make frame visible
			
			//then the panels are add into the frame , means the blocks are created where we can place our objects(labels)
			frame.add(redPanel) ;
			frame.add(bluePanel) ;
			frame.add(greenPanel) ;
			
			//in one of the panel we add our label(text and image)
			
			bluePanel.add(label) ;
			

			

	}

}
