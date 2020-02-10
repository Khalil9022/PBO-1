
package method;

public class Tabungan {
    private int jumlahSaldo;
    private String no_rekening ;
    
    public Tabungan(String no_rekening) {
        this.no_rekening = no_rekening;
    }

    public String getNo_rekening() {
        return no_rekening;
    }

    public int getJumlahSaldo() {
        return jumlahSaldo;
    }

    public void setJumlahSaldo(int jumlahSaldo) {
        this.jumlahSaldo = jumlahSaldo;
    }

    public void penarikanSaldo (int jumlah){
        this.jumlahSaldo = jumlahSaldo - jumlah ; 
        
    }
    
    public int setorSaldo (int jumlah){
        this.jumlahSaldo = jumlahSaldo + jumlah ; 
        return jumlahSaldo;
    }
    
    

    
}
