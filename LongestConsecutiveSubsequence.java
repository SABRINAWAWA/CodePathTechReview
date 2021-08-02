import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSubsequence {
	public static void main(String[] args) {
		System.out.println("------HashSet Method------");
		System.out.println(LongestConsecutiveSubsequenceHashSet(new int[] {1, 9, 3, 10, 4, 20 , 2})); //4
		System.out.println(LongestConsecutiveSubsequenceHashSet(new int[] {1, 9, 3, 5, 4, 20 , 2})); //5
		System.out.println(LongestConsecutiveSubsequenceHashSet(new int[] {1, 9, 56, 10, 4, 20 , 2})); //2
		System.out.println(LongestConsecutiveSubsequenceHashSet(new int[] {1, 1, 1, 1, 1,1})); //1
		System.out.println(LongestConsecutiveSubsequenceHashSet(new int[] {1})); //1
		System.out.println(LongestConsecutiveSubsequenceHashSet(new int[] {})); //0
		System.out.println("------Sorting Method------");
		System.out.println(LongestConsecutiveSubsequenceSorting(new int[] {1, 9, 3, 10, 4, 20 , 2})); //4
		System.out.println(LongestConsecutiveSubsequenceSorting(new int[] {1, 9, 3, 5, 4, 20 , 2})); //5
		System.out.println(LongestConsecutiveSubsequenceSorting(new int[] {1, 9, 56, 10, 4, 20 , 2})); //2
		System.out.println(LongestConsecutiveSubsequenceSorting(new int[] {1, 1, 1, 1, 1,1})); //1
		System.out.println(LongestConsecutiveSubsequenceSorting(new int[] {1})); //1
		System.out.println(LongestConsecutiveSubsequenceSorting(new int[] {})); //0
	}
	
	public static int LongestConsecutiveSubsequenceSorting(int[] nums) {
		if (nums.length==0) {return 0;}
		Arrays.sort(nums);
		int longest=1, current=1;
		for (int i=0; i<nums.length-1; i++) {
			if (nums[i]!=nums[i+1]) {
				if(nums[i]+1==nums[i+1]) {
					current++;
				} 
				else {
					longest=Math.max(current, longest);
					current=1;
				}
			}
		}
		return longest;
	}
	
	public static int LongestConsecutiveSubsequenceHashSet(int[] nums) {
		HashSet<Integer> set=new HashSet<>();
		int length=0;
		for (int i=0; i<nums.length; i++) {
			set.add(nums[i]);
		}
		for (int i=0; i<nums.length; i++) {
			if(!set.contains(nums[i]-1)) {
				int a=nums[i];
				while(set.contains(a)) {
					a++;
				}
				if (length<a-nums[i]) {
					length=a-nums[i];
				}
			}
		}
		return length;
	}
}
