import java.util.HashMap;
import java.util.Map;

public class frequencyOfK {
	public static void main(String[] args) {
		System.out.println("------HashMap Method------");
		System.out.println(frequencyHashMap(new int[]{8,7,9,6,7,5,1}, 2)); //7
		System.out.println(frequencyHashMap(new int[]{8,7,9,7,7,5,1}, 3)); //7
		System.out.println(frequencyHashMap(new int[]{1, 1, 1, 2, 2, 2, 2, 3, 34,54}, 4)); //4
		System.out.println(frequencyHashMap(new int[]{8}, 2)); //-1
		System.out.println(frequencyHashMap(new int[]{8,7}, 2)); //-1
		
		System.out.println("------Brute Force Method------");
		System.out.println(frequencyBruteForce(new int[]{8,7,9,6,7,5,1}, 2)); //7
		System.out.println(frequencyBruteForce(new int[]{8,7,9,7,7,5,1}, 3)); //7
		System.out.println(frequencyBruteForce(new int[]{1, 1, 1, 2, 2, 2, 2, 3, 34,54}, 4)); //4
		System.out.println(frequencyBruteForce(new int[]{8}, 2)); //-1
		System.out.println(frequencyBruteForce(new int[]{8,7}, 2)); //-1
	}
	
	public static int frequencyBruteForce(int[] nums, int k) {
		for (int i=0; i<nums.length; i++) {
			int count=0;
			for (int j=0; j<nums.length; j++) {
				if(nums[i]==nums[j]) {
					count++;
				}
			}
			if(count==k) {
				return nums[i];
			}
		}
		return -1;
	}
	
	public static int frequencyHashMap(int[] nums, int k) {
		Map<Integer, Integer> map=new HashMap<>();
		for (int i=0; i<nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1);
			}else {
				map.put(nums[i], 1);
			}
		}
		
		for (Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if (entry.getValue()==k) {
				return entry.getKey();
			}
		}
		
		return -1;
	}
}
