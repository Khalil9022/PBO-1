import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        byte pil;
        do {
                System.out.println("Menu : ");
                System.out.println("1. Segitiga dan turunannya ");
                System.out.println("1. Jajargenjang dan turunannya ");
                System.out.println("Pilihan : ");
                pil = input.nextByte();

                if (pil == 1) { 
                        double alas ,tinggi , Tinggi ;
                        System.out.println("-----URUTAN-----");
                        System.out.println("- Luas Segitiga   ");
                        System.out.println("- Volume Prisma Segitiga");
                        System.out.println("- Volume Limas Segitiga\n");



                        System.out.print("Alas : " );
                        alas = input.nextDouble();
                        System.out.print("Tinggi alas : " );
                        tinggi = input.nextDouble();
                        System.out.print("Tinggi bangunan 3d : " );
                        Tinggi = input.nextDouble();

                        System.out.println("\n-----Segitiga-----");
                        Segitiga s3 = new Segitiga(alas ,tinggi );
                        System.out.println("Luas Segitiga(Bisa Koma) : " +  s3.luasSegitiga());
                        System.out.println("Luas Segitiga(Pembulatan) : " +  s3.luasSegitiga((int)alas,(int)tinggi));

                        System.out.println("\n----Prisma Segitiga-----");
                        PrismaSegitiga ps = new PrismaSegitiga(alas, tinggi );
                        System.out.print("Volume Prisma Segitiga : " + ps.Volume(Tinggi));

                        System.out.println("\n\n-----Limas Segitiga-----");
                        LimasSegitiga limas = new LimasSegitiga (alas,tinggi);
                        System.out.print("Volum1e Limas Segitiga: " + limas.Volume(Tinggi));

            }


            else if (pil == 2) {
                        double alas,tinggi ,Tinggi3d ;

                       System.out.println("\n-----URUTAN-----");
                       System.out.println("- Luas JajarGenjang ");
                       System.out.println("- Volume Prisma JajarGenjang ");
                       System.out.println("- Volume Limas JajarGenjang \n");

                       System.out.print("Alas : " );
                       alas = input.nextDouble();         
                       System.out.print("Tinggi alas : " );
                       tinggi = input.nextDouble();
                       System.out.print("Tinggi 3d : ");
                       Tinggi3d = input.nextDouble();

                       System.out.println("-----JajarGenjang-----");
                       JajarGenjang jajar = new JajarGenjang(alas, tinggi );
                       System.out.println("Luas JajarGenjang (Bisa Koma): " +  jajar.luasJajarGenjang());
                       System.out.println("Luas JajarGenjang (Pembulatan): " +  jajar.luasJajarGenjang( (int)alas, (int)tinggi)  );

                       System.out.println("\n----Prisma JajarGenjang-----");
                       PrismaJajarGenjang pj = new PrismaJajarGenjang(alas,tinggi);
                       System.out.print("Volume Prisma JajarGenjang : " + pj.Volume(Tinggi3d));

                       System.out.println("\n\n-----Limas JajarGenjang-----");
                       LimasJajarGenjang limas = new LimasJajarGenjang (alas, tinggi);
                       System.out.print("Volum1e Limas JajarGenjang: " + limas.Volume(Tinggi3d));

            }
            else if (pil == 3 ){
                    System.out.println("\nLogging Out . . .");
            }
            else {
                    System.out.println("Pilihan belum tersedia\n");
            }
        } while (pil != 3 );
    
   }
            
}
    


