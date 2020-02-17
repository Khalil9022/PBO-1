public class JajarGenjang {
    
    private double alasDbl , tinggiDbl  ;
    private int alasInt , tinggiInt ; 
    static double luas;
    
    JajarGenjang(double alas ,double tinggi ) {
        this.alasDbl = alas ; 
        this.tinggiDbl = tinggi ;
    }
    
    double  luasJajarGenjang (){
        this.luas = alasDbl * tinggiDbl ;
        return luas ;
    }
    
    int luasJajarGenjang (int alas, int tinggi){
        this.alasInt = alas ; 
        this.tinggiInt = tinggi ;
        luas = alasInt * tinggiInt ;
        return (int) luas;
    }
    
    void Volume (){
        System.out.println("Tiap Volume berbeda=beda");
    }
    
}
