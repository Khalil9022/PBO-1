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
public class Bebek {
    private FlyBehavior flybehavior ; 
    private SoundBehavior soundbehavior ; 
    private AttackBehavior attackbehavior ; 
    private DefenseBehavior defensebehavior ; 
  
    public Bebek (FlyBehavior flybehavior, SoundBehavior soundbehavior, AttackBehavior attackbehavior, DefenseBehavior defensebehavior) {
        this.flybehavior = flybehavior;
        this.soundbehavior = soundbehavior ;
        this.attackbehavior = attackbehavior ;
        this.defensebehavior = defensebehavior ;
        
    }
    
    
    public void setSoundBehavior (SoundBehavior soundbehavior ){
        this.soundbehavior = soundbehavior ;
    }
    
    public void setFlyBehavior (FlyBehavior flybehavior ){
        this.flybehavior = flybehavior ;
    }
    
    public void setAttackBehavior (AttackBehavior attackbehavior ){
        this.attackbehavior = attackbehavior ;
    }
    
    public void setDefenseBehavior (DefenseBehavior defensebehavior ){
        this.defensebehavior = defensebehavior ;
    }
    
    public void fly () {
        flybehavior.fly();
    }
    
    public void sound () {
        soundbehavior.suara();
    }
    
    public void attack () {
        attackbehavior.attack();
    }
    
    public void defense () {
        defensebehavior.defense();
    }
    
    
}
