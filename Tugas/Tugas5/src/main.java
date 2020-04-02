
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import com.mysql.jdbc.Driver;


public class main extends JFrame{

            JPanel pPanel = new JPanel();
            JLabel lJudul , lKode, lNama , lJenis , lMerek ; 
            JTextField tfKode , tfNama , tfJenis , tfMerek; 
            JButton bSimpan, bReset ;
            
            String DBurl = "jdbc:mysql://localhost:3306/pbo_tugas_5_barang";
            String DBusername = "root";
            String DBpassword = "";
            Connection koneksi ; 
            Statement statement ;
            
            public main () {
                setTitle("Barang Mirota Kampus");
                setSize(400,400);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                setVisible(true);
                setLayout(null);
                setLocationRelativeTo(null);
                
                
                lJudul = new JLabel("INPUT BARANG");
                lKode = new JLabel("Kode");
                lNama = new JLabel("Nama");
                lJenis = new JLabel("Jenis");
                lMerek = new JLabel("Merek");
                tfKode = new JTextField(10);
                tfNama = new JTextField(20);
                tfJenis = new JTextField(20);
                tfMerek= new JTextField(20);
                bSimpan= new JButton("Simpan");
                bReset= new JButton("Reset");

                add(pPanel);
                pPanel.setBounds(10, 10, 755, 525);
                pPanel.setLayout(null);
                pPanel.add(lJudul);
                pPanel.add(lKode);
                pPanel.add(tfKode);
                pPanel.add(lNama);
                pPanel.add(tfNama);
                pPanel.add(lJenis);
                pPanel.add(tfJenis);
                pPanel.add(lMerek);
                pPanel.add(tfMerek);
                pPanel.add(bSimpan);
                pPanel.add(bReset);
                
                lJudul.setBounds(135,50,120,20);
                lKode.setBounds(50,100,120,20);
                tfKode.setBounds(170,100,120,20);
                lNama.setBounds(50,130,120,20);
                tfNama.setBounds(170,130,120,20);
                lJenis.setBounds(50,160,120,20);
                tfJenis.setBounds(170,160,120,20);
                lMerek.setBounds(50,190,120,20);
                tfMerek.setBounds(170,190,120,20);
                bReset.setBounds(50, 240, 100, 20);
                bSimpan.setBounds(170, 240, 100, 20);
                
                bSimpan.addActionListener(new ActionListener(){
                        
                    @Override
                        public void actionPerformed(ActionEvent e) {
                            masukkanData() ;
                        }
                });
                
                bReset.addActionListener(new ActionListener(){
                        
                    @Override
                        public void actionPerformed(ActionEvent e) {
                           klikreset() ;
                        }
                });
                
            
            }
            
            public void masukkanData (){
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    koneksi = DriverManager.getConnection(DBurl, DBusername , DBpassword);
                    statement = koneksi.createStatement();
                    statement.executeUpdate("INSERT INTO barang VALUES "
                            + "('" + tfKode.getText() + "','" + tfNama.getText() + "','" + tfJenis.getText() + "','" + tfMerek.getText() + "')");
                    JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan!" , "Hasil" , JOptionPane.INFORMATION_MESSAGE);
                    statement.close();
                    koneksi.close();
                }
                catch (SQLException ex) { 
                    JOptionPane.showMessageDialog(null, "Data gagal disimpan!" , "hasil", JOptionPane.ERROR_MESSAGE);
                }
                catch (ClassNotFoundException ex) { 
                    JOptionPane.showMessageDialog(null, "Driver tidak ditemukan!" , "hasil", JOptionPane.ERROR_MESSAGE);
                }
                
                
            }
        
    public void klikreset () {
        tfKode.setText("");
        tfNama.setText("");
        tfJenis.setText("");
        tfMerek.setText("");
    }       
            
    public static void main(String[] args) {
        new main();
    }
    
    
}
