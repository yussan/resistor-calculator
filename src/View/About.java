/*
 *      About.java
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


public class About extends JFrame {
							 
	
//PANEL
    private JPanel pnlBase;
    private JPanel pnlHeader;
    private JPanel pnlHelp;
    private JPanel pnlLeft; 
    
    private JPanel pnlContent;
    private JPanel pnlFooter;
    private JPanel pnlExit;
    
//BUTTON

 //initialize button 
    private JButton btnHelp;
    private JButton btnExit;
    
//LABEL
	private JLabel lblTitle;
	private JLabel lblHeader;
	private JLabel lblLeft;
	private JLabel lblContent;
	private JLabel lblFooter;

	
//FONT
	private Font font;
	
	private ImageIcon image;
   
public About() {
        initComponent();
        this.setLocationRelativeTo(this);
       
    }

    public void initComponent() {
    	//PANEL
        pnlBase = new JPanel();
        pnlHeader = new JPanel();
        pnlHelp = new JPanel();
        pnlLeft = new JPanel();
        pnlContent = new JPanel();
        pnlFooter = new JPanel();
        pnlExit = new JPanel();
        
        //BUTTON
        btnHelp = new JButton();
        btnExit = new JButton();
        
        //LABEL 
 		lblTitle = new JLabel();
	 	lblHeader = new JLabel();
		lblLeft = new JLabel();
		lblFooter = new JLabel();
		lblContent = new JLabel();
		
		font = new Font("Calibri", 1, 20);
		
        this.setTitle("ABOUT");
        this.getContentPane().setLayout(null);
        this.setResizable(false);
        this.setSize(805,581);
        this.add(pnlBase);
        
//BASIC PANEL
        pnlBase.setLayout(null);
        pnlBase.setBackground(new Color(243, 238, 226));
        pnlBase.setOpaque(true);
        pnlBase.setBounds(0,0, 800, 600);
        
        pnlHeader.setLayout(null);
        pnlHeader.setBackground(new Color(243, 238, 226));
        pnlHeader.setOpaque(true);
        pnlBase.add(pnlHeader);
        pnlHeader.setBounds(0, 0, 800, 75);
        
        lblHeader.setOpaque(false);
        pnlHeader.add(lblHeader);
        lblHeader.setBounds(0, 0, 730, 75);
               	      

	//PANEL & BUTTON HELP
        pnlContent.setLayout(null);
        pnlContent.setBackground(new Color(243, 238, 226));
        pnlContent.setOpaque(true);
        pnlBase.add(pnlContent);
        pnlContent.setBounds(0, 70, 800, 470);
       
	//FOOTER
        pnlFooter.setLayout(null);
        pnlFooter.setBackground(new Color(243, 238, 226)); 
        pnlFooter.setOpaque(true);
        pnlBase.add(pnlFooter);
        pnlFooter.setBounds(0,545,730,70);
 
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
       
      //LABEL
      	lblContent.setLayout(null);
      	//lblCOntent.setBorderPainted(true);
      	lblContent.setOpaque(true);
      	pnlContent.add(lblContent);
      	lblContent.setBounds(100,50,600, 350);
      	
    	imageControl();
    	eventControl();
    }
    
	public void imageControl(){
		image = new ImageIcon(getClass().getResource("/Images/home1.png"));
		btnExit.setIcon(image);
		image = new ImageIcon(getClass().getResource("/Images/aboutcontent.PNG"));
		lblContent.setIcon(image);
		image = new ImageIcon(getClass().getResource("/Images/about.PNG"));
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
        About me = new About();
        me.setVisible(true);
    }
}
//end of code
