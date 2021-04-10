package day42_abstractclasses;
public class IdariPersonel extends Personel{
    
    // extends Personel yazarak Abstract Personele concrete bir child olusturdum
    // ve Java CTE verdi 
    // cozum olarak urettigi 2 ihtimal var
    // 1- Unimplemented(uyarlanmamis) method'lari uyarla
    // 2- Ya da Personel class'indan abstract kelimesini kaldir
    // Bu class'in calisabilmesi icin 2 islemden birini yapmak zorundayiz
    public static void main(String[] args) {
        
    }
    @Override
    public void maasHesapla() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mesaiBilgisi() {
        // TODO Auto-generated method stub
        
    }
}