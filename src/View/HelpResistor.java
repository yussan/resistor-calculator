/*
 *      HelpResistor.java
 *      
 *      Copyright 2012 Kelompok Pemrograman Lanjut
 * 		11 S1TI 10
 * 		STMIK Amikom Yogyakarta
 *      
 */
//begin of code
package View;

import java.awt.Color;
import javax.print.attribute.standard.Compression;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class HelpResistor extends JFrame {
							 
	
//PANEL
    private JPanel pnlBase;
    private JPanel pnlHeader;
    private JPanel pnlHelp;    
    private JPanel pnlLine1;
  	private JPanel pnlLine2;
  	private JPanel pnlLine3;
  	private JPanel pnlLine4;
    private JPanel pnlLeft; 
    
    private JPanel pnlContent;
    private JPanel pnlFooter;
    private JPanel pnlExit;
    
//BUTTON

 //initialize button 
    //button warna
    //pita 1
    private JButton btnHelp;
    private JButton btnContent;
    private JButton btnExit;
    
//LABEL
	private JLabel lblTitle;
	private JLabel lblHeader;
	private JLabel lblLeft;
	private JLabel lblContent;
	private JLabel lblContent1;
	private JLabel lblFooter;

	
//FONT
	private Font font;
	
	private ImageIcon image;
   
public HelpResistor() {
        initComponent();
        this.setLocationRelativeTo(this);
       
    }

    public void initComponent() {
    	//PANEL
    	//pnlAbout = new JPanel();
        pnlBase = new JPanel();
        pnlHeader = new JPanel();
        pnlHelp = new JPanel();
        pnlLine1 = new JPanel();
        pnlLine2 = new JPanel();
        pnlLine3 = new JPanel();
        pnlLine4 = new JPanel();
        pnlLeft = new JPanel();
        pnlContent = new JPanel();
        pnlFooter = new JPanel();
        pnlExit = new JPanel();
        
        //BUTTON
        btnHelp = new JButton();
        btnContent = new JButton();
    	btnExit = new JButton();
        
        //LABEL 
 		lblTitle = new JLabel();
 		lblContent = new JLabel();
 		lblContent1 = new JLabel();
	 	lblHeader = new JLabel();
		lblLeft = new JLabel();
		lblFooter = new JLabel();
		
		font = new Font("Calibri", 1, 20);
		
        this.setTitle("HELP RESISTOR");
        this.getContentPane().setLayout(null);
        this.setResizable(false);
        this.setSize(805,581);
        this.add(pnlBase);
        
//BASIC PANEL
        pnlBase.setLayout(null);
        pnlBase.setBackground(new Color(243, 238, 226));
        pnlBase.setOpaque(true);
        pnlBase.setBounds(0,0, 800, 600);
        
        lblHeader.setOpaque(false);
        pnlHeader.add(lblHeader);
        lblHeader.setBounds(0, 0, 730, 75);

        pnlHeader.setLayout(null);
        pnlHeader.setBackground(new Color(243, 238, 226));
        pnlHeader.setOpaque(true);
        pnlBase.add(pnlHeader);
        pnlHeader.setBounds(0, 0, 800, 75);
        
    
      	pnlLine1.setLayout(null);
        pnlLine1.setBackground(new Color(245, 134, 52));
        pnlLine1.setOpaque(true);
        pnlHeader.add(pnlLine1);
        pnlLine1.setBounds(20, 65, 155, 10);
        
        pnlLine2.setLayout(null);
        pnlLine2.setBackground(new Color(82, 113, 141)); 
        pnlLine2.setOpaque(true);
        pnlHeader.add(pnlLine2);
        pnlLine2.setBounds(220, 65, 155, 10);
        
        pnlLine3.setLayout(null);
        pnlLine3.setBackground(new Color(245, 134, 52)); 
        pnlLine3.setOpaque(true);
        pnlHeader.add(pnlLine3);
        pnlLine3.setBounds(420, 65, 155, 10);
        
        pnlLine4.setLayout(null);
        pnlLine4.setBackground(new Color(82, 113, 141)); 
        pnlLine4.setOpaque(true);
        pnlHeader.add(pnlLine4);
        pnlLine4.setBounds(620, 65, 155, 10);
        

//PANEL & BUTTON HELP
        pnlContent.setLayout(null);
        pnlContent.setBackground(new Color(243, 238, 226));
        pnlContent.setOpaque(true);
        pnlBase.add(pnlContent);
        pnlContent.setBounds(0, 75, 800, 470);
        
        btnContent.setOpaque(true);
        btnContent.setBorderPainted(true);
        btnContent.setContentAreaFilled(true);
        btnContent.setBorder(null);
        btnContent.setEnabled(true);
        pnlContent.add(btnContent);
        btnContent.setBounds(53, 20, 700, 392);    
        	
        lblContent.setText("*    : If there are none Color Tape on resistor, don't click on pallete left side ");
        lblContent.setFont(new Font("Calibri", 1, 20));
        lblContent.setHorizontalAlignment(JLabel.LEFT);
        lblContent.setVerticalAlignment(JLabel.CENTER);
        lblContent.setOpaque(false);
        pnlContent.add(lblContent);
        lblContent.setBounds(40, 415, 680, 35);
        
        lblContent1.setText("**  : E = Exponent");
        lblContent1.setFont(new Font("Calibri", 1, 20));
        lblContent1.setHorizontalAlignment(JLabel.LEFT);
        lblContent1.setVerticalAlignment(JLabel.CENTER);
        lblContent1.setOpaque(false);
        pnlContent.add(lblContent1);
        lblContent1.setBounds(40, 445, 400, 35);
               
//FOOTER
        pnlFooter.setLayout(null);
        pnlFooter.setBackground(new Color(243, 238, 226)); 
        pnlFooter.setOpaque(true);
        pnlBase.add(pnlFooter);
        pnlFooter.setBounds(0,545,800,70);
 
	//PANEL dan BUTTON EXIT       
        pnlExit.setLayout(null);
        pnlExit.setBackground(new Color(243, 238, 226)); 
        pnlExit.setOpaque(true);
        pnlFooter.add(pnlExit);
        pnlExit.setBounds(680, 10, 110, 40);

	 	btnExit.setOpaque(true);
	 	btnExit.setBorderPainted(true);
        btnExit.setContentAreaFilled(true);
        btnExit.setBorder(null);
        btnExit.setEnabled(true);
        pnlHeader.add(btnExit);
        btnExit.setBounds(765, 5, 30, 30);       
    
    
    	imageControl();
    	eventControl();
    }


 
	public void imageControl(){
		image = new ImageIcon(getClass().getResource("/Images/help1.png"));
		btnHelp.setIcon(image);
		image = new ImageIcon(getClass().getResource("/Images/helpContent.png"));
		btnContent.setIcon(image);
		image = new ImageIcon(getClass().getResource("/Images/home1.png"));
		btnExit.setIcon(image);
		image = new ImageIcon(getClass().getResource("/Images/helpheader.png"));
		lblHeader.setIcon(image);
		}
	
	public void eventControl() {
		btnExit.addActionListener(ActColor);
		} 
	    
	//action listener
	private ActionListener ActColor = new ActionListener() { //action event untuk button pita
	    	 public void actionPerformed(ActionEvent ActC) {
	    	 	if(ActC.getSource().equals(btnExit)){ ///fungsi untuk back ke panel resistor lagi
	    			setVisible(false); 
	    			}
	    	 	}
	};

  		
//@Override
        public void mousePressed(MouseEvent evt) {
            if(evt.getSource().equals(btnExit)) {
                btnExit.setIcon(new ImageIcon(getClass().getResource("/Images/home2.png")));
            }
        }

// @Override
        public void mouseReleased(MouseEvent evt) {
            if(evt.getSource().equals(btnExit)) {
                btnExit.setIcon(new ImageIcon(getClass().getResource("/Images/home1.png")));
        
            }
        }   
 
    public static void main(String[] args) {
        HelpResistor me = new HelpResistor();
        me.setVisible(true);
    }
}
    
//end of code
