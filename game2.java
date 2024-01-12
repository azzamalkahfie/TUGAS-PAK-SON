public class game2 {
    int energi;
    int kecepatan;
    int jarak;
    String tipe;
    
    void jalan(){
    energi++;
    if(energi > 15){
    jarak++;
        System.out.println("mobil berjalan...");
    }else{
        System.out.println("energi lemah mobil tdk bisa berjalan....");
    }
    }
    
    void mobilberhenti(){
    if(jarak > 200){
        System.out.println("mobil akan berhenti karena jarak yg kejahuan ");
    }else{
        System.out.println("mobil akan tetap berjalan");
    }
    }
    
    void maju(){
        energi--;
        System.out.println("mobil maju kedepan");
        kecepatan++;
    }
    
    void mundur(){
        energi--;
        System.out.println("mobil mundur kebelakang");
        kecepatan++;
    }
    void belok1(){
        energi--;
        System.out.println("mobil belok ke kanan ");
    }
    void belok2(){
        System.out.println("mobil belok ke kiri ");
    }
}
