package swing;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {  //it extends the JFrame class it haall the functionalities
	    JButton button ;
	    JLabel label ;
	MyFrame() {
		
		ImageIcon icon = new ImageIcon("back10.jpg") ;  //create an image icon
		ImageIcon icon2 =  new ImageIcon("Scooty.png") ;
		
		label =  new JLabel() ;
		label.setIcon(icon2);
		label.setBounds(150,250,150,90);
		label.setVisible(false);
		
		button = new JButton() ;
		button.setBounds(100,100,200,150);
		button.addActionListener(this);
		
		button.setFocusable(false);  // remove the border of the button
		button.setIcon(icon) ;		
		button.setText("button") ;
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont((new Font("Comic Sans",Font.BOLD,25)));
		button.setIconTextGap(-3);
		button.setForeground(Color.black) ;
		button.setBackground(Color.LIGHT_GRAY);
		button.setBorder(BorderFactory.createEtchedBorder());
	//	button.setEnabled(false);  //disable a button
		
		this.setTitle("first GUI practice") ; //set title of the jthis
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //exit out of aplplication ,(default:HIde)
	//	this.setResizable(false);     //now cant resize the this
		this.setSize(420,420);        //set x-dimension and y-dimension
      	this.setVisible(true);        // make this visible 
		
		ImageIcon image = new ImageIcon("logo.png") ;  //create an image icon
		
		this.setIconImage(image.getImage());  //change the icon of the this
//		this.getContentPane().setBackground(Color.GREEN);
		this.getContentPane().setBackground(new Color(0xff3399));   //background color
		this.add(button) ;
		this.add(label) ;
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println("poop");
			
			label.setVisible(true);
		}
		
	}

}
