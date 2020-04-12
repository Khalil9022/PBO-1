import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewData extends JFrame {
        
        
        JLabel ljudul = new JLabel("LIST BARANG");
        JButton btnisiData = new JButton("Tambah");
        
       
        JTable tabel ;
        DefaultTableModel tabelModel;
        JScrollPane scrollPane; 
         Object namaKolom [] =  {"kode","nama","jenis","merek"} ; 
        
        public ViewData ( ) { 
            tabelModel = new DefaultTableModel(namaKolom,0);
            tabel = new JTable(tabelModel);
            scrollPane = new JScrollPane(tabel);
            
            setTitle("Data Barang");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
            setLayout(null);
            setSize(400,550);
             setLocationRelativeTo(null);
            
           add(scrollPane);
            scrollPane.setBounds(15,50,350,400);
            scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            
            add(btnisiData);
            btnisiData.setBounds(280,470,80,20);
        
            add(ljudul);
            ljudul.setBounds(150,20,100,20);
        }
        

}



