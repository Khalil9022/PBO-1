package Contohke2;

public class PrismaJajarGenjang extends JajarGenjang {
    
    private double tinggiPrisma, volume ;

    public PrismaJajarGenjang(double a, double b, double tinggi, double Tinggi3d) {
        super(a, b, tinggi);
        this.tinggiPrisma = Tinggi3d;
    }
    
    @Override
    void  Volume (){
        volume =   luasJajarGenjang()* tinggiPrisma ;
        System.out.println( volume );
    }
    
   double Volume (double a, double b, double tinggi){
        volume = (a+b)/2.0 * tinggi * tinggiPrisma ;
        return volume ;
    }

}
