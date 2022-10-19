package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world!");
          
		//değişken isimlendirmeleri java'da camelCase yazılır. ( İlk kelimeler küçük sonra kelimeler büyük olmalıdır.)
		String ortaMetin ="İlginizi çekebilir";
		String altMetin ="Vade süresi";
		
		System.out.println(ortaMetin);
		
		//integer; tam sayı söz konusu olduğunda 'int' kullanılır.
		int vade = 12;
		
		// double;ondalıklı bir sayı söz konusu olduğunda.
		double dolarDun = 18.30;
		double dolarBugun = 18.30;
		
		//boolean; şartlı ifadelerde kullanılır. / dolarDustuMu şartlı durumu 'true' yada 'false' yada 'equal' üç durumda cevap verilebilir.
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		//Şart bloklarımız:
		if(dolarBugun<dolarDun)  { 
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun>dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		// 3. durum equal-eşitlik
		else  { 
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		
		//array ,,,, bilgi:(i=++) = (i=i+1)
		
		String[] krediler = {"Hızlı Kresi","Maaşını Halkbanktan","Mutlu Emekli"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
	}

}
