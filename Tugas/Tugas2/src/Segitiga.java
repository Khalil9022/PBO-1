/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI GF63-024
 */
public class Segitiga {
    
    private double alas , tinggi, luas ; 
    
    Segitiga(double alas , double tinggi ) {
        this.alas = alas ; 
        this.tinggi = tinggi ;
    
    }
    
    double  luasSegitiga (){
        this.luas = (alas*tinggi)/ 2.0 ;
        return luas ;
    }
    
    void Volume (){
        System.out.println("Tiap Volume berbeda=beda");
    }
    


}
