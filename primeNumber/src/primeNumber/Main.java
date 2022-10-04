package primeNumber;

public class Main {

	public static void main(String[] args) {
        int number=11;
        int remainder=number%2;
        boolean isPrime=true;
        if(number==1){
            System.out.println("Asal değildir");
            return;
        }
        if(number<1)
            System.out.println("Geçersiz sayı girdiniz");
        for(int i=2; i<number ;i++){
            if(number%i==0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println("sayı asaldır");
        }else {
            System.out.println("sayı asal degildir");
        }
    }
}

