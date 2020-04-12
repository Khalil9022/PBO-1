

import java.sql.*;
import javax.swing.JOptionPane;

public class Model  {
        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; //nama driver
        static final String DB_URL = "jdbc:mysql://localhost/pbo_tugas_6_barang"; //nama database kita di slash terakhir
        static final String USER = "root"; //username
        static final String PASS = ""; // password
        
        Connection koneksi ; 
        Statement statement; 
        
        public Model () { 
            try { 
                Class.forName(JDBC_DRIVER);
                koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
                System.out.println("Koneksi Berhasil");
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
                System.out.println("Koneksi Gagal");
            }
        }
        
          public void insetBarang(String kode,String nama,String jenis,String merek ) { 
            try { 
               
                String query = "INSERT INTO `barang` (`kode`,`nama`,`jenis`,`merek`) "
                        + "VALUES (' " + kode +" ',' " + nama +" ',' " + jenis +" ',' "+merek+" '  )";
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query);
                System.out.println("Berhasil Ditambah");
                JOptionPane.showMessageDialog(null, "Berhasil Ditambahkan");
                
               
            }
            catch (SQLException e) { 
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
        }
                
        public String[][] readBarang() {
            int jumlahBarang = 0 ;
            try {
                String data[][] = new String [ GetBanyakData() ] [4];
                String query = "Select * FROM barang";
                ResultSet rs = statement.executeQuery(query);
                while (rs.next()) {
                    data[jumlahBarang][0] = rs.getString("kode");
                    data[jumlahBarang][1] = rs.getString("nama");
                    data[jumlahBarang][2] = rs.getString("jenis");
                    data[jumlahBarang][3] = rs.getString("merek");
                    jumlahBarang++;
                }
                return data; 
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
                System.out.println("SQL Eror");
                return null;
            }
        }
        
        public void updateBarang (String kode,String nama, String jenis, String merek ) { 
            try { 
                String query = "UPDATE barang SET "
                        + "nama='"+nama+"',"
                        + "jenis='"+jenis+"',"
                        + "merek='"+merek+"'"
                        + "WHERE kode='"+kode+"'";
//                PreparedStatement pr = koneksi.prepareStatement(query);
//                pr.execute();
                statement = koneksi.createStatement();
                statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Data Berhasil Di update");

            }
            catch (SQLException e) { 
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } 

        
         public int GetBanyakData() { 
            int jumlahData =0 ;
            try { 
                statement = (Statement) koneksi.createStatement();
                String query = "SELECT * FROM barang ";
                ResultSet rs = statement.executeQuery(query);
                while (rs.next() ) { 
                    jumlahData ++ ;
                }
                return jumlahData;
            }
            catch(SQLException e) {
                System.out.println(e.getMessage());
                System.out.println("SQL Eror");
                return 0;
            }
        }

       public void deleteBarang (String kode) {
        try{
            String query = "DELETE FROM `barang` WHERE `kode` = '"+kode+"'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
            
        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }

}

