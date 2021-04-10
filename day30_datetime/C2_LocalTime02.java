package day30_datetime;
import java.time.LocalTime;
public class C2_LocalTime02 {
    public static void main(String[] args) {
        // Java'da saat ile islem yapmak icin
        // LocalTime class'indan obje kullaniriz
        
        LocalTime saat = LocalTime.now();
        System.out.println(saat); // 22:38:08.280
        
        for (int i = 0; i < 1000000; i++) {
            i+=1;
        }
        
        LocalTime saat2 = LocalTime.now();
        System.out.println(saat2); // 22:38:08.280
        System.out.println(saat);
        
        System.out.println(saat.plusHours(15)); // 13:45:51.936
        
        System.out.println(saat.getSecond()); //31
        
        System.out.println(saat.minusSeconds(1564548745)); // 18:03:46.469
        
    }
}
