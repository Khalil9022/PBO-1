import javax.swing.*;

public class ViewForm extends JFrame{
         JLabel ljudul,lkode,lnama,ljenis,lmerek;
         JTextField tkode,tnama,tjenis,tmerek;
         JButton btnconfirm,btnbatal;
        
        public ViewForm() {
            setTitle("TAMBAH DATA");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(null);
            setVisible(false);
            setSize(350,320);
             setLocationRelativeTo(null);
            
            ljudul = new JLabel("Tambah Data");
            lkode = new JLabel("Kode");
            lnama = new JLabel("Nama");
            ljenis = new JLabel("Jenis");
            lmerek = new JLabel("Merek");
            tkode = new JTextField();
            tnama = new JTextField();
            tjenis = new JTextField();
            tmerek = new JTextField();
            btnconfirm = new JButton("Daftar");
            btnbatal = new JButton("Batal");
            
            add(ljudul) ; 
            ljudul.setBounds(135,10,100,50);
            add(lkode);
            lkode.setBounds(20,70,90,20);
            add(tkode);
            tkode.setBounds(130,70,170,20);
            add(lnama);
            lnama.setBounds(20,100,90,20);
            add(tnama);
            tnama.setBounds(130,100,170,20);
            add(ljenis);
            ljenis.setBounds(20,130,90,20);
            add(tjenis);
            tjenis.setBounds(130,130,170,20);
            add(lmerek);
            lmerek.setBounds(20,160,90,20);
            add(tmerek);
            tmerek.setBounds(130,160,170,20);
            
            add(btnconfirm);
            btnconfirm.setBounds(200,210,80,20);
            add(btnbatal);
            btnbatal.setBounds(70,210,80,20);
        }
        
        public String getKode () {
            return tkode.getText(); 
        }
        public String getNama () {
            return tnama.getText(); 
        }
        public String getJenis () {
            return tjenis.getText(); 
        }
        public String getMerek () {
            return tmerek.getText(); 
        }
}
