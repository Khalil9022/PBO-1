
public class PrismaSegitiga extends Segitiga {
    
    private double tinggiPrisma, volume ;

    public PrismaSegitiga(double alas, double tinggi, double Tinggi) {
        super(alas, tinggi);
        this.tinggiPrisma = Tinggi;
    }
    
    @Override
    void  Volume (){
        volume =   luasSegitiga()* tinggiPrisma ;
        System.out.println( volume );
    }
    
   double Volume (double alas, double tinggi){
        volume =  1.0/2.0 * alas * tinggi * tinggiPrisma ;
        return volume ;
    }

}
