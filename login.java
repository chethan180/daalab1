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
      System.out.println(screenSize.width + " " +  screenSize.height);
   }
   void temp()
   {

        //p2.setOpaque(false);
        //f.setVisible(true);
   }

   login()
   {
      frame = new JFrame("signup");
      getDimensions();
      frame.setLayout(new BorderLayout());
      //frame.getContentPane().setBackground(Color.YELLOW);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //frame.setBorder(new LineBorder(Color.YELLOW,3));

      p3 = new JPanel();
      //p3.setPreferredSize(new Dimension(screenSize.width, screenSize.height/10));
      JLabel userLabel2 = new JLabel("One place for all your estate needs");
      userLabel2.setBounds(25,10,400,50);
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
      JLabel userLabel1 = new JLabel("✓ Post one Single Property for FREE");
      userLabel1.setFont(new Font("Montserrat", Font.BOLD, 18));
      userLabel1.setForeground(Color.BLACK);
      JLabel userLabela = new JLabel("✓ Get accessed by over 1 Lakh buyers");
      userLabela.setFont(new Font("Montserrat", Font.BOLD, 18));
      userLabela.setForeground(Color.BLACK);
      JLabel userLabelb = new JLabel("✓ Get instant queries over Phone, Email");
      userLabelb.setFont(new Font("Montserrat", Font.BOLD, 18));
      userLabelb.setForeground(Color.BLACK);
      JLabel userLabelc = new JLabel("✓ Performance in search & Track responses");
      userLabelc.setFont(new Font("Montserrat", Font.BOLD, 18));
      userLabelc.setForeground(Color.BLACK);
      JLabel userLabeld = new JLabel("   & views online");
      userLabeld.setFont(new Font("Montserrat", Font.BOLD, 18));
      userLabeld.setForeground(Color.BLACK);
       JLabel nameM = new JLabel("MagicBricks");
       nameM.setBounds(25,150,screenSize.width ,screenSize.height/10);
       nameM.setFont(new Font("Montserrat", Font.BOLD, 60));
       nameM.setForeground(Color.BLACK);
       pane.add(nameM);
      /*JLabel userLabel1 = new JLabel("✓ hi ther how are u ? \n\n  fck off");
      JLabel userLabel1 = new JLabel("✓ hi ther how are u ? \n\n  fck off");
      JLabel userLabel1 = new JLabel("✓ hi ther how are u ? \n\n  fck off");
      JLabel userLabel1 = new JLabel("✓ hi ther how are u ? \n\n  fck off");
      JLabel userLabel1 = new JLabel("✓ hi ther how are u ? \n\n  fck off");
      JLabel userLabel1 = new JLabel("✓ hi ther how are u ? \n\n  fck off");
      JLabel userLabel1 = new JLabel("✓ hi ther how are u ? \n\n  fck off");*/
      //p3.setLayout(new GridLayout(10,1));
      userLabel1.setBounds(150,80,500,500);
      userLabela.setBounds(150,130,500,500);
      userLabelb.setBounds(150,180,500,500);
      userLabelc.setBounds(150,230,500,500);
      userLabeld.setBounds(150,280,500,500);

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
      lpan.setBounds(400,180,400,600);
      lpan.setBackground(Color.BLACK);
      lpan.setLayout(null);
      p2.add(lpan);
      JLabel userLabell = new JLabel("Login");
        userLabell.setBounds(10,10,80,30);
         userLabell.setFont(new Font("Montserrat", Font.BOLD, 24));
         userLabell.setForeground(Color.WHITE);
        lpan.add(userLabell);

      JLabel userLabel = new JLabel("User");
        userLabel.setBounds(25,170,130,30);
         userLabel.setFont(new Font("Montserrat", Font.BOLD, 18));
      userLabel.setForeground(Color.WHITE);
        lpan.add(userLabel);

        JTextField userText = new JTextField();
        userText.setBounds(150,170,190,30);
        userText.setOpaque(true);
        lpan.add(userText);

        // Same process for password label and text field.
        JLabel passwordLabel = new JLabel("Password");
         passwordLabel.setBounds(25,220,130,30);
         passwordLabel.setFont(new Font("Montserrat", Font.BOLD, 18));
         passwordLabel.setForeground(Color.WHITE);
        lpan.add(passwordLabel);


        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(150,220,190,30);
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
      frame.setVisible(true);
   }
}