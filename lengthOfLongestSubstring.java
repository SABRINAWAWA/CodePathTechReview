import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstringHashMap("abcabcbb")); // 3
		System.out.println(lengthOfLongestSubstringHashMap("bbbbb")); // 1
		System.out.println(lengthOfLongestSubstringHashMap("pwwkew")); // 3
		System.out.println(lengthOfLongestSubstringHashMap("")); // 0
		System.out.println(lengthOfLongestSubstringHashMap("abcdeafgtijhhgf")); // 11
	}
	
	public static int lengthOfLongestSubstringHashMap(String s) {
        if (s.length()==0){
            return 0;
        }
        Map<Character, Integer> map=new HashMap<Character, Integer>();
        int answer=0;
        for(int j=0, i=0; j<s.length(); j++){
            if(map.containsKey(s.charAt(j))){
                i=Math.max(map.get(s.charAt(j)), i);
            }
            answer=Math.max(answer, j-i+1);
            map.put(s.charAt(j), j+1);
        }
        return answer;
    }
}
