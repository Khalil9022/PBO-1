/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSI GF63-024
 */
public class ViewTampil extends JFrame {
    public JLabel ljudul = new JLabel("PERPUSTAKAAN");
    public JLabel ljudultampil = new JLabel("Tampil Pinjaman Buku");
    public JLabel kata1 = new JLabel("==========================");
    public JLabel kata2 = new JLabel("==========================");
    public JLabel lcopyright = new JLabel("@Copyright 2020");
    public JPanel background = new JPanel();
    public JPanel panel1 = new JPanel();
    public JPanel panel2 = new JPanel();
    public JPanel panel3 = new JPanel();
    public JButton btnhome = new JButton("Home");
    public JButton btnpinjam = new JButton("Pinjam");
    public JButton btntampil = new JButton("Tampil");
    public JButton btnabout = new JButton("About us");
    public JButton btnhapus = new JButton("Hapus");
    public JButton btnedit = new JButton("Edit");
    public JButton btnlogout = new JButton("Logout");
    
    //TABEL
    public JTable tabel ;
    public DefaultTableModel tabelModel;
    public JScrollPane scrollPane; 
    public Object namaKolom [] =  {"id","no_hp","umur","email",""} ; 
    
    public ViewTampil () {
        background.setLayout(null);
        panel1.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(null);
        setVisible(false);
        setSize(800,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Pinjam Buku");
        
        tabelModel = new DefaultTableModel(namaKolom,0);
        tabel = new JTable(tabelModel);    
        scrollPane = new JScrollPane(tabel);
        
        add(background);
        background.add(panel1);
        background.add(panel2);
        background.add(panel3);
        panel1.add(ljudul);
        panel2.add(btnhome);
        panel2.add(btnpinjam);
        panel2.add(btntampil);
        panel2.add(btnabout);
        panel2.add(btnlogout);
        panel2.add(lcopyright);
        panel3.add(ljudultampil);
        panel3.add(kata1);
        panel3.add(kata2);
        panel3.add(scrollPane);
        panel3.add(btnhapus);
        panel3.add(btnedit);
        
        ljudul.setFont(new java.awt.Font("Helvetica", 0, 20));
        ljudultampil.setFont(new java.awt.Font("Helvetica", 0, 18));
        
        background.setBackground(Color.gray);
        panel1.setBackground(Color.CYAN);
        panel2.setBackground(Color.CYAN);
        panel3.setBackground(Color.CYAN);
        
        background.setBounds(0,0,800,700);
        panel1.setBounds(0,0,800,120);
        panel2.setBounds(0,130,200,800);
        panel3.setBounds(210,130,600,800);
        
        //PANEL1
        ljudul.setBounds(330,45,200,20);
        //PANEL2
        btnhome.setBounds(50,80,100,30);
        btnpinjam.setBounds(50,150,100,30);
        btntampil.setBounds(50,220,100,30);
        btnabout.setBounds(50,290,100,30);
        btnlogout.setBounds(50,360,100,30);
        lcopyright.setBounds(50, 450, 100, 20);
        //PANEL 3 
        ljudultampil.setBounds(200,30,300,20);
        kata1.setBounds(200,10,200,20);
        kata2.setBounds(200,50,200,20);
        btnedit.setBounds(180,100,100,25);
        btnhapus.setBounds(300,100,100,25);
        scrollPane.setBounds(20,150,530,360);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        btnedit.setEnabled(false);
        btnhapus.setEnabled(false);
        
    }
}
