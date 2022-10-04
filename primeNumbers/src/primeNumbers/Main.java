package primeNumbers;

public class Main {

    public static void main(String[] args) {
       for (int i = 1; i < 1000; i++) {
    	   if (isPrime(i)) {
    		   System.out.printf("%d ", i);
    	   }
       }
    }
    
    
    public static boolean isPrime(int number) {
    	if (number < 2) return false;
    	for (int i = 2; i <= Math.sqrt(number); i++) {
    		if (number % i == 0) return false;
    	}
    	return true;
    }
		
}