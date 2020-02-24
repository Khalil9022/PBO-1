/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Bicara.*; 
import Terbang.*;
import Attack.*;
import Defense.*;
/**
 *
 * @author MSI GF63-024
 */
public class Main {
    public static void main(String[] args) {
        
        Bebek superbebek = new Bebek (new RocketFly(), new Megaphone(), new Sihir(), new TamengUltra ()) ;
        System.out.println("Super Bebek Behavior : ");
        superbebek.fly( ); 
        superbebek.sound();
        superbebek.attack();
        superbebek.defense();
        
        System.out.println(" ");
        System.out.println("Noob bebek Behavior : ");
        Bebek noobbebek = new Bebek (new WingsFly() , new Normal (), new Sihir(), new TamengRendah ()) ; 
        noobbebek.fly();
        noobbebek.sound(); 
        noobbebek.attack(); 
        noobbebek.defense(); 
       
        System.out.println(" ");
        System.out.println("Ninja Bebek Behavior : ");
        Bebek ninjabebek = new Bebek (new PlaneFly () , new UltraSonic(), new Pedang(), new TamengMedium ()) ; 
        ninjabebek.fly();
        ninjabebek.sound();
        ninjabebek.attack();
        ninjabebek.defense();
        
        System.out.println("");
        System.out.println("Super bebek change Fly behavior : ");
        superbebek.setFlyBehavior(new WingsFly ());
        superbebek.setAttackBehavior(new Pedang ());
        superbebek.fly();
        superbebek.sound();
        superbebek.attack();
        superbebek.defense();
       
    }
}
