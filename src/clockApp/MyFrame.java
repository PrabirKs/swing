package clockApp;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
    
	Calendar calander;
	SimpleDateFormat timeFormat ;
	SimpleDateFormat dayFormat ;
	SimpleDateFormat dateFormat ;
	
	JLabel timeLabel ;
	JLabel dayLabel ;
	JLabel dateLabel ;
	
	String time ;
	String day ;
	String date ;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		this.setTitle("my clock app");
		this.setLayout(new FlowLayout());
		this.setSize(350,200);
		this.setResizable(false);
		
		timeFormat =  new SimpleDateFormat("hh:mm:ss a") ;
		dayFormat =  new SimpleDateFormat("EEEE") ;           //this hh mm E all are the predefined things
		//when it will passed it will give the requred things i.e E = current day
		dateFormat =  new SimpleDateFormat("MMMMM dd, yyyy") ; 
		
		timeLabel = new JLabel() ;
		
		time = timeFormat.format(calander.getInstance().getTime()) ;
		timeLabel.setText(time);
		timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
		timeLabel.setForeground(new Color(0x00FF00));
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);
		
		
		
		dayLabel = new JLabel() ;
		dayLabel.setFont(new Font("Ink Free",Font.PLAIN ,35));
		
		dateLabel =  new JLabel() ;
		dateLabel.setFont(new Font("Ink Free",Font.PLAIN ,25));
		
		this.add(timeLabel);
		this.add(dayLabel) ;
		this.add(dateLabel);
		this.setVisible(true);
		
		setTime() ;
	}

	public void setTime() {
		while(true) {
		time = timeFormat.format(calander.getInstance().getTime()) ;
		timeLabel.setText(time);
		
		day = dayFormat.format(calander.getInstance().getTime()) ;
		dayLabel.setText(day);
		
		date = dateFormat.format(calander.getInstance().getTime()) ;
		dateLabel.setText(date);
	}
}
