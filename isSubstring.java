
public class isSubstring {
	public static void main(String[] args) {
		String s="CodePath";
		String ss1="Code";
		String ss2="CodePath";
		String ss3="CodePathClass";
		String ss4="eP";
		String ss5="z";
		String ss6="";
		System.out.println(isSubstringLoop(s, ss1));    // true
		System.out.println(isSubstringLoop(s, ss2));	// true
		System.out.println(isSubstringLoop(s, ss3));	// false
		System.out.println(isSubstringLoop(s, ss4));	// true
		System.out.println(isSubstringLoop(s, ss5));	// false
		System.out.println(isSubstringLoop(s, ss6));	// false
	}
	
	public static boolean isSubstringStringFunction(String s1, String s2) {
		if(s1.length()>0&&s2.length()>0) {
			return s1.contains(s2);
		}
		return false;
	}
	
	public static boolean isSubstringLoop(String s1, String s2) {
		if(s1.length()>0&&s2.length()>0) {
			if(s1.equals(s2)) {
				return true;
			}
			
			if(s1.length()<s2.length()) {
				return false;
			}
			int subLength=s2.length();
			
			for (int i=0; i<s1.length()-subLength; i++) {
				String substring=s1.substring(i, subLength+i);
				//System.out.println(substring);
				if( substring.equals(s2)) {
					return true;
				}
			}
		}
		
		return false;
	}
}
