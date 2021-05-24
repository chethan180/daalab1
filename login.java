import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.UIManager;

class login extends JFrame implements ActionListener
{
   static JFrame frame;
   static Dimension screenSize;
   static JPanel p1;
   static JPanel p2;
   static JPanel p3;
   void getDimensions()
   {
      screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      frame.setSize(screenSize.width, screenSize.height);
      //System.out.println(screenSize.width + " " +  screenSize.height);
   }
   void temp()
   {

        //p2.setOpaque(false);
        //f.setVisible(true);
   }

   login()
   {
      frame = new JFrame("login");
      getDimensions();
      frame.setLayout(new BorderLayout());
      //frame.getContentPane().setBackground(Color.YELLOW);
      //frame.setBorder(new LineBorder(Color.YELLOW,3));

      p3 = new JPanel();
      //p3.setPreferredSize(new Dimension(screenSize.width, screenSize.height/10));
      JLabel userLabel2 = new JLabel("One place for all your estate needs");
      int x1 = (int)(0.0130 *  (screenSize.width));
      int y1 = (int)(0.009259 *  (screenSize.height) );
      int wid1 = (int)(0.2083333 * (screenSize.width));
      int hei1 = (int)(0.04629 * (screenSize.height));
      userLabel2.setBounds(x1,y1,wid1,hei1);
      Font font2 = new Font("SansSerif", Font.PLAIN, 32);
      userLabel2.setForeground(Color.WHITE);
      userLabel2.setFont(font2);
      //p3.setBorder(new LineBorder(Color.BLACK,3));
      p3.setLayout(new FlowLayout(FlowLayout.LEFT,10,5));
      p3.setBackground(Color.BLACK);
      p3.add(userLabel2);
      p3.setOpaque(true);
      

      p1 = new JPanel();
      //p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));
      p1.setPreferredSize(new Dimension((screenSize.width/3), screenSize.height));
      JTextPane pane = new JTextPane ();
      pane.setBounds(0,0,(screenSize.width/3), screenSize.height);
      pane.insertIcon ( new ImageIcon("/home/chethan/Documents/java_project/bgi1.jpg"));
      //pane.setPreferredSize(new Dimension((screenSize.width/10), (screenSize.height/10)));
      pane.setBackground(Color.WHITE);
      //pane.setOpaque(true); 
      p1.add(pane);
      //pane.setLocation(10,10);

      //System.out.println(screenSize.width/2+ " " +  screenSize.height/2);
      //p1.setBorder(new LineBorder(Color.BLACK,3));
      int bol1 = (int)(0.009375 *  (screenSize.width));
      JLabel userLabel1 = new JLabel("✓ Post one Single Property for FREE");
      userLabel1.setFont(new Font("Montserrat", Font.BOLD, bol1));
      userLabel1.setForeground(Color.BLACK);
      JLabel userLabela = new JLabel("✓ Get accessed by over 1 Lakh buyers");
      userLabela.setFont(new Font("Montserrat", Font.BOLD, bol1));
      userLabela.setForeground(Color.BLACK);
      JLabel userLabelb = new JLabel("✓ Get instant queries over Phone, Email");
      userLabelb.setFont(new Font("Montserrat", Font.BOLD, bol1));
      userLabelb.setForeground(Color.BLACK);
      JLabel userLabelc = new JLabel("✓ Performance in search & Track responses");
      userLabelc.setFont(new Font("Montserrat", Font.BOLD, bol1));
      userLabelc.setForeground(Color.BLACK);
      JLabel userLabeld = new JLabel("   & views online");
      userLabeld.setFont(new Font("Montserrat", Font.BOLD, bol1));
      userLabeld.setForeground(Color.BLACK);
       JLabel nameM = new JLabel("MagicBricks");
       int x2 = (int)(0.0130 *  (screenSize.width));
      int y2 = (int)(0.1389 *  (screenSize.height) );
      int wid2 = (int)(0.40625 * (screenSize.width));
      int hei2 = (int)(0.1389 * (screenSize.height));
      int bol2 = (int)(0.03645 *  (screenSize.width));
       nameM.setBounds(x2,y2,wid2,hei2);
       nameM.setFont(new Font("Montserrat", Font.BOLD, bol2));
       nameM.setForeground(Color.BLACK);
       pane.add(nameM);

      int x3 = (int)(0.078125 *  (screenSize.width));
      //System.out.println(x3);
      int y3 = (int)(0.074 *  (screenSize.height) );
      int wid3 = (int)(0.2604* (screenSize.width));
      int hei3 = (int)(0.4629 * (screenSize.height));
      int y4 = (int)(0.12037 *  (screenSize.height) );
      int y5 = (int)(0.1667 *  (screenSize.height) );
      int y6 = (int)(0.2129629 *  (screenSize.height) );
      int y7 = (int)(0.25925 *  (screenSize.height) );
      userLabel1.setBounds(x3,y3,wid3,hei3);
      userLabela.setBounds(x3,y4,wid3,hei3);
      userLabelb.setBounds(x3,y5,wid3,hei3);
      userLabelc.setBounds(x3,y6,wid3,hei3);
      userLabeld.setBounds(x3,y7,wid3,hei3);

      p1.setLayout(null);
      
      p1.setBackground(Color.BLACK);
      p1.setOpaque(true);



        pane.add(userLabel1);
        pane.add(userLabela);
        pane.add(userLabelb);
        pane.add(userLabelc);
        pane.add(userLabeld);

      p2 = new JPanel();
      //p2.setPreferredSize(new Dimension(screenSize.width/2, screenSize.height-30));
      //p2.setBorder(new LineBorder(Color.BLACK,3));
      //setLayout(new BoxLayout(p2,BoxLayout.Y_AXIS));
      p2.setLayout(null);
      p2.setBackground(Color.GRAY);
      JTextPane pane1 = new JTextPane ();
      pane1.setBounds(0,0,2*(screenSize.width/3), screenSize.height);
      pane1.insertIcon ( new ImageIcon("/home/chethan/Documents/java_project/dodbi.jpg"));
      //pane.setPreferredSize(new Dimension((screenSize.width/10), (screenSize.height/10)));
      //pane1.setBackground(Color.WHITE);
      //pane.setOpaque(true); 
      p2.add(pane1);
      //p2.setOpaque(true);


      //temp(p2);
      JPanel lpan = new JPanel();

      int xl = (int)(0.20833 *  (screenSize.width));
      int yl = (int)(0.1667 *  (screenSize.height) );
      int widl = (int)(0.20833 * (screenSize.width));
      int heil = (int)(0.5556 * (screenSize.height));
      lpan.setBounds(xl,yl,widl,heil);
      lpan.setBackground(Color.BLACK);
      lpan.setLayout(null);
      p2.add(lpan);
      JLabel userLabell = new JLabel("Login");
        userLabell.setBounds(10,10,80,30);
         userLabell.setFont(new Font("Montserrat", Font.BOLD, 20));
         userLabell.setForeground(Color.WHITE);
        lpan.add(userLabell);

      JLabel userLabel = new JLabel("User");
        userLabel.setBounds(15,140,120,30);
         userLabel.setFont(new Font("Montserrat", Font.BOLD, 18));
      userLabel.setForeground(Color.WHITE);
        lpan.add(userLabel);

        JTextField userText = new JTextField();
        userText.setBounds(130,140,150,30);
        userText.setOpaque(true);
        lpan.add(userText);

        // Same process for password label and text field.
        JLabel passwordLabel = new JLabel("Password");
         passwordLabel.setBounds(15,190,120,30);
         passwordLabel.setFont(new Font("Montserrat", Font.BOLD, 18));
         passwordLabel.setForeground(Color.WHITE);
        lpan.add(passwordLabel);


        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(130,190,150,30);
        lpan.add(passwordText);

        // Creating login button
        JButton loginButton = new JButton("login");
        loginButton.setBounds(80, 290, 130, 25);
         loginButton.setFont(new Font("Montserrat", Font.BOLD, 18));
      loginButton.setForeground(UIManager.getColor("OptionPane.warningDialog.titlePane.foreground"));
        lpan.add(loginButton);
        pane1.add(lpan);
        /////bottom panel
        // JPanel bp = new JPanel();
        // System.out.println((screenSize.width/3),screenSize.height);


   }

   @Override
    public void actionPerformed(ActionEvent e) {
        /*textArea.setText(textArea.getText().concat("You have clicked
        the button\n"));*/
    }

   public static void main(String[] args) {
      new login();
      frame.add(p3,BorderLayout.SOUTH);
      frame.add(p1,BorderLayout.WEST);
      frame.add(p2,BorderLayout.CENTER);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}


// style yugesh beautiful 1920 1080
// 1366 * 768