/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author MSI GF63-024
 */
public class ViewAbout extends JFrame{
     public JPanel backgroundawal = new JPanel();
    public JPanel panel1 = new JPanel();
    public JPanel panel2 = new JPanel();
    public JPanel panel3 = new JPanel();
    public JLabel ltambah = new JLabel();
    public JLabel ljudul = new JLabel("PERPUSTAKAAN");
//    public ImageIcon ic = new ImageIcon(getClass().getResource("/main.jpg"));
//    public JButton gambar1 = new JButton("gambar",ic);
    public JLabel kata1 = new JLabel("ABOUT US");
    public JLabel lcopyright = new JLabel("@Copyright 2020") ;
    public JButton btnhome = new JButton("Home");
    public JButton btnpinjam = new JButton("Pinjam");
    public JButton btntampil = new JButton("Tampil");
    public JButton btnabout = new JButton("About us");
    public JButton btnlogout = new JButton("Logout");
    public Font fjudul= new Font("Tahoma", Font.BOLD + Font.ITALIC, 21) ;
            
        public ViewAbout () {
           backgroundawal.setLayout(null);
           panel1.setLayout(null);
           panel2.setLayout(null);
           panel3.setLayout(null);
           setVisible(false);
           setSize(800,700);
           setDefaultCloseOperation(EXIT_ON_CLOSE);
           setLocationRelativeTo(null);
           setTitle("Main Menu");
           
           add(backgroundawal);
           backgroundawal.add(panel1);
           backgroundawal.add(panel2);
           backgroundawal.add(panel3);
           panel1.add(ljudul);
           panel2.add(btnhome);
           panel2.add(btnpinjam);
           panel2.add(btntampil);
           panel2.add(btnabout);
           panel2.add(btnlogout);
           panel2.add(lcopyright);
           panel3.add(kata1);
//           panel1.add(gambar1);
           
           backgroundawal.setBackground(Color.gray);
           panel1.setBackground(Color.CYAN);
           panel2.setBackground(Color.CYAN);
           panel3.setBackground(Color.CYAN);
           
           ljudul.setFont(fjudul);
           kata1.setFont(new java.awt.Font("TAHOMA" ,0 ,30));
//           gambar1.setIcon(new ImageIcon("main.jpg"));
           
           backgroundawal.setBounds(0,0,800,700);
           panel1.setBounds(0,0,800,120);
           panel2.setBounds(0,130,200,800);
           panel3.setBounds(210,130,600,800);
           
//           gambar1.setBounds(200,45,30,20);
           ljudul.setBounds(330,45,200,20);
           btnhome.setBounds(50,80,100,30);
           btnpinjam.setBounds(50,150,100,30);
           btntampil.setBounds(50,220,100,30);
           btnabout.setBounds(50,290,100,30);
           btnlogout.setBounds(50,360,100,30);
           lcopyright.setBounds(50, 450, 100, 20);
           kata1.setBounds(230,200,400,30);
           
        }
}
