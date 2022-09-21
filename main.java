package arrays;

public class main {

	public static void main(String[] args) {
		// arrays-diziler
		String sehir1 = "Konya";
		String sehir2 = "Ankara" ;		
        String sehir3 = "istanbul" ;
        String sehir4 = "İzmir" ;
        String sehir5 = "Manisa" ;
        
        String [] sehirler = new String [5];
        sehirler [0] = "Konya";
        sehirler [1] = "Ankara";
        sehirler [2]= "İstanbul";
        sehirler [3]= "İzmir";
        sehirler [4]= "Manisa";
        for (int i=0; i<sehirler.length; i++ ) {
        	System.out.println(sehirler[i]);
        }
        //for (String sehir: sehirler) {   veya bu iki satırla da aynı işlemi yaptırabiliriz
        //	System.out.println(sehir);
       // }
        
        System.out.println("--------");
        
        // çok boyutlu dizilerlere örnek
        String [][] renkler = new String [2][2];
        renkler [0][0] = "Kırmızı";
        renkler [0][1] = "Turuncu" ;
        renkler [1][0] = "Mavi";
        renkler [1][1] = "Yeşil";
        for (int i= 0; i<=1; i++) {
        	System.out.println("-----");
        for (int j=0; j<=1; j++) {
        	System.out.println(renkler[i][j]);
        }
        }
        
        System.out.println("--------");
        
        // Stringlerle çalışma örnek
        String mesaj = " Java öğreniyorum. ";
        System.out.println(mesaj);
         
        // mesajdaki eleman sayısını bulmak için;
        System.out.println("Eleman sayısı:"+mesaj.length());
        
        //mesajda istenilen elemanı yazdırmak için;
        System.out.println("10.eleman:"+ mesaj.charAt(9));
        
        //mesaj metnini yeni bir metin ile birleştirme;
        System.out.println (mesaj.concat("Harika!"));
        
        //mesaj metninin hangi eleman ile başlayıp bittiğini doğrulama için;
        System.out.println(mesaj.startsWith ("J"));
        
        System.out.println(mesaj.endsWith("."));
        
        // Karakterleri alıp ekrana yazdırmak için;
        char [] karakterler = new char [9];
		mesaj.getChars( 0,  8, karakterler, 0);
        System.out.println(karakterler);
        
        //karakteri soldan sayarak kaçıncı sırada olduğunu vermek için;
        System.out.println(mesaj.indexOf('e'));
        
        //karakteri sağdan sayarak kaçıncı sırada olduğunu vermek için;
        System.out.println(mesaj.lastIndexOf("e"));
        
        //mesaj metninde değişim için;
        System.out.println(mesaj.replace('a', '+'));
        
      
        //mesajdaki harf aralığını yazdrımak için;
        System.out.println( mesaj.substring(3,6));
        
        
	    //mesajı tek tek sutün halinde yazmak için;
		for (String kelime: mesaj.split ("")) {
			 System.out.println(kelime);	
		}
        
		// tüm mesajı küçük harfle yazmak için;
        System.out.println(mesaj.toLowerCase ());
        
        //tüm mesajı büyük harfle yazmak için;
        System.out.println(mesaj.toUpperCase ());
        
        //kaynak uyuşmazlığındaki boşlukları atmak için;
        System.out.println(mesaj.trim());
      
        
	}

}
