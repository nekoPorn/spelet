package anal_sex;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JList;
import java.beans.PropertyChangeListener;
import java.util.Random;
import java.beans.PropertyChangeEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Graphic_Interface extends JFrame {
	Random rand =new Random();

	static boolean[] drum  = {false,false,false,false,false,false};
	static short strek =1;
	static short helf =100;
	static boolean cheat=true;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Graphic_Interface frame = new Graphic_Interface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public Graphic_Interface() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		// Main jpanel
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		// panel for text
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 0, 170, 225);
		panel.add(panel_2);
		panel_2.setLayout(null);
		//health Jlabel
		JLabel lblNewLabel = new JLabel("Helf:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(0, 0, 70, 40);
		panel_2.add(lblNewLabel);
		//health points Jlabel
		JLabel lblNewLabel_1 = new JLabel("100");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(71, 0, 89, 40);
		panel_2.add(lblNewLabel_1);
		//streak Jlabel
		JLabel lblNewLabel_2 = new JLabel("strek:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(0, 91, 70, 40);
		panel_2.add(lblNewLabel_2);
		// game comments Jlabel
		JLabel lblNewLabel_3 = new JLabel("load n spin");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(30, 165, 106, 50);
		panel_2.add(lblNewLabel_3);
		//score counter
		JLabel lblNewLabel_5 = new JLabel("0");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(80, 103, 80, 21);
		panel_2.add(lblNewLabel_5);
		
		//Jpanel for buttons 
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 235, 296, 218);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		//panel for drumspin button
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(139, 0, 147, 140);
		panel_3.add(panel_5);
		panel_5.setLayout(null);
		
		//button that checks if you cheat not critical
		JButton btnNewButton = new JButton("Spin dat drum");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 10, 127, 120);
		panel_5.add(btnNewButton);
		btnNewButton.addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e){
		    	lblNewLabel_3.setText("do a pew");
		    	
		    	//cheat detection
		    	for (int i=0; i<6; i++) {
		    		if(i==0) cheat=true;
		    		if(drum[i]) {
		    			
		    			cheat=false;
		    			break;
		    		}
					
				}
		    if(cheat==true) {
		    	lblNewLabel_3.setText("u cheat");
		    	lblNewLabel_5.setText("-32768");
		    	strek =-32768;
		    }
		    }
		});
		//panel that holds pew pew button
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 0, 139, 140);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		//not text but img of revolver drum
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setForeground(new Color(0, 0, 128));
		lblNewLabel_4.setIcon(new ImageIcon(Graphic_Interface.class.getResource("/anal_sex/gay sex.png")));
		lblNewLabel_4.setBounds(10, 10, 119, 120);
		panel_4.add(lblNewLabel_4);
		//button for bullet
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("");
		rdbtnNewRadioButton_5.setBackground(new Color(0, 0, 0));
		rdbtnNewRadioButton_5.setHorizontalAlignment(SwingConstants.RIGHT);
		rdbtnNewRadioButton_5.setVerticalAlignment(SwingConstants.TOP);
		rdbtnNewRadioButton_5.setBounds(78, 69, 20, 20);
		panel_4.add(rdbtnNewRadioButton_5);
		rdbtnNewRadioButton_5.addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e){
		    	if(drum[5])drum[0]=false;
		    	else drum[5]=true;
		    	
		    }
		});
		//button for bullet
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("");
		rdbtnNewRadioButton_4.setBackground(new Color(0, 0, 0));
		rdbtnNewRadioButton_4.setBounds(78, 42, 21, 21);
		panel_4.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e){
		    	if(drum[5])drum[5]=false;
		    	else drum[5]=true;
		    	
		    }
		});
		//button for bullet
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("");
		rdbtnNewRadioButton_3.setBackground(new Color(0, 0, 0));
		rdbtnNewRadioButton_3.setBounds(56, 29, 21, 21);
		panel_4.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e){
		    	if(drum[4])drum[4]=false;
		    	else drum[4]=true;
		    	
		    }
		});
		//button for bullet
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("");
		rdbtnNewRadioButton_2.setBackground(new Color(0, 0, 0));
		rdbtnNewRadioButton_2.setBounds(34, 43, 20, 21);
		panel_4.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e){
		    	if(drum[3])drum[3]=false;
		    	else drum[3]=true;
		    	
		    }
		});
		//button for bullet
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("");
		rdbtnNewRadioButton_1.setBackground(new Color(0, 0, 0));
		rdbtnNewRadioButton_1.setBounds(33, 68, 20, 21);
		panel_4.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e){
		    	if(drum[2])drum[2]=false;
		    	else drum[2]=true;
		    	
		    }
		});
		//button for bullet
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setBackground(new Color(0, 0, 0));
		rdbtnNewRadioButton.setBounds(57, 81, 21, 21);
		panel_4.add(rdbtnNewRadioButton);
		//button doing pew pew
		JButton btnNewButton_1 = new JButton("Pew Pew ");
		btnNewButton_1.setBounds(60, 142, 147, 66);
		panel_3.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 20));
		btnNewButton_1.addActionListener( new ActionListener()
		
		{
			//method for shooting
		    @Override
		    public void actionPerformed(ActionEvent e){
		    	
		    	lblNewLabel_3.setText("load n spin");
		    	if (shoot()) {
		    		lblNewLabel_3.setText("u got pew");
		    		lblNewLabel_1.setText("50");
		    		
		    	}else {
		    		lblNewLabel_5.setText(String.valueOf(strek++)); 

		    	}
		    	 if(helf==0) {
		    		 lblNewLabel_3.setText("u ded");
					System.exit(0);
				}
		    	
		    }
		});
		rdbtnNewRadioButton.addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e){
		    	if(drum[1])drum[1]=false;
		    	else drum[1]=true;
		    	
		    }
		});
	}
	//checs if you shot blanc or bullet
	public boolean shoot() {
		int shot =rand.nextInt(6);
		if (drum[shot]) {
			helf-=50;
			if(helf==0) {
				
				System.exit(0);
			}
			return true;
		}
		else return false;
				
		
	}
}

