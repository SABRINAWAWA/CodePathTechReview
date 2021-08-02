import java.util.HashSet;
import java.util.Set;

public class happyNumber {
	public static void main(String[] args) {
		System.out.println(isHappyNumber(19)); // true
		System.out.println(isHappyNumber(2)); //false
		System.out.println(isHappyNumber(119)); // false
		System.out.println(isHappyNumber(7)); // true
	}
	
	public static boolean isHappyNumber(int num) {
		Set<Integer> set=new HashSet<>();
		while (num!=1&&!set.contains(num)) {
			set.add(num);
			num=nextNumber(num);
		}
		return num==1;
	}
	
	public static int nextNumber(int num) {
		int result=0;
		if (num>1) {
			while(num>0) {
				result+=Math.pow(num%10, 2);
				num=num/10;
			}
		}
		return result;
	}
	
}
