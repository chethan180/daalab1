import java.awt.*;
import java.awt.event.*;
import java.io.File;  // Import the File class
import java.io.IOException;
import java.io.*;
import java.util.*;
import javax.swing.*;


class Fuckings extends JFrame implements ActionListener {
   Button b1;
   TextField t1,t2,t3,t4,t5;
   Label l1,l2,l3,l4,l5,l6;
   static JButton submit,back;
   static JFrame frame;
   static void fin()
   {
	//EmpFrame f2 =  new EmpFrame();
	try
	{
		File f3 = new File("no.txt");
		Scanner s = new Scanner(f3);
		while(s.hasNextLine()) {
			String z1 = s.nextLine();
			String z2 = s.nextLine();
			String z3 = s.nextLine();
			String z4 = s.nextLine();
			String z5 = s.nextLine();
			String z6 = s.nextLine();
		//System.out.println(z1 + " " + z2 + " " + z3 + " " + z4);
			new Fuckings(z1, z2, z3, z4, z5);
		}
		//s.close();   			
	}	
	catch (Exception e){}
   }
   Fuckings(String z1, String z2, String z3, String z4,String z5)
	{
		frame.setLayout(new GridLayout(20,10));
		l1=new Label("Land Type: ");
		t1=new TextField(25);
		l2=new Label("Land Area: ");
		t2=new TextField(25);
		l3=new Label("Address: ");
		t3=new TextField(25);
		l4=new Label("Survey number: ");
		t4=new TextField(25);
		l5=new Label("Buy/Rent");
		t5=new TextField(25);
		//l6=new Label("");
		//t6=new TextField(25);

		frame.add(l1);
		frame.add(t1);
		frame.add(l2);
		frame.add(t2);
		frame.add(l3);
		frame.add(t3);
		frame.add(l4);
		frame.add(t4);
		frame.add(l5);
		frame.add(t5);
		//frame.add(l6);
		t1.setText(z1+"");
	  	t2.setText(z2);
	  	t3.setText(z3+"");
	  	t4.setText(z4+"");
	  	t5.setText(z5+"");
		
	}	
	public void actionPerformed(ActionEvent ae)
   {
	  //dispose();
   }
   public static void main(String[] args) {
			  frame =  new JFrame();
			//f2.setSize(300,350);
			frame.setSize(300,350);
			//frame.setVisible(true);
			frame.setTitle("Frame2");
			frame.setVisible(true);
			//frame.setTitle("Frame2");
			fin();
   }
}