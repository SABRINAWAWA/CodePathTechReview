import java.util.HashMap;
import java.util.Map;

public class isomophreicWord {
	public static void main(String[] args) {
		System.out.println(isIsomorphic("foo", "bar")); // false
		System.out.println(isIsomorphic("mom", "dad")); // true
		System.out.println(isIsomorphic("tea", "boo")); // false
		System.out.println(isIsomorphic("", "")); // false
		System.out.println(isIsomorphic("mop", "dad")); // false
		System.out.println(isIsomorphic("egg", "add")); // true
		System.out.println(isIsomorphic("paper", "title")); // true	
	}
	
	public static boolean isIsomorphic(String s, String t) {
		if(s.length()==0||t.length()==0) {
			return false;
		}
		
		Map<Character, Character> map=new HashMap<Character, Character> ();
		for (int i=0; i<s.length(); i++) {
			//System.out.println(s.charAt(i));
			//System.out.println(t.charAt(i));
			if(map.containsKey(s.charAt(i))){
				if(map.get(s.charAt(i))!=t.charAt(i)) {
					return false;
				}
			}else {
				if(map.containsValue(t.charAt(i))) {
					return false;
				}
				map.put(s.charAt(i), t.charAt(i));
			}
		}

		return true;
	}
}
