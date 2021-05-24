package GuiMagic;
import java.awt.*;
import java.awt.event.*;
import java.io.File;  // Import the File class
import java.io.IOException;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;



class Rent extends JFrame implements ActionListener {
   static Button b1;
   static TextField t1,t2,t3,t4,t5;
   static Label l1,l2,l3,l4,l5,l6;
   static JButton submit,back;
   static JLabel ll1,ll2;
   static JFrame frame;
   static JPanel panel ;
   static void fin()
   {
	//EmpFrame f2 =  new EmpFrame();
	try
	{
		//System.out.println("sbvljsfb");
		File f3 = new File("Rent.txt");
		Scanner s = new Scanner(f3);
		while(s.hasNextLine()) {
			String z1 = s.nextLine();
			String z2 = s.nextLine();
			String z3 = s.nextLine();
			String z4 = s.nextLine();
			//String z5 = s.nextLine();
			String z5 = s.nextLine();
		//System.out.println(z1 + " " + z2 + " " + z3 + " " + z4);
			Buyf(z1, z2, z3, z4);
		}
		s.close();   			
	}	
	catch (Exception e){}
   }
   static void Buyf(String z1, String z2, String z3, String z4)
	{
		
		JPanel midp =  new JPanel();
		midp.setLayout(new GridLayout(4,2));
		midp.setBorder(new LineBorder(Color.BLACK,3));
		l1=new Label("Land Type: ");
		t1=new TextField(25);
		l2=new Label("Land Area: ");
		t2=new TextField(25);
		l3=new Label("Address: ");
		t3=new TextField(25);
		l4=new Label("Survey number: ");
		t4=new TextField(25);
		/*l5=new Label("Buy/Rent");
		t5=new TextField(25);*/
		//l6=new Label("");
		//t6=new TextField(25);

		midp.add(l1);
		midp.add(t1);
		midp.add(l2);
		midp.add(t2);
		midp.add(l3);
		midp.add(t3);
		midp.add(l4);
		midp.add(t4);
		/*midp.add(l5);
		midp.add(t5);*/
		//frame.add(l6);
		t1.setText(z1+"");
	  	t2.setText(z2);
	  	t3.setText(z3+"");
	  	t4.setText(z4+"");
	  	//t5.setText(z5+"");
	  	panel.add(midp);
		
	}	
	Rent()
	{
	    frame =  new JFrame();
		//frame.setLayout(new GridLayout(5,5,20,1));
		//f2.setSize(300,350);
		//frame.setVisible(true);
      frame.setTitle("Sell");
      frame.setLayout(new BorderLayout());
      frame.setSize(300,350);
      panel = new JPanel();
      panel.setLayout(new GridLayout(20,2,50,1));
      fin();
      add(BorderLayout.CENTER, new JScrollPane(panel));
      JPanel panel2 = new JPanel();
      //panel2.setLayout(null);
      //submit=new JButton("Submit");
      ll1 = new JLabel("magicBricks");
      //submit.setBounds(550,610,120,30);
      ll1.setFont(new Font("Arial", Font.PLAIN, 20));
      back=new JButton("Back");
      //submit.addActionListener(this);
     // back.setBounds(750,610,100,30);
      back.setFont(new Font("Arial", Font.PLAIN, 20));
      panel2.add(ll1);panel2.add(back);
      add(BorderLayout.NORTH, new JScrollPane(panel2));
      
      setSize(375, 250);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
   }
	public void actionPerformed(ActionEvent ae)
   {
	  //dispose();
   }
   public static void main(String[] args) {
			//frame.setTitle("Frame2");
   		new Rent();
   }
}