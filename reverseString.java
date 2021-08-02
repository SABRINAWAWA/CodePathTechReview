// Week 1 Session 2 Question 1
public class reverseString {
	public static void main(String[] args) {
		String s="Code Path";
		String ss="Code";
		System.out.println(ss.contains(ss));
		System.out.println(reverseStringsWithCharArr(s));
		String s1="";
		System.out.println(reverseStringsWithCharArr(s1));
		String s2="             ";
		System.out.println(reverseStringsWithCharArr(s2));
		String s3="             Hello!";
		System.out.println(reverseStringsWithCharArr(s3));
		String s4="             Hello!              ";
		System.out.println(reverseStringsWithCharArr(s4));
		
		System.out.println(reverseStringsWithStringBuilder(s));
		System.out.println(reverseStringsWithStringBuilder(s1));
		System.out.println(reverseStringsWithStringBuilder(s2));
		System.out.println(reverseStringsWithStringBuilder(s3));
		System.out.println(reverseStringsWithStringBuilder(s4));
	}
	
	public static String reverseStringsWithCharArr(String s) {
		char[] charArr=s.toCharArray();
		for (int i=0; i<charArr.length/2; i++) {
			char temp=charArr[i];
			charArr[i]=charArr[charArr.length-i-1];
			charArr[charArr.length-i-1]=temp;
		}
		return String.valueOf(charArr);
	}
	
	public static String reverseStringsWithStringBuilder(String s) {
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}
}
