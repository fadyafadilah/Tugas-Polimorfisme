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
public class ObjectHero {
    public static void main(String[] args){
        Hero h1 = new Hero("Rahwana",5000,"Warrior");
        HeroMarksman h2 = new HeroMarksman("Arjuna",200,"Marksman");
        HeroFighter h3 = new HeroFighter("Gatot Kaca",6000,"Fighter");
        h1.infoHero();
        h2.infoHero();
        h3.infoHero();
    }
    
}
