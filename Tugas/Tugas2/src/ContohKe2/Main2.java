package Contohke2 ;
import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double a,b,tinggi ,Tinggi3d ;
        
        System.out.println("-----URUTAN-----");
        System.out.println("- JajarGenjang ");
        System.out.println("- Prisma JajarGenjang");
        System.out.println("- Limas JajarGenjang\n");
        
       
        System.out.print("Sisi panjang atas : " );
        a = input.nextDouble();
        System.out.print("Sisi panjang bawah  : " );
        b = input.nextDouble();
        System.out.print("Tinggi alas : " );
        tinggi = input.nextDouble();
        System.out.print("Tinggi 3d : ");
        Tinggi3d = input.nextDouble();
        
        System.out.println("-----JajarGenjang-----");
        JajarGenjang jajar = new JajarGenjang(a ,b, tinggi );
        System.out.println("Luas Segitiga : " +  jajar.luasJajarGenjang());
        
        System.out.println("\n----Prisma JajarGenjang-----");
        PrismaJajarGenjang pj = new PrismaJajarGenjang(a, b ,tinggi, Tinggi3d);
        System.out.print("Volume Prisma Segitiga : ");
        pj.Volume();
       
        System.out.println("\n-----Limas JajarGenjang-----");
        LimasJajarGenjang limas = new LimasJajarGenjang (a,b,tinggi, Tinggi3d);
        System.out.print("Volum1e Limas JajarGenjang: ");
        limas.Volume();
        
        System.out.print("\n Sisi panjang atas  baru : ");
        a = input.nextDouble();
        System.out.print("Sisi Panjang bawah baru : ");
        b = input.nextDouble();
        System.out.print("Sisi Tinggi Alas baru : ");
        tinggi = input.nextDouble();
        System.out.println("Volume Prisma JajarGenjang yang baru : " + pj.Volume(a, b,tinggi));
        System.out.println("Volume Limas JajarGenjang yang baru : " + limas.Volume(a, b,tinggi));
    }
    
}

