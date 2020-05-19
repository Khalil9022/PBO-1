package Controller;


import Model.Model;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class Controller {
    String id,idanggota,namaanggota,idbuku,judulbuku;
    public Controller(Model model, Viewlogin viewlogin,ViewTampilanAwal viewtampilanawal, ViewPinjam viewpinjam,ViewTampil viewtampil,ViewAbout viewabout,ViewEdit viewedit) {
        
        //MENGISI TAMPILAN BUKU 
        if (model.getPinjamBuku()!= 0) {
             // menampilkan tabel di awal
            String datapinjam[][] = model.readPinjamBuku();
            viewtampil.tabel.setModel((new JTable(datapinjam, viewtampil.namaKolom)).getModel());
            viewtampil.tabel.getColumnModel().getColumn(4).setMinWidth(0);
            viewtampil.tabel.getColumnModel().getColumn(4).setMaxWidth(0);
         }
        
            //LOGIN USER
            viewlogin.btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //cek login 
                String username = viewlogin.tfUsername.getText();
                String password = viewlogin.tfPass.getText();
                 if(viewlogin.tfUsername.getText().length() > 0 && viewlogin.tfPass.getText().length() >0 && model.checkLogin(username, password) == 1) {
                    viewlogin.setVisible(false);
                    viewtampilanawal.setVisible(true);
                    viewlogin.tfUsername.setText(null);
                    viewlogin.tfPass.setText(null);
                }
                 else { 
                     JOptionPane.showMessageDialog(null, "Username atau Password Salah");
                 }
            }
        });
            
            //EXIT
            viewlogin.btnExit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
            
            //TAMPILAN AWAL
            viewtampilanawal.btnhome.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewtampilanawal.setVisible(true);
                }
            });
            viewtampilanawal.btnpinjam.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewtampilanawal.setVisible(false);
                    viewpinjam.setVisible(true);
                }
            });
            viewtampilanawal.btntampil.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewtampilanawal.setVisible(false);
                    viewtampil.setVisible(true);
                }
            });
            viewtampilanawal.btnabout.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewtampilanawal.setVisible(false);
                    viewabout.setVisible(true);
                }
            });
            viewtampilanawal.btnlogout.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Berhasil Logout");
                    viewtampilanawal.setVisible(false);
                    viewlogin.setVisible(true);
                }
            });
            
        //PINJAM BUKU    
            //PINJAM BUKU PANEL 2
           viewpinjam.btnhome.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewtampilanawal.setVisible(true);
                    viewpinjam.setVisible(false);
                }
            });
            viewpinjam.btnpinjam.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewpinjam.setVisible(true);
                }
            });
            viewpinjam.btntampil.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewpinjam.setVisible(false);
                    viewtampil.setVisible(true);
                }
            });
            viewpinjam.btnabout.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewpinjam.setVisible(false);
                    viewabout.setVisible(true);
                }
            });
            
            //PINJAM BUKU PANEL 3
            viewpinjam.btntambah.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String idanggota = viewpinjam.tfidanggota.getText();
                    String namaanggota = viewpinjam.tfnamaanggota.getText();
                    String idbuku = viewpinjam.tfidbuku.getText();
                    String judulbuku = viewpinjam.tfjudulbuku.getText();
                    model.tambahPinjamBuku(idanggota, namaanggota, idbuku, judulbuku);
                    
                    String pinjam[][] = model.readPinjamBuku();
                    viewtampil.tabel.setModel(new JTable(pinjam,viewtampil.namaKolom).getModel());
                    viewtampil.tabel.getColumnModel().getColumn(4).setMinWidth(0);
                    viewtampil.tabel.getColumnModel().getColumn(4).setMaxWidth(0);
                    viewpinjam.tfidanggota.setText(null);
                    viewpinjam.tfnamaanggota.setText(null);
                    viewpinjam.tfidbuku.setText(null);
                    viewpinjam.tfjudulbuku.setText(null);
                    viewpinjam.setVisible(false);
                    viewtampil.setVisible(true);
                }
            });
            
            viewpinjam.btnreset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewpinjam.tfidanggota.setText(null);
                viewpinjam.tfnamaanggota.setText(null);
                viewpinjam.tfidbuku.setText(null);
                viewpinjam.tfjudulbuku.setText(null);
            }
        });
            
        //VIEW TAMPIL BUKU
            // VIEW TAMPIL PANEL 2
            viewtampil.btnhome.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewtampil.setVisible(false);
                    viewtampilanawal.setVisible(true);
                }
            });
            viewtampil.btnpinjam.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewtampil.setVisible(false);
                    viewpinjam.setVisible(true);
                }
            });
            viewtampil.btntampil.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewtampil.setVisible(true);
                }
            });
            viewtampil.btnabout.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewtampil.setVisible(false);
                    viewabout.setVisible(true);
                }
            });
            viewtampil.btnlogout.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Berhasil Logout");
                    viewtampil.setVisible(false);
                    viewlogin.setVisible(true);
                }
            });
            
            //VIEW TAMPIL PANEL 3
            viewtampil.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = viewtampil.tabel.getSelectedRow();
                int kolom = viewtampil.tabel.getSelectedColumn();

                String dataterpilih = viewtampil.tabel.getValueAt(baris, 0).toString();
                
                idanggota = viewtampil.tabel.getValueAt(baris, 0).toString();
                namaanggota = viewtampil.tabel.getValueAt(baris, 1).toString();
                idbuku = viewtampil.tabel.getValueAt(baris, 2).toString();
                judulbuku = viewtampil.tabel.getValueAt(baris, 3).toString();
                id = viewtampil.tabel.getValueAt(baris, 4).toString();
                
                viewtampil.btnedit.setEnabled(true);
                viewtampil.btnhapus.setEnabled(true);
  
            }
           });
            
           viewtampil.btnedit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewedit.id.setText(id);
                viewedit.tfidanggota.setText(idanggota);
                viewedit.tfnamaanggota.setText(namaanggota);
                viewedit.tfidbuku.setText(idbuku);
                viewedit.tfjudulbuku.setText(judulbuku);
                viewtampil.setVisible(false);
                viewedit.setVisible(true);
            }
        });
           
           viewtampil.btnhapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            int input =JOptionPane.showConfirmDialog(null, "apakah anda ingin Hapus Pinjam Buku ini ? ","Pilih opsi" , JOptionPane.YES_NO_OPTION);
            
            if (input == 0) { 
                    model.hapusPinjamBuku(id);
                    String datakontak[][] = model.readPinjamBuku();
                    viewtampil.tabel.setModel((new JTable(datakontak, viewtampil.namaKolom)).getModel());
                    viewtampil.tabel.getColumnModel().getColumn(4).setMinWidth(0);
                    viewtampil.tabel.getColumnModel().getColumn(4).setMaxWidth(0);
                    viewtampil.btnhapus.setEnabled(false);
                    viewtampil.btnedit.setEnabled(false);
            }
            else { 
                JOptionPane.showMessageDialog(null, "Tidak jadi Hapus");
            }
                        
            }
        });
           
         //VIEW ABOUT
            //VIEW ABOUT PANEL 2
             viewabout.btnhome.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewabout.setVisible(false);
                    viewtampilanawal.setVisible(true);
                }
            });
            viewabout.btnpinjam.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewabout.setVisible(false);
                    viewpinjam.setVisible(true);
                }
            });
            viewabout.btntampil.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewtampil.setVisible(true);
                    viewabout.setVisible(false);
                }
            });
            viewabout.btnabout.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewabout.setVisible(true);
                }
            });
            viewabout.btnlogout.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Berhasil Logout");
                    viewabout.setVisible(false);
                    viewlogin.setVisible(true);
                }
            });
            
        //VIEW EDIT
            viewedit.btnedit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 String idA = viewedit.tfidanggota.getText();
                 String namaA = viewedit.tfnamaanggota.getText();
                 String idB = viewedit.tfidbuku.getText();
                 String judulB = viewedit.tfjudulbuku.getText();
                 
                 model.updatePinjamBuku(id, namaA, idB, judulB);
                 String contact[][] = model.readPinjamBuku();
                 viewtampil.tabel.setModel(new JTable(contact,viewtampil.namaKolom).getModel());
                 viewtampil.tabel.getColumnModel().getColumn(4).setMinWidth(0);
                 viewtampil.tabel.getColumnModel().getColumn(4).setMaxWidth(0);
                 viewtampil.btnhapus.setEnabled(false);
                 viewtampil.btnedit.setEnabled(false);
                 viewedit.setVisible(false);
                 viewtampil.setVisible(true);
                 
            }
        });
        
            viewedit.btnbatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewedit.setVisible(false);
                viewtampil.setVisible(true);
                viewtampil.btnhapus.setEnabled(false);
                viewtampil.btnedit.setEnabled(false);
            }
        });
    }
}
