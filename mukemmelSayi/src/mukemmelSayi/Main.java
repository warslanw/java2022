package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
	    displayPerfectNumbers(0, 1000);
	    }

	    public static boolean isPerfect(int number) {
	        int sum = 0;
	        for (int i = 1; i <= number / 2; i++) {
	            if (number % i == 0) sum += i;
	        }
	        return number > 5 && number == sum;
	    }

	    public static void displayPerfectNumbers(int start, int end) {
	        for (int i = start; i < end; i++) {
	            if (isPerfect(i)) System.out.printf("%d is a perfect number.%n", i);
	        }
	    }
	}