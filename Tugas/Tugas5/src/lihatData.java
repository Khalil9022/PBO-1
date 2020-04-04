
import java.awt.FlowLayout;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class lihatData extends JFrame {
    
    //koneksi
    String DBurl = "jdbc:mysql://localhost:3306/pbo_tugas_5_barang";
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi ; 
    Statement statement ;
    
    String data[][] = new String [100][4];
    String kolom[] = {"Kode","Nama","Jenis","Merek" };
    JTable tabel ;
    JScrollPane scrollPane ;
   
    public lihatData() { 
        setTitle("Lihat Data Barang");
        
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DBurl,DBusername,DBpassword);
            statement = koneksi.createStatement();
            String sql = "SELECT * FROM barang";
            ResultSet res = statement.executeQuery(sql);
            
            int p = 0 ;
            while (res.next()) {
                data[p][0] = res.getString("Kode");
                data[p][1] = res.getString("nama");
                data[p][2] = res.getString("jenis");
                data[p][3] = res.getString("merek");
                p++;
            }
            statement.close();
            koneksi.close();
            
        }
        catch (SQLException ex ) {
            JOptionPane.showMessageDialog(null, "Data gagal ditampilkan!", "Hasil" , JOptionPane.ERROR_MESSAGE );
        }
        catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Class tidak ditemukan" , "Hasil", JOptionPane.ERROR_MESSAGE);
        }
        tabel = new JTable(data,kolom) ; 
        scrollPane = new JScrollPane(tabel);
        
        setLayout(new FlowLayout());
        add(scrollPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        new lihatData();
    }
    
}
