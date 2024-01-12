public class game {
    public static void main(String[] args) {

        //        membuat objek player
                player hero = new player();
        
        //mengisi atribut player
                hero.name = "petani kode";
                hero.speed = 45;
                hero.healtpoin = 0;
        
        //menjalankan method 
                hero.run();
        
                if (hero.isDead()) {
                    System.out.println(hero.name + " Game Over");
                } else {
                    System.out.println("masih hidup");
        
                }
                
         
                
                
                Drone dji = new Drone();
            dji.energi = 12;
            dji.ketinggian  = 5;
            dji.kecepatan  = 60;
            dji.merek  = "asus";
        
            dji.terbang ();
        
            dji.matikanmesin ();
        
            dji.turun ();
        
            dji.maju ();
        
            dji.belok ();
        
            dji.mundur ();
            
            
            
            game2 mobil = new game2();
            mobil.energi = 50;
            mobil.jarak = 200;
            mobil.kecepatan = 50;
            mobil.tipe = "mazda";
            
            mobil.mobilberhenti();
            mobil.belok1();
            mobil.belok2();
            mobil.mundur();
            mobil.maju();
            mobil.jalan();
        
            }
        
}
