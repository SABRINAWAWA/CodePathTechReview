
public class nextPrime {
	public static void main(String[] args) {
		System.out.println(nextPrimeNum(2)); //3
		System.out.println(nextPrimeNum(5)); //7
		System.out.println(nextPrimeNum(11)); //13
		System.out.println(nextPrimeNum(16)); //17
		System.out.println(nextPrimeNum(600000000)); //600000001
		
	}
	
	public static int nextPrimeNum(int num) {
		for (int i=num+1; i<Integer.MAX_VALUE; i++) {
			if (isPrime(i)) {
				return i;
			}
		}
		return -1;
	}
	
	public static boolean isPrime(int num) {
		for (int i=2; i<num; i++) {
			if((num%i)==0) {
				return false;
			}
		}
		return true;
	}
}
