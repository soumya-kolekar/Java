package BankManagementSystem;
import javax.swing.*;
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{
	Login(){
	 	
		setTitle("AUTOMATED TELLER MACHINE");
		setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
		
			Image i2=i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
			ImageIcon i3=new ImageIcon(i2);
			JLabel label=new JLabel(i3);
			label.setBounds(70, 10, 100, 100);
			add(label);
		setSize(800,480);
		setVisible(true);
		setLocation(350,200);//left,tbootm  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Login();
	}

}  
