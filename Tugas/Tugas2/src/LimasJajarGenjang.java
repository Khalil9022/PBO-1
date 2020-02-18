

public class LimasJajarGenjang extends JajarGenjang{

    double tinggiLimas;
    private double  volume ;

    public LimasJajarGenjang(double alas, double tinggi) {
        super(alas, tinggi);
    }

    @Override
    double  luasJajarGenjang (){
        return luas ; // luasnya static 
    }
    
    double Volume (double Tinggi3d){
        this.tinggiLimas = Tinggi3d;
        volume =   1.0/3.0 * luasJajarGenjang() * tinggiLimas ;
        return volume ; 
    }
      
}
