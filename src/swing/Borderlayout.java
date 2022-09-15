package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Borderlayout {

	public static void main(String[] args) {
		// Layout Manager : defines the natural layout for componenets within a container
		
		//3 common managers
		//BorderLayout = A BorderLayout places components in five areas : 
		//NORTH,SOUTH,EAST,WEST,CENTER .  All the extra space is placed in the center area
		JFrame frame  =  new JFrame() ;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new BorderLayout(10,10));  //10 , 10 are the left , top margin
		frame.setVisible(true);
		
		JLabel label = new JLabel() ;
		label.setText("Prabir");
		label.setForeground(new Color(0xff3399));         //font color
		label.setFont(new Font("MV Boli",Font.PLAIN,30)); //set the font
		label.setBounds(80,0,190,160);
		
		JPanel panel1 =  new JPanel() ;
		JPanel panel2 =  new JPanel() ;
		JPanel panel3 =  new JPanel() ;
		JPanel panel4 =  new JPanel() ;
		JPanel panel5 =  new JPanel() ;

		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.yellow);
		panel4.setBackground(Color.magenta);
		panel5.setBackground(Color.blue);
		

		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(50,100));
		panel3.setPreferredSize(new Dimension(50,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.WEST);
		frame.add(panel3,BorderLayout.EAST);
		frame.add(panel4,BorderLayout.SOUTH);
		frame.add(panel5,BorderLayout.CENTER);
		
		//now we will use a panel as a layout and add other subpanels inside it
		JPanel panel6 =  new JPanel() ;
		JPanel panel7 =  new JPanel() ;
		JPanel panel8 =  new JPanel() ;
		JPanel panel9 =  new JPanel() ;
		JPanel panel10 =  new JPanel() ;

		
		panel6.setBackground(Color.PINK);
		panel7.setBackground(Color.orange);
		panel8.setBackground(Color.darkGray);
		panel9.setBackground(Color.cyan);
		panel10.setBackground(Color.BLACK);
		

		panel6.setPreferredSize(new Dimension(50,50));
		panel7.setPreferredSize(new Dimension(50,50));
		panel8.setPreferredSize(new Dimension(50,50));
		panel9.setPreferredSize(new Dimension(50,50));
		panel10.setPreferredSize(new Dimension(50,50));
	
		panel5.setLayout(new BorderLayout(5,5));
		
		panel5.add(panel6,BorderLayout.NORTH);
		panel5.add(panel7,BorderLayout.WEST);
		panel5.add(panel8,BorderLayout.EAST);
		panel5.add(panel9,BorderLayout.SOUTH);
		panel5.add(panel10,BorderLayout.CENTER);
		
		panel10.setLayout(null);
		panel10.add(label) ;
		
		
		
	}

}
