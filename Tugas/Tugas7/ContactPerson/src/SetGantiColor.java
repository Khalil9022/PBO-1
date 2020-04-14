// Nama file : DemoJColorChooser.java
// JColorChooser sebagai kotak dialog pilihan warna
 
// Mengimpor kelas
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
 
// Deklarasi kelas
public class SetGantiColor extends JFrame {
 
   Container kontener;
   Color warnaKontenerAwal, warnaKontener;
   Color warnaTeksAwal, warnaTeks;
   JLabel label;
   Font modelHuruf;
   JButton jbtKontener, jbtTeks;
   JPanel panel;
   TitledBorder border;
 
   // Konstruktor
   public SetGantiColor() {
 
      modelHuruf = new Font("Tahoma", Font.BOLD + Font.ITALIC, 21);
      label = new JLabel("Pemrograman Bahasa Java", JLabel.CENTER);   
      label.setFont(modelHuruf);
 
      jbtKontener = new JButton("Warna Background");
      jbtTeks = new JButton("Warna Teks");
      border = new TitledBorder("Tombol Rubah Warna");
      panel = new JPanel();
      panel.setBorder(border);
      panel.setLayout(new GridLayout(1, 2));
      panel.add(jbtKontener);
      panel.add(jbtTeks);
 
      kontener = getContentPane();
      kontener.setLayout(new BorderLayout());
      kontener.add(label, BorderLayout.CENTER);
      kontener.add(panel, BorderLayout.PAGE_END);
 
      jbtKontener.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
               warnaKontenerAwal = kontener.getBackground();
               warnaKontener = JColorChooser.showDialog(null, "Pilihan Warna",
                               warnaKontenerAwal);
               if(warnaKontener != null)
               kontener.setBackground(warnaKontener);
            }
         }
      );
 
      jbtTeks.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
               warnaTeksAwal = label.getForeground();
               warnaTeks = JColorChooser.showDialog(null, "Pilihan Warna",
                           warnaTeksAwal);
               if(warnaTeks != null)
               label.setForeground(warnaTeks);
            }
         }
      );
   }
 
   // Metoda SetGantiColor
   public static void main(String[] args) {
      SetGantiColor frame = new SetGantiColor();
      frame.setTitle("Kelas DemoJColorChooser");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(315, 150);
      frame.setVisible(true);
   }
}
