public class LimasSegitiga extends Segitiga{
    
    double tinggiLimas , volume ; 

    public LimasSegitiga(double alas, double tinggi, double Tinggi) {
        super(alas, tinggi);
        this.tinggiLimas = Tinggi;
    }
    
    @Override
    void  Volume (){
        volume = 1.0 / 3.0 * luasSegitiga()* tinggiLimas ;
        System.out.println(volume);
    }
    
    double Volume (double tinggi, double alas){
        volume = 1.0/3.0 * 1.0/2.0 *  alas * tinggi * tinggiLimas ;
        return volume ;
    }
      
}
