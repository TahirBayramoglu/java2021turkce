package day24_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String [] args) {
		
		int sayi = 10;
		int sayi2 = 20;
		int sayi3 = 30;
		String isim = "Ali";
		
		// Java'da birden fazla elemani koyabilecegimiz (store) object'ler vardir.
		// Bugun bunlardan ilkini ögrenecegiz
		
		int arr[] = {10,20,30};  // int[] arr seklinde de kullanilabilir
		                        // Bu örnekte Array'in elemanlarini direk yazdigim icin 
		                       // uzunluk belirtmeye ihtiyac kalmadi.
		                      // Bu kullanimda max eleman sayisi (length) yazzdigimiz eleman sayisidir.
		
		
		System.out.println(arr);// Array bir object 'dir. 
		                       // Eger direk olarak Array'i yazdirmak isterseniz Java referansi yazdiririr
		
		
		System.err.println(Arrays.toString(arr)); // [10, 20, 30]
		
		String takim [] = new String[7]; // [null, null, null]
		System.out.println(Arrays.toString(takim));
		
		takim[0] = "Ali";
		System.out.println(Arrays.toString(takim));
		takim[2] = "Hasan";
		takim[1] = "Veli";
		System.out.println(Arrays.toString(takim));
		
		//takim[3]="Mehmet"; //Java Run Time programdir, dolayisla Array programi 
		                  // calistirinca olusturulur. 36. satirda syntax olarak hata olmadigindan CTE olmaz.
		                  // program calistiginda 3. index olmadigindan Run Time Error verir
		
		//Array'daki bir elemani update etme
		// Veli'nin yerine kemal gelsi
		takim[1] = "Kemal";
		System.out.println(Arrays.toString(takim));//[Ali, Kemal, Hasan]
		
		
		//Bir Array'in uzunlugunu nasil bulabiliriz 
		System.out.println(takim.length);// 3
		                                // String'deki length() idi Array'de length
		
		//Array'deki son elemani Mehmet yapin
		takim[takim.length-1] = "Mehmet";
		System.out.println(Arrays.toString(takim));
		
		//eger array'in eleman sayisi tek ise ortadaki elemani Can yapalim
		
		if (takim.length %2 ==1) {
			int ortaIndex = (takim.length-1)/2;
			takim[ortaIndex] = "Can";
			
		}
		
		System.out.println(Arrays.toString(takim));
		
}

}