/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author MSI GF63-024
 */
public class ViewPinjam extends JFrame{
    public JLabel ljudul = new JLabel("PERPUSTAKAAN");
    public JLabel ljudulpinjam = new JLabel("Pinjam Buku");
    public JLabel lidanggota = new JLabel("ID anggota         :");
    public JLabel lnamaanggota = new JLabel("Nama Anggota   :");
    public JLabel lidbuku = new JLabel("ID Buku              :");
    public JLabel ljudulbuku = new JLabel("Judul Buku         :");
    public JLabel kata1 = new JLabel("========================");
    public JLabel kata2 = new JLabel("========================");
    public JTextField tfidanggota = new JTextField();
    public JTextField tfnamaanggota = new JTextField();
    public JTextField tfidbuku = new JTextField();
    public JTextField tfjudulbuku = new JTextField();
    public JLabel lcopyright = new JLabel("@Copyright 2020");
    public JButton btntambah = new JButton("Tambah");
    public JButton btnreset = new JButton("Reset");
    public JPanel background = new JPanel();
    public JPanel panel1 = new JPanel();
    public JPanel panel2 = new JPanel();
    public JPanel panel3 = new JPanel();
    public JButton btnhome = new JButton("Home");
    public JButton btnpinjam = new JButton("Pinjam");
    public JButton btntampil = new JButton("Tampil");
    public JButton btnabout = new JButton("About us");
    
    public ViewPinjam () {
        background.setLayout(null);
        panel1.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(null);
        setVisible(false);
        setSize(800,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Pinjam Buku");
        
        add(background);
        background.add(panel1);
        background.add(panel2);
        background.add(panel3);
        panel1.add(ljudul);
        panel2.add(btnhome);
        panel2.add(btnpinjam);
        panel2.add(btntampil);
        panel2.add(btnabout);
        panel2.add(lcopyright);
        panel3.add(kata1);
        panel3.add(kata2);
        panel3.add(ljudulpinjam);
        panel3.add(lidanggota);
        panel3.add(lnamaanggota);
        panel3.add(lidbuku);
        panel3.add(ljudulbuku);
        panel3.add(tfidanggota);
        panel3.add(tfnamaanggota);
        panel3.add(tfidbuku);
        panel3.add(tfjudulbuku);
        panel3.add(btntambah);
        panel3.add(btnreset);
        
        ljudul.setFont(new java.awt.Font("Helvetica", 0, 20));
        lidanggota.setFont(new java.awt.Font("Helvetica", 0, 18));
        lidbuku.setFont(new java.awt.Font("Helvetica", 0, 18));
        ljudulbuku.setFont(new java.awt.Font("Helvetica", 0, 18));
        lnamaanggota.setFont(new java.awt.Font("Helvetica", 0, 18));
        ljudulpinjam.setFont(new java.awt.Font("Helvetica", 0, 20));
        
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
        lcopyright.setBounds(50, 450, 100, 20);
        //PANEL 3 
        ljudulpinjam.setBounds(230,60,150,20);
        kata2.setBounds(200,40,200,20);
        kata1.setBounds(200,80,200,20);
        lidanggota.setBounds(80,150,150,20);
        lnamaanggota.setBounds(80,190,150,20);
        lidbuku.setBounds(80,230,150,20);
        ljudulbuku.setBounds(80,270,150,20);
        tfidanggota.setBounds(240,150,200,20);
        tfnamaanggota.setBounds(240,190,200,20);
        tfidbuku.setBounds(240,230,200,20);
        tfjudulbuku.setBounds(240,270,200,20);
        btntambah.setBounds(150,330,100,30);
        btnreset.setBounds(260,330,100,30);
        
    }
}
