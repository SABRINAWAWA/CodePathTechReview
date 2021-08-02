import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
	public static void main(String[] args) {
		System.out.println("------HashMap Method------");
		System.out.println(Arrays.toString(twoSumHashMap(new int[] {3,2,6,9,5}, 9))); // [3, 6]
		System.out.println(Arrays.toString(twoSumHashMap(new int[] {10, 1, 5}, 7))); // null
		System.out.println(Arrays.toString(twoSumHashMap(new int[] {}, 2))); // null
		System.out.println(Arrays.toString(twoSumHashMap(new int[] {1, 5, 2, 4}, 6))); // [1, 5]
		
		System.out.println("------Brute Force Method------");
		System.out.println(Arrays.toString(twoSumBruteForce(new int[] {3,2,6,9,5}, 9))); // [3, 6]
		System.out.println(Arrays.toString(twoSumBruteForce(new int[] {10, 1, 5}, 7))); // null
		System.out.println(Arrays.toString(twoSumBruteForce(new int[] {}, 2))); // null
		System.out.println(Arrays.toString(twoSumBruteForce(new int[] {1, 5, 2, 4}, 6))); // [1, 5]
	}
	
	public static int[] twoSumHashMap(int[] arr, int target) {
		Map<Integer, Integer> map=new HashMap<>();
		for (int i=0; i<arr.length; i++) {
			if (map.containsKey(target-arr[i])) {
				return new int[] {target-arr[i],arr[i]};
			}else {
				map.put(arr[i], i);
			}
		}
		return null;
	}
	
	public static int[] twoSumBruteForce(int[] arr, int target) {
		for (int i=0; i<arr.length; i++) {
			for (int j=1; j<arr.length; j++) {
				if (arr[i]+arr[j]==target) {
					return new int[] {arr[i], arr[j]};
				}
			}
		}
		return null;
	}
}


