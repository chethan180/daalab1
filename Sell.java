package GuiMagic;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.border.LineBorder;
import java.io.*;
public class Sell extends JFrame implements ActionListener{
   static JRadioButton ol,f,cl,al,ih,s,r;
   static JLabel tof,la,ad,sn,sr,t1,one;
   static JTextPane tp;
   static JTextField tf1,tf2,t2;
   static ButtonGroup bg1,bg2;
   static JButton submit,back;
   void fpout(String y1,String y2,String y3,String y4,String y5) 
   {
         try {
            if(y5 == "Sell")
            {
            File f1 = new File("Sell.txt");
            if(!f1.exists()) {
               f1.createNewFile();
            }
                     FileWriter fileWritter = new FileWriter(f1.getName(),true);
         BufferedWriter bw = new BufferedWriter(fileWritter);
         bw.write(y1);
         bw.write("\n");
         bw.write(y2);
         bw.write("\n");
         bw.write(y3);
         bw.write("\n");
         bw.write(y4);
         bw.write("\n");
         /*bw.write(y5);
         bw.write("\n");*/
         bw.write("\n");
         bw.close();
         //f1.close();
         System.out.println("Done");
         }
            else
            {
               File f2 = new File("Rent.txt");
               if(!f2.exists()) {
                  f2.createNewFile();               
            }
                     FileWriter fileWritter = new FileWriter(f2.getName(),true);
         BufferedWriter bw = new BufferedWriter(fileWritter);
         bw.write(y1);
         bw.write("\n");
         bw.write(y2);
         bw.write("\n");
         bw.write(y3);
         bw.write("\n");
         bw.write(y4);
         bw.write("\n");
         /*bw.write(y5);
         bw.write("\n");*/
         bw.write("\n");
         bw.close();
         //f1.close();
         System.out.println("Done");
         }


      } catch(IOException e){
         e.printStackTrace();
   }
}  
   public Sell() {
      setTitle("Sell");
      setLayout(new BorderLayout());
      JPanel panel = createPanel();
      //add(BorderLayout.CENTER, new JScrollPane(panel));

      JPanel panel4=new JPanel();
     panel4.setLayout(new GridLayout(2,1,10,20));
      la=new JLabel("2. Land Area(In Square Yard) ");
      la.setForeground(Color.gray);
      la.setFont(new Font("Arial", Font.PLAIN, 20));
      tf1=new JTextField(25);
      //tf1.setBackground(Color.gray);
      //tf1.setBounds()
      tf1.setFont(new Font("Arial", Font.PLAIN, 20));
      panel4.add(la);panel4.add(tf1);

      JPanel panel5=new JPanel();
      panel5.setLayout(new GridLayout(2,1,10,20));
      ad=new JLabel("3. Address");
      ad.setForeground(Color.gray);
      ad.setFont(new Font("Arial", Font.PLAIN, 20));
      //JTextPane tp=new JTextPane();
      tp=new JTextPane();
      //tp.setBackground(Color.gray);
      tp.setFont(new Font("Arial", Font.PLAIN, 20));
      panel5.add(ad);panel5.add(tp);

      JPanel panel6=new JPanel();
      panel6.setLayout(new GridLayout(2,1,10,20));
      sn=new JLabel("4. Survey Number ");
      sn.setForeground(Color.gray);
      sn.setFont(new Font("Arial", Font.PLAIN, 20));
      tf2=new JTextField(25);
      //tf2.setBackground(Color.gray);
      tf2.setFont(new Font("Arial", Font.PLAIN, 20));
      panel6.add(sn);panel6.add(tf2);

      JPanel panel7=new JPanel();
      panel7.setLayout(new GridLayout(3,1,10,20));
      sr=new JLabel("5. What you want to do ? ");
      sr.setForeground(Color.gray);
      sr.setFont(new Font("Arial", Font.PLAIN, 20));
      s=new JRadioButton("Sell");
      s.setFont(new Font("Arial", Font.PLAIN, 20));
       s.setActionCommand("Sell");
      //s.setBackground(Color.gray);
      r=new JRadioButton("Rent");
      r.setFont(new Font("Arial", Font.PLAIN, 20));
      r.setActionCommand("Rent");
      //r.setBackground(Color.gray);
      bg2=new ButtonGroup();
      bg2.add(s);bg2.add(r);
      panel7.add(sr);panel7.add(s);panel7.add(r);

      JPanel panel8=new JPanel();
       submit=new JButton("Submit");
        submit.setFont(new Font("Arial", Font.PLAIN, 30));


      panel8.add(submit);


      JPanel panel3=new JPanel();
      panel3.setLayout(new BoxLayout(panel3,BoxLayout.Y_AXIS));
      panel3.add(panel);panel3.add(panel4);panel3.add(panel5);panel3.add(panel6);panel3.add(panel7);//panel3.add(panel8);
      add(BorderLayout.CENTER, new JScrollPane(panel3));

      
      
      JPanel panel2 = new JPanel();
      panel2.setBackground(Color.red);
      panel2.setLayout(new BorderLayout());
      one=new JLabel("magicBricks");
      one.setFont(new Font("Montserrat", Font.BOLD, 30));
      one.setForeground(Color.white);
      back=new JButton("Logout");
      back.setBorder(new LineBorder(Color.black,3,true));
      back.setFont(new Font("Arial", Font.PLAIN, 30));
      panel2.add(one,BorderLayout.WEST);panel2.add(back,BorderLayout.EAST);
      add(BorderLayout.NORTH, new JScrollPane(panel2));

      JPanel panel9 = new JPanel();
      panel9.setBackground(Color.WHITE);
      panel9.setOpaque(true);
      //add(BorderLayout.EAST, new JScrollPane(panel9));
      Dimension size= Toolkit.getDefaultToolkit().getScreenSize();
      int width = (int)size.getWidth();
      int height = (int)size.getHeight();
      setSize(width,height);

      JPanel panel10 = new JPanel();
      panel10.setBackground(Color.WHITE);
      panel10.setOpaque(true);
     // panel10.setPrefferedSize(width/8,height);
      add(BorderLayout.WEST, new JScrollPane(panel10));
      

      add(BorderLayout.SOUTH, new JScrollPane(panel8));
      submit.addActionListener(this);

      //setSize(375, 250);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
   }
   public static JPanel createPanel() {
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(6,1,1,20));
      //panel.setLayout(null);
      tof=new JLabel("1. Which type of land you want to post ?");
      tof.setForeground(Color.gray);
      tof.setFont(new Font("Arial", Font.PLAIN, 20));
      //tof.setBounds(50,50,500,20);
      ol=new JRadioButton("Open land");
      ol.setFont(new Font("Arial", Font.PLAIN, 20));
      ol.setActionCommand("Openland");
      //ol.setBounds(550,50,150,20);
      //ol.setBackground(Color.gray);
      f=new JRadioButton("Flat");
      f.setFont(new Font("Arial", Font.PLAIN, 20));
      f.setActionCommand("flat");
      //f.setBounds(800,50,70,20);
      //f.setBackground(Color.gray);
      cl=new JRadioButton("Commercial land");
      cl.setFont(new Font("Arial", Font.PLAIN, 20));
      cl.setActionCommand("Commercialland");
      //cl.setBounds(950,50,200,20);
      //cl.setBackground(Color.gray);
      al=new JRadioButton("Agricultural Land");
      al.setFont(new Font("Arial", Font.PLAIN, 20));
      al.setActionCommand("agriculturalland");
      //al.setBounds(550,90,200,20);
      //al.setBackground(Color.gray);
      ih=new JRadioButton("Independent house");
      ih.setFont(new Font("Arial", Font.PLAIN, 20));
      ih.setActionCommand("Independenthouse"); 
      //ih.setBounds(800,90,220,20);
      //ih.setBackground(Color.gray);
      bg1=new ButtonGroup();
      bg1.add(ol);bg1.add(f);bg1.add(cl);bg1.add(al);bg1.add(ih);


     

      panel.add(tof);panel.add(ol);panel.add(f);panel.add(cl);panel.add(al);panel.add(ih);//panel.add(la);panel.add(tf1);panel.add(ad);panel.add(ta);panel.add(sn);panel.add(tf2);panel.add(sr);panel.add(s);panel.add(r);//panel.add(submit);panel.add(back);//c.add(scroll);

      //panel.add(t1);panel.add(t2);
      return panel;
   }

      public void actionPerformed(ActionEvent ae)
   {
      if (ae.getSource() == submit) {
      String but = bg1.getSelection().getActionCommand();
      String but1 = tf1.getText();
      String but2 = tp.getText();
      String but3 = tf2.getText();
      String but4 = bg2.getSelection().getActionCommand();
      fpout(but,but1,but2,but3,but4);
      //System.out.println(but + but1 + but2 + but3 + but4 );
      }
      else
      {
         System.exit(0);
      }
   }
   public static void main(String [] args) {
      new Sell();
   }
}