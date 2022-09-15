package swing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Jlabel {

	public static void main(String[] args) {
		// JLabel :  a GUI display area for a string of text, an image  , or both
		
		
		ImageIcon image = new ImageIcon("logo.png") ;    //create an image object to pass
		Border border = BorderFactory.createDashedBorder(Color.red) ; //create an border object to pass
		
		JLabel label = new JLabel() ;  //it create a label // we can also directly pass the text inside it
		label.setText("my name is prabir"); //set text of label
		label.setIcon(image);                             // set the icon by passing the value inside it                        
	    label.setHorizontalTextPosition(JLabel.CENTER);   //position of the text
	    label.setVerticalTextPosition(JLabel.TOP);        //vertical position of the text
	    label.setForeground(new Color(0xff3399));         //font color
	    label.setFont(new Font("MV Boli",Font.PLAIN,30)); //set the font
	    label.setIconTextGap(10);     //gap between the icon and the text
	    label.setBackground(Color.BLUE);   // first set thr background color
	    label.setOpaque(true);                            //after setting the background color, do this then it will reflect
	    label.setBorder(border);   //set the border
	    label.setVerticalAlignment(JLabel.CENTER) ; //alignment of the toatl label
	    label.setHorizontalAlignment(label.CENTER); //means the image and the text
	    label.setBounds(100,200,350,350);   //this will set the position in the layout screen  //layout will be define in jframe where it will placed
		
	    JFrame frame = new JFrame() ;  //creating a JFrame object
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //exit out of aplplication ,(default:HIde)
		frame.setSize(420,420);        //set x-dimension and y-dimension
		frame.setLayout(null);         // it first create a layout of the jframe
		frame.setVisible(true);        // make frame visible 
		
		frame.add(label);
//		frame.pack(); //if we will use it instead of the layout , then automatically iot will 
		//adjust the all labels acc to thr jframe, make sure use it after ading the all label

	}

}
