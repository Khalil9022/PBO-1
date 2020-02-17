
public class PrismaJajarGenjang extends JajarGenjang {
    
    private double tinggiPrisma, volume ;

    public PrismaJajarGenjang(double alas, double tinggi) {
        super(alas, tinggi);
    }


    @Override
    double  luasJajarGenjang (){
        return luas ; // luasnya static 
    }
    
    double Volume (double Tinggi3d){
        this.tinggiPrisma = Tinggi3d;
        volume =   luasJajarGenjang() * tinggiPrisma ;
        return volume ; 
    }

}
