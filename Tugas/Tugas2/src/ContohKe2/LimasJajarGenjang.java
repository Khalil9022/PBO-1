package Contohke2;

public class LimasJajarGenjang extends JajarGenjang{
    
    double tinggiLimas , volume ; 

    public LimasJajarGenjang(double a, double b, double tinggi , double Tinggi3d) {
        super(a, b, tinggi );
        this.tinggiLimas = Tinggi3d;
    }
    
    @Override
    void  Volume (){
        volume = 1.0 / 3.0 * luasJajarGenjang()* tinggiLimas ;
        System.out.println(volume);
    }
    
    double Volume (double a, double b, double tinggi){
        volume = 1.0/3.0 * (a+b)/2.0 * tinggi * tinggiLimas ;
        return volume ;
    }
      
}
