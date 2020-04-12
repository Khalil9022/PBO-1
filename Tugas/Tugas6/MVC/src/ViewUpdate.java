
import javax.swing.*;

public class ViewUpdate extends JFrame{
        
        JLabel ljuduledit = new JLabel("EDIT BARANG");
        JLabel lkode = new JLabel("kode");
        JLabel lnamaKode = new JLabel();
        JLabel lnama = new JLabel("nama");
        JTextField tfnama = new JTextField();
        JLabel ljenis = new JLabel("jenis"); 
        JTextField tfjenis = new JTextField();
        JLabel lmerek = new JLabel("Merek");
        JTextField tfmerek= new JTextField();
        
        JButton btnUpdate = new JButton("Update");
        JButton btnBatal = new JButton("Batal");


    public ViewUpdate()  {
        setTitle("UPDATE BARANG");
        setSize(350,400);
        setVisible(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        add(ljuduledit);
        ljuduledit.setBounds(130,50,100,20);
        add(lkode);
        lkode.setBounds(20,80,60,20);
        add(lnamaKode);
        lnamaKode.setBounds(100,80,200,20);
        add(lnama);
        lnama.setBounds(20,110,60,20);
        add(tfnama);
        tfnama.setBounds(100,110,200,20);
        add(ljenis);
        ljenis.setBounds(20,140,60,20);
        add(tfjenis);
        tfjenis.setBounds(100,140,200,20);
        add(lmerek);
        lmerek.setBounds(20,170,60,20);
        add(tfmerek);
        tfmerek.setBounds(100,170,200,20);
        
        add(btnBatal);
        btnBatal.setBounds(70,200,100,20);
        add(btnUpdate);
        btnUpdate.setBounds(190,200,100,20);


    }    
        
}
