public class Drone {
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;
    
//    method
    void terbang(){
    energi--;
    if(energi >10 ){
//    terbang berarti nilai ketinggian bertambah
ketinggian++;
        System.out.println("Drone terbang...");
    } else {
        System.out.println("Energi lemah: Drone nggak bisa terbang");
       }
    }
    
    void matikanmesin(){
    if(ketinggian > 0 ){
        System.out.println("mesin tidak bisa di matikan karena sedang terbang ");
    }else{
        System.out.println("Mesin di matikan...");
      }
    }
    
    void turun(){
//    ketinggian--;
ketinggian--;
energi--;
        System.out.println("Drone turun");
    }
    void maju(){
    energi--;
        System.out.println("Drone maju kedepan");
        kecepatan++;
    }
    void belok(){
    energi--;
        System.out.println("Drone belok");
//        belok kemana? perlu di cek
    }
    void mundur(){
    energi--;
        System.out.println("Drone mundur");
        kecepatan++;
    }
}
