/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfisme;

/**
 *
 * @author FAD
 */
public class HeroMarksman extends Hero {
    
    String Weapon;
    
    HeroMarksman(String namaHero, int hpHero, String typeHero) {
        super(namaHero, hpHero, typeHero);
        Weapon = "Fire Arrow";
    }
    
    String getWeapon(){
        return Weapon;
    }
    
    @Override
    void infoHero(){
        System.out.println("Hero Name :" + super.getNama());
        System.out.println("HP :" + super.getHp());
        System.out.println("Type :" + super.getType());
        System.out.println("Weapon : " + Weapon);
        System.out.println("----------------------------------------------------");
    }
    
}
