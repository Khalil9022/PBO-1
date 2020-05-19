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
import javax.swing.JTextField;

/**
 *
 * @author MSI GF63-024
 */
public class ViewEdit extends JFrame{
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
    public JTextField id = new JTextField();
    public JLabel lcopyright = new JLabel("@Copyright 2020");
    public JButton btnedit = new JButton("Edit");
    public JButton btnbatal = new JButton("Batal");
    public JPanel background = new JPanel();
    public JPanel panel1 = new JPanel();
    public JPanel panel2 = new JPanel();
    public JPanel panel3 = new JPanel();
    
    public ViewEdit () {
        background.setLayout(null);
        panel1.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(null);
        tfidanggota.setEnabled(false);
        setVisible(false);
        setSize(525,475);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Pinjam Buku");
        
        add(background);
        background.add(ljudul);
        background.add(kata1);
        background.add(kata2);
        background.add(lidanggota);
        background.add(lnamaanggota);
        background.add(lidbuku);
        background.add(ljudulbuku);
        background.add(tfidanggota);
        background.add(tfnamaanggota);
        background.add(tfidbuku);
        background.add(tfjudulbuku);
        background.add(btnedit);
        background.add(btnbatal);
        
        ljudul.setFont(new java.awt.Font("Helvetica", 0, 20));
        lidanggota.setFont(new java.awt.Font("Helvetica", 0, 18));
        lidbuku.setFont(new java.awt.Font("Helvetica", 0, 18));
        ljudulbuku.setFont(new java.awt.Font("Helvetica", 0, 18));
        lnamaanggota.setFont(new java.awt.Font("Helvetica", 0, 18));
        
        background.setBackground(Color.WHITE);
        
        background.setBounds(0,0,800,700);
        
        ljudul.setBounds(180,60,200,20);
        kata2.setBounds(175,40,200,20);
        kata1.setBounds(175,80,200,20);
        lidanggota.setBounds(80,150,150,20);
        lnamaanggota.setBounds(80,190,150,20);
        lidbuku.setBounds(80,230,150,20);
        ljudulbuku.setBounds(80,270,150,20);
        tfidanggota.setBounds(240,150,200,20);
        tfnamaanggota.setBounds(240,190,200,20);
        tfidbuku.setBounds(240,230,200,20);
        tfjudulbuku.setBounds(240,270,200,20);
        btnedit.setBounds(150,330,100,20);
        btnbatal.setBounds(260,330,100,20);
        
    }
}
