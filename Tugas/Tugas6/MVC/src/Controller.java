
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;



public class Controller {
  

    
    public Controller(Model model , ViewData data, ViewForm form, ViewUpdate update) { 
        //ngisi data
         if (model.GetBanyakData() != 0) {
             // menampilkan tabel di awal
            String dataBarang[][] = model.readBarang();
            data.tabel.setModel((new JTable(dataBarang, data.namaKolom)).getModel());
            
            //menampilkan isi combo box di ViewUpdate
//            String namaBarang [] = model.readNamaBarang () ;
//            update.jcKode.setModel((new JComboBox(namaBarang).getModel()));
         }
        else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }

       data.btnisiData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                form.setVisible(true);
                
                data.dispose();
            }
        });
       
//       update.jcKode.addItemListener(new ItemListener() {
//
//             @Override
//             public void itemStateChanged(ItemEvent e) {
//                 if (e.getStateChange() == ItemEvent.SELECTED) {
//                     String data[] = model.readBarangSpesifik();
//                    for (int i = 0 ; i<model.GetBanyakData(); i++) {
//                        if (update.jcKode.getSelectedIndex() == i) {
//                            update.tfkode.setText(data[0]);
//                        }
//                    }
//                 }
//             }
//         });
       
       form.btnbatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                data.setVisible(true);
                
                form.dispose();
            }
        });
       
       form.btnconfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kode = form.getKode();
                String nama = form.getNama();
                String jenis = form.getJenis();
                String merek = form.getMerek();
                
                model.insetBarang(kode, nama, jenis, merek);
                String barang[][] = model.readBarang();
                data.tabel.setModel(new JTable(barang,data.namaKolom).getModel());
                data.setVisible(true);
                form.setVisible(false);
            }
        });
         
        data.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = data.tabel.getSelectedRow();
                int kolom = data.tabel.getSelectedColumn();

                String dataterpilih = data.tabel.getValueAt(baris, 0).toString();

                System.out.println(dataterpilih);
                
                 int updatebarang = JOptionPane.showConfirmDialog(null, 
                            "Apa anda ingin mengedit Barang" + dataterpilih + "?", "Pilih opsi...",JOptionPane.YES_NO_OPTION);
                    
                    if (updatebarang == 0 ) { 
                            update.lnamaKode.setText(dataterpilih);
                            data.setVisible(false);
                            update.setVisible(true);

                    }
                    else { 
                        int input = JOptionPane.showConfirmDialog(null,
                        "Apa anda ingin menghapus Barang" + dataterpilih + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

                        if (input == 0) {
                            model.deleteBarang(dataterpilih);
                            String dataMahasiswa[][] = model.readBarang();
                            data.tabel.setModel(new JTable(dataMahasiswa, data.namaKolom).getModel());
                        } 
                        else {
                                JOptionPane.showMessageDialog(null, "Tidak Jadi Melakukan Opsi");
                        }
                   }
            }
        }
        );

        update.btnBatal.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 update.setVisible(false);
                 data.setVisible(true);
             }
         });
        
        update.btnUpdate.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    String kode=update.lnamaKode.getText() ; 
                                    String nama=update.tfnama.getText() ; 
                                    String jenis=update.tfjenis.getText() ; 
                                    String merek=update.tfmerek.getText() ; 
                                    model.updateBarang(kode, nama, jenis, merek);
                                    String barang[][] = model.readBarang();
                                    data.tabel.setModel(new JTable(barang,data.namaKolom).getModel());
                                    update.setVisible(false);
                                    data.setVisible(true);
                                }
          });
        
    }
        
   
    }

