import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class arrayInteraction {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(interactArray(new int[] {1,2,2,1}, new int[] {2,2}))); // [2]
		System.out.println(Arrays.toString(interactArray(new int[] {4,9,5}, new int[] {9,4,9,8,4}))); // [4,9]
		System.out.println(Arrays.toString(interactArray(new int[] {1,2,3,4,5,6}, new int[] {2,3,3,2}))); // [2,3]
		System.out.println(Arrays.toString(interactArray(new int[] {45}, new int[] {9,4,9,8,4}))); // []
	}
	
	public static int[] interactArray(int[] arr1, int[] arr2) {
		Set<Integer> set1=new HashSet<>();
		Set<Integer> set2=new HashSet<>();
		for (int i=0; i<arr1.length; i++) {
			set1.add(arr1[i]);
		}
		for (int i=0; i<arr2.length; i++) {
			set2.add(arr2[i]);
		}
		set1.retainAll(set2);
		int[] result=new int[set1.size()];
		int index=0;
		for (int i:set1) {
			result[index++]=i;
		}
		return result;
	}
}
