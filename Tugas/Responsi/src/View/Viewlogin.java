package View;


import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI GF63-024
 */
public class Viewlogin extends JFrame{
    public JLabel lJudul = new JLabel("Login User");
    public JLabel kata1 = new JLabel("================");
    public JLabel kata2 = new JLabel("================");
    public JLabel lUsername = new JLabel("Username");
    public JTextField tfUsername = new JTextField();
    
    public JLabel lPass = new JLabel("Password");
    public JPasswordField tfPass = new JPasswordField();
    
    public JButton btnLogin = new JButton("Login");
    public JButton btnExit = new JButton("Exit");
    public JPanel panelbackground = new JPanel (); 

    public Viewlogin(){
        setTitle("PERPUSTAKAAN LOGIN");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        panelbackground.setLayout(null);
        setSize(400, 400);
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(btnLogin);
        
        add(panelbackground) ;
        panelbackground.add(lJudul);
        panelbackground.add(kata1);
        panelbackground.add(kata2);
        panelbackground.add(lUsername);
        panelbackground.add(tfUsername);
        panelbackground.add(lPass);
        panelbackground.add(tfPass);
        panelbackground.add(btnLogin);
        panelbackground.add(btnExit);
        
        lUsername.setFont(new java.awt.Font("Helvetica", 0, 18));
        lPass.setFont(new java.awt.Font("Helvetica", 0, 18));
        lJudul.setFont(new java.awt.Font("Helvetica", 0, 18));
        kata1.setFont(new java.awt.Font("Helvetica", 0, 18));
        kata2.setFont(new java.awt.Font("Helvetica", 0, 18));
        
        panelbackground.setBackground(Color.orange);
        btnLogin.setBackground(Color.BLUE);
        btnLogin.setForeground(Color.yellow);
        btnExit.setBackground(Color.red);
        btnExit.setForeground(Color.yellow);
        
        panelbackground.setBounds(0,0,400,450); 
        lJudul.setBounds(140,40,200,20);
        kata1.setBounds(100,30,200,10);
        kata2.setBounds(100,60,200,10);  
        lUsername.setBounds(60, 100, 120, 25);       
        tfUsername.setBounds(60, 125, 260, 25);
        lPass.setBounds(60, 155, 120, 25);       
        tfPass.setBounds(60, 180, 260, 25);
        btnLogin.setBounds (80,230,100,30);
        btnExit.setBounds(200,230,100,30);
        
    }
}
