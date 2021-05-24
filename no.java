import java.awt.*;
import java.awt.event.*;
import java.io.File;  // Import the File class
import java.io.IOException;
import java.io.*;
import java.util.*;
import javax.swing.*;

class JScrollablePanelTest extends JFrame implements ActionListener {
   static JRadioButton ol,f,cl,al,ih,s,r;
   static JLabel tof,la,ad,sn,sr,t1;
   //static JTextArea ta;
   static JTextField tf1,tf2,t2,ta;
   //JScrollPane scroll;
   static ButtonGroup bg1,bg2;
   static JButton submit,back;
   void fpout(String y1,String y2,String y3,String y4,String y5) 
   {
          try {
         File f1 = new File("no.txt");
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
         bw.write(y5);
         bw.write("\n");
         bw.write("\n");
         bw.close();
         //f1.close();
         System.out.println("Done");
      } catch(IOException e){
         e.printStackTrace();
      }
      //fin();
   }
   public JScrollablePanelTest() {
      setTitle("JScrollablePanel Test");
      setLayout(new BorderLayout());
      JPanel panel = createPanel();
      add(BorderLayout.CENTER, new JScrollPane(panel));
      JPanel panel2 = new JPanel();
      //panel2.setLayout(null);
      submit=new JButton("Submit");
      //submit.setBounds(550,610,120,30);
      submit.setFont(new Font("Arial", Font.PLAIN, 20));
      back=new JButton("Back");
      submit.addActionListener(this);
     // back.setBounds(750,610,100,30);
      back.setFont(new Font("Arial", Font.PLAIN, 20));
      panel2.add(submit);panel2.add(back);
      add(BorderLayout.SOUTH, new JScrollPane(panel2));
      
      setSize(375, 250);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
   }
   public static JPanel createPanel() {
      JPanel panel = new JPanel();
      panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
      //panel.setLayout(null);
      tof=new JLabel("1. Which type of land you want to post ?");
      tof.setFont(new Font("Arial", Font.PLAIN, 40));
      //tof.setBounds(50,50,500,20);
      ol=new JRadioButton("Open land");
      ol.setFont(new Font("Arial", Font.PLAIN, 40));
      ol.setActionCommand("Openland");
      //ol.setBounds(550,50,150,20);
      ol.setBackground(Color.gray);
      f=new JRadioButton("Flat");
      f.setFont(new Font("Arial", Font.PLAIN, 40));
      //f.setBounds(800,50,70,20);
      f.setBackground(Color.gray);
      f.setActionCommand("flat");
      cl=new JRadioButton("Commercial land");
      cl.setFont(new Font("Arial", Font.PLAIN, 40));
      cl.setActionCommand("Commercialland");
      //cl.setBounds(950,50,200,20);
      cl.setBackground(Color.gray);
      al=new JRadioButton("Agricultural Land");
      al.setFont(new Font("Arial", Font.PLAIN, 40));
      al.setActionCommand("agriculturalland");
      //al.setBounds(550,90,200,20);
      al.setBackground(Color.gray);
      ih=new JRadioButton("Independent house");
      ih.setFont(new Font("Arial", Font.PLAIN, 40));
      ih.setActionCommand("Independenthouse"); 
      //ih.setBounds(800,90,220,20);
      ih.setBackground(Color.gray);
      bg1=new ButtonGroup();
      bg1.add(ol);bg1.add(f);bg1.add(cl);bg1.add(al);bg1.add(ih);


      la=new JLabel("2. Land Area(In Square Yard) ");
      //la.setBounds(50,170,300,20);
      la.setFont(new Font("Arial", Font.PLAIN, 40));
      tf1=new JTextField();
      //tf1.setBounds(550,170,200,30);
      tf1.setFont(new Font("Arial", Font.PLAIN, 40));

      ad=new JLabel("3. Address");
      //ad.setBounds(50,260,150,20);
      ad.setFont(new Font("Arial", Font.PLAIN, 40));
      ta=new JTextField();;
      //ta.setBounds(550,260,600,150);
      //JScrollPane scroll = new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEEDED);
      ta.setFont(new Font("Arial", Font.PLAIN, 40));
      /*textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);*/

      sn=new JLabel("4. Survey Number ");
      //sn.setBounds(50,460,200,20);
      sn.setFont(new Font("Arial", Font.PLAIN, 40));
      tf2=new JTextField();
      //tf2.setBounds(550,460,200,30);
      tf2.setFont(new Font("Arial", Font.PLAIN, 40));

      sr=new JLabel("5. What you want to do ? ");
      //sr.setBounds(50,540,500,20);
      sr.setFont(new Font("Arial", Font.PLAIN, 40));
      s=new JRadioButton("Sell");
      s.setActionCommand("Sell");
      //s.setBounds(550,540,75,20);
      s.setFont(new Font("Arial", Font.PLAIN, 40));
      s.setBackground(Color.gray);
      r=new JRadioButton("Rent");
      r.setActionCommand("Rent");
      //r.setBounds(700,540,75,20);
      r.setFont(new Font("Arial", Font.PLAIN, 40));
      r.setBackground(Color.gray);
      bg2=new ButtonGroup();
      bg2.add(s);bg2.add(r);//bg1.add(cl);bg1.add(al);bg1.add(ih);

      submit=new JButton("Submit");
      //submit.setBounds(550,610,120,30);
      submit.setFont(new Font("Arial", Font.PLAIN, 20));
      back=new JButton("Back");
      //back.setBounds(750,610,100,30);
      back.setFont(new Font("Arial", Font.PLAIN, 20));

      //scrol=new ScrollPane();


      panel.add(tof);panel.add(ol);panel.add(f);panel.add(cl);panel.add(al);panel.add(ih);panel.add(la);panel.add(tf1);panel.add(ad);panel.add(ta);panel.add(sn);panel.add(tf2);panel.add(sr);panel.add(s);panel.add(r);//panel.add(submit);panel.add(back);//c.add(scroll);

      //panel.add(t1);panel.add(t2);
      return panel;
   }

   public void actionPerformed(ActionEvent ae)
   {
      if (ae.getSource() == submit) {
      String but = bg1.getSelection().getActionCommand();
      String but1 = tf1.getText();
      String but2 = ta.getText();
      String but3 = tf2.getText();
      String but4 = bg2.getSelection().getActionCommand();
      fpout(but,but1,but2,but3,but4);
      System.out.println(but + but1 + but2 + but3 + but4 );
      }
      else
      {
         System.exit(0);
      }
   }
   public static void main(String [] args) {
      new JScrollablePanelTest();
   }
}