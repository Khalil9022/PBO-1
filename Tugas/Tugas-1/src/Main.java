import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String nama;
        int nilai[]= new int[5];
        int max,min;
        float rata = 0;
        
        System.out.print("Masukkan nama :");
        nama = input.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.print("Nilai ke-" + i + " : ");
            nilai[i] = input.nextInt();
            rata+=nilai[i];
        }
        
        max = nilai[0];
        min = nilai[0];
        rata = rata/5;
        
        for (int j = 0; j < 5; j++) {
            if (nilai[j] < max){
                max = nilai[j];
            }
            else if (nilai[j] > min) {
                min = nilai[j];
            }
        }
        
        System.out.println("\nNama : "+ nama);
        System.out.println("Nilai Tertinggi : " + max);
        System.out.println("Nilai Terendah : " + min);
        System.out.println("Rata-rata : "+rata);
        
    }
    
}
