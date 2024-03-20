package polimorfisme;

/**
 *
 * @author FAD
 */
public class Hero {
        protected String namaHero;
        protected int hpHero; 
        protected String typeHero;
    
    public Hero (String namaHero, int hpHero, String typeHero ){
        this.namaHero = namaHero;
        this.hpHero = hpHero;
        this.typeHero = typeHero;
    }
    
    public void infoTurret(){
        System.out.println("Name : " + namaHero);
        System.out.println("HP : " + hpHero);
        System.out.println("Type : " + typeHero);
    }
    
    void setNama(String namaHero){
        this.namaHero = namaHero;
    }
    
    void setHp (int hpHero){
        this.hpHero = hpHero;
    }
    
    void setType (String typeHero){
        this.typeHero = typeHero;
    }
    
    String getNama(){
        return namaHero;
    }
    
    int getHp(){
        return hpHero;
    }
    
    String getType(){
        return typeHero;
    }
    
    void infoHero(){
        System.out.println("Hero Name :" + getNama());
        System.out.println("HP :" + getHp());
        System.out.println("Type :" + getType());
        System.out.println("----------------------------------------------------");
    }
}
