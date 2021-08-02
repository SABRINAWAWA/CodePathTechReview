import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	public static void main(String[] args) {
		System.out.println(romanToInt("III")); // 3
		System.out.println(romanToInt("IV")); //4
		System.out.println(romanToInt("IX")); // 9
		System.out.println(romanToInt("LVIII")); // 58
		System.out.println(romanToInt("MCMXCIV")); // 1994
	}
	public static int romanToInt(String s) {
        Map<Character, Integer> map=new HashMap<Character, Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int sum=map.get(Character.valueOf(s.charAt(0)));
        for (int i=1; i<s.length(); i++){
            Character currCharInS=Character.valueOf(s.charAt(i));
            int currNum=map.get(currCharInS);
            Character prevCharInS=Character.valueOf(s.charAt(i-1));
            int prevNum=map.get(prevCharInS);
            sum+=currNum;
            if (prevNum<currNum){
                sum-=(2*prevNum);
            }
        }
        return sum;               
    }
}
