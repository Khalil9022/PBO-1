/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attack;

/**
 *
 * @author MSI GF63-024
 */
public class Pedang implements AttackBehavior{
    
    @Override
    public void attack() {
            System.out.println("Menyerang dengan Pedang ! Damage physical= 100");
    }
}
