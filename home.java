import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;
import javax.swing.border.MatteBorder;
import javax.swing.border.Border;
import javax.swing.UIManager;

 class frame {

	private static final String k = null;
	private JFrame frame;

	public static void main(String[] args) {
		frame window = new frame();
	}
	private static class RoundedBorder implements Border {
	    private int radius;
	    RoundedBorder(int radius) {
	        this.radius = radius;
	    }
	    public Insets getBorderInsets(Component c) {
	        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
	    }
	    public boolean isBorderOpaque() {
	        return true;
	    }
	    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
	        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
	    }
	}
	public frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame = new JFrame();
		frame.setBounds(100, 100, 1080,1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(8,8));
		frame.getRootPane().setBorder(BorderFactory.createMatteBorder(4,4,4,4,Color.BLACK));
		frame.setVisible(true);
		frame.setBackground(Color.GRAY);
		//Top Panel....................................................................................................
		JPanel tp = new JPanel();
		tp.setBorder(new LineBorder( Color.DARK_GRAY,3,true));
		frame.getContentPane().add(tp, BorderLayout.NORTH);
		tp.setLayout(new BoxLayout(tp, BoxLayout.Y_AXIS));
		    //subpanel1..........................................................................................
			JPanel subp1 = new JPanel();
			subp1.setLayout(new BorderLayout(10,10));
			subp1.setBackground(UIManager.getColor("OptionPane.warningDialog.titlePane.foreground"));
			JLabel name = new JLabel("          magicBricks");
			name.setFont(new Font("Montserrat", Font.BOLD, 18));
			name.setForeground(Color.WHITE);
			name.setPreferredSize(new Dimension(250, 50));
			JButton logout = new JButton("logout");
			logout.setBorder(new RoundedBorder(15));
			logout.setFont(new Font("Montserrat", Font.BOLD, 18));
			logout.setForeground(UIManager.getColor("OptionPane.warningDialog.titlePane.foreground"));
			logout.setPreferredSize(new Dimension(150, 50));
			logout.setBackground(Color.WHITE);			
			subp1.add(name,BorderLayout.WEST);
			subp1.add(logout,BorderLayout.EAST);
			//subpanel2..........................................................................................
			JPanel subp2 = new JPanel();
			subp2.setBackground(Color.WHITE);
			subp2.setLayout(new FlowLayout(4,200,10));
			String [] info1 = { "a","b","c"};
			
			JButton buy = new JButton("buy");
			buy.setBorder(new LineBorder(Color.GRAY,3,true));
			//comboBox_2.setBorder(new RoundedBorder(5));
			buy.setPreferredSize(new Dimension(150,40));
			subp2.add(buy);
			
			JButton sell= new JButton("sell");
			sell.setBorder(new LineBorder(Color.GRAY,3,true));
			//comboBox_1.setBorder(new RoundedBorder(5));
			sell.setPreferredSize(new Dimension(150,40));
			subp2.add(sell);

			JButton rent = new JButton("rent");
			rent.setBorder(new LineBorder(Color.GRAY,3,true));
			//comboBox_4.setBorder(new RoundedBorder(5));
			rent.setPreferredSize(new Dimension(150,40));
			subp2.add(rent);	
			
			JButton loan = new JButton("loan");
			loan.setBorder(new LineBorder(Color.GRAY,3,true));
			//comboBox.setBorder(new RoundedBorder(5));
			loan.setPreferredSize(new Dimension(150,40));
			subp2.add(loan);
			
			JButton faq = new JButton("faq");
			faq.setBorder(new LineBorder(Color.GRAY,3,true));
			//comboBox_3.setBorder(new RoundedBorder(5));
			faq.setPreferredSize(new Dimension(150,40));
			subp2.add(faq);
			//adding panels.......................................................................................			
			tp.add(subp1);
			tp.add(subp2);
		//Mid panel...............................................................................................
		 
		
		
//		JPanel mp = new JPanel();
//		mp.setBounds(new Rectangle(0, 0, screenSize.width,( screenSize.height)/3));
//		mp.setBorder(new LineBorder(Color.BLACK,3));
//		mp.setLayout(new BoxLayout(mp,BoxLayout.Y_AXIS));
		
		
		JTextPane mp = new JTextPane();
		mp.insertIcon ( new ImageIcon("/home/chethan/Documents/java_project/img2.jpg"));
		//Image img0 = new ImageIcon(this.getClass().getResource("/img2.jpg")).getImage();
		//mp.insertIcon ( new ImageIcon(img0));
		//mp.setBackground(Color.GRAY);
		mp.setBounds(new Rectangle(0, 0, 100, 100));
		mp.setBorder(new LineBorder(Color.WHITE,3,true));
		mp.setLayout(null);
		//scrollableTextArea.add(mp); 
		JLabel l1 = new JLabel();
		l1.setLocation(375, 30);
		Image img = new ImageIcon("/home/chethan/Documents/java_project/label1.jpeg").getImage();
		l1.setIcon(new ImageIcon(img));
		//l1.insertIcon ( new ImageIcon("/home/wekster/Documents/java/proj/label1.jpeg"));
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		l1.setBorder(new LineBorder(Color.WHITE,3,true));
		l1.setSize(new Dimension(950, 275));
		
			
		frame.getContentPane().add(mp, BorderLayout.CENTER);
		mp.add(l1);
		
		JTextPane text = new  JTextPane();
		text.setText("hi");		 
		mp.add(text);
		text.setBounds(875,60, 400, 215);		
		JLabel l2 = new JLabel();
		l2.setBorder(new RoundedBorder(5));
		l2.setLocation(375, 315);
		Image img1 = new ImageIcon("/home/chethan/Documents/java_project/label2.jpg").getImage();
		//l2.insertIcon ( new ImageIcon("/home/wekster/Documents/java/proj/label2.jpg"));
		//Image img1 = new ImageIcon(this.getClass().getResource("/label2.jpg")).getImage();
		l2.setIcon(new ImageIcon(img1));
		l2.setAlignmentX(Component.CENTER_ALIGNMENT);
		l2.setBorder(new LineBorder(Color.WHITE,3,true));
		l2.setSize(new Dimension(950, 275));
		//l2.setIcon(new ImageIcon(img1));
		mp.add(l2);
		JTextPane text1 = new  JTextPane();
		text1.setText("hi");		 
		mp.add(text1);
		text1.setBounds(875,350, 400, 215);
		JLabel l3 = new JLabel();
		l3.setBorder(new RoundedBorder(5));
		l3.setLocation(375, 600);
		l3.setSize(new Dimension(950, 275));
		l3.setBorder(new LineBorder(Color.WHITE,3,true));
		Image img2 = new ImageIcon("/home/chethan/Documents/java_project/label3.jpeg").getImage();
		// l3.insertIcon ( new ImageIcon("/home/wekster/Documents/java/proj/label3.jpeg"));
		//Image img2 = new ImageIcon(this.getClass().getResource("/label3.jpeg")).getImage();
		l3.setIcon(new ImageIcon(img2));
		mp.add(l3);
		JTextPane text2 = new  JTextPane();
		text2.setText("hi");		 
		mp.add(text2);
		text2.setBounds(875,630, 400, 215);
		//frame.getContentPane().add(mp, BorderLayout.CENTER);
		
		JButton lbt1 = new JButton("Visit");
		lbt1.setFont(new Font("Montserrat", Font.BOLD, 18));
		lbt1.setBorder(new RoundedBorder(15));
		lbt1.setBorder(new LineBorder(Color.GRAY,3,true));
		lbt1.setBounds(790, 205, 110, 40);
		l1.add(lbt1);
		
		JButton lbt2 = new JButton("Visit");
		lbt2.setFont(new Font("Montserrat", Font.BOLD, 18));
		lbt2.setBorder(new RoundedBorder(15));
		lbt2.setBorder(new LineBorder(Color.GRAY,3,true));
		lbt2.setBounds(790, 210, 110,40 );
		l2.add(lbt2);
		
		JButton lbt3 = new JButton("Visit");
		lbt3.setFont(new Font("Montserrat", Font.BOLD, 18));
		lbt3.setBorder(new RoundedBorder(15));
		lbt3.setBorder(new LineBorder(Color.GRAY,3,true));
		lbt3.setBounds(790, 210, 110, 40);
		l3.add(lbt3);		
		
	}

}