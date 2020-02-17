package Contohke2; 

public class JajarGenjang {
    
    private double a , b, tinggi, luas ; 
    
    JajarGenjang(double a , double b, double tinggi ) {
        this.a = a ; 
        this.b = b ;
        this.tinggi = tinggi ;
    
    }
    
    double  luasJajarGenjang (){
        this.luas = (a + b)/ 2.0 * tinggi ;
        return luas ;
    }
    
    void Volume (){
        System.out.println("Tiap Volume berbeda=beda");
    }
    


}
