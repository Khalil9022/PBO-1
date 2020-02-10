package method;
import static java.lang.System.exit;
import java.util.Scanner;

public class MainTabungan {
    public static void main(String[] args) {
        int saldoAkhir = 0 , pilih = 0 , jumlah = 0;
        char kembali; String noRek ;
        Scanner input = new Scanner (System.in);
        
        System.out.print("No rekening : ");
        noRek = input.nextLine();
       
        Tabungan tabungan = new Tabungan (noRek);
        tabungan.setJumlahSaldo(2000000);
        do {
        System.out.println("MENU");
        System.out.println("1. Penarikan Saldo");
        System.out.println("2. Penyetoran Saldo");
        System.out.println("3. Pembatalan Transaksi");
        System.out.print("Pilih : ");
        pilih = input.nextInt();
        
        if (pilih == 1){
            System.out.println("Penarikan Tunai");
            System.out.print("Jumlah");
            jumlah = input.nextInt();
            
            if (jumlah < tabungan.getJumlahSaldo()){
                tabungan.penarikanSaldo(jumlah);
                System.out.println("Transaksi Berhasil!");
                System.out.println("Sisa Saldo : " + tabungan.getJumlahSaldo ());
            }
            else {
                System.out.println("Saldo kurang");
                System.out.println("Transaksi Dibatalkan");
                System.out.println("Sisa Saldo :" + tabungan.getJumlahSaldo());
            }
     
            
        }
        else if ( pilih == 2){
            System.out.println("Setor Saldo ");
            System.out.print("Jumlah :  ");
            jumlah = input.nextInt();
            tabungan.setorSaldo(jumlah);
            System.out.println("\nSetor Berhasil! , Sisa saldo : " + tabungan.getJumlahSaldo());
        }
        else if (pilih == 3){
            exit(0);
        }
        else {
            System.out.println("Pilihan Belum Tersedia!..\n");
        }
            System.out.print("Kembali ke menu ? ");
            kembali = input.next().charAt(0);
        }while (kembali == 'y' || kembali == 'Y');
    }
}
