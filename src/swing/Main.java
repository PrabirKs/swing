package swing;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		//Jframe = a GUI window to add components to
//		JFrame frame = new JFrame() ;  //creating a JFrame object
//		frame.setTitle("first GUI practice") ; //set title of the jframe
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //exit out of aplplication ,(default:HIde)
//		frame.setResizable(false);     //now cant resize the frame
//		frame.setSize(420,420);        //set x-dimension and y-dimension
//		frame.setVisible(true);        // make frame visible 
//		
//		ImageIcon image = new ImageIcon("logo.png") ;  //create an image icon
//		frame.setIconImage(image.getImage());  //change the icon of the frame
////		frame.getContentPane().setBackground(Color.GREEN);
//		frame.getContentPane().setBackground(new Color(0xff3399));   //background color
		
		MyFrame myFrame = new MyFrame() ;

	}

}
