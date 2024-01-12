public class player {
    String name;
    int speed;
    int healtpoin;
    int damage;
    int armor;
    
//    definisi method run
    void run(){
        System.out.println(name +"is running...");
        System.out.println("speed: "+ speed);
    }
    
//    definisi method isDead untuk mengecek nilai kesehatan (healthpoin)
    boolean isDead(){
    if(healtpoin <= 0) return true;
    return false;
    
    }
}
