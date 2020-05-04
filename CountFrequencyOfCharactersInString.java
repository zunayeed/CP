package zun.java.basics.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountFrequencyOfCharactersInString {

	public static void main(String[] args) {	
		
	String [] matchResult = new String[1]; 
	String name1 = "zunayeed";
	String name2 = "zunnnaaayeed";
	    
	Set<Map.Entry<Character,Integer>> s1 = countChar(name1);
    Set s2 = countChar(name2);
	
    System.out.println(s1);
    System.out.println(s2);
	
	List<String> list1 = new ArrayList<String>() ;
	  list1.add("zunayeed");
	  list1.add("zfgdfgd");
	  list1.add("nubvnvbsranvt");
	  list1.add("pxabvrvcvcvcexb");
	  list1.add("zxmvnonsntnzabfba");
	  
	  int sizeOfList = list1.size();
	//   System.out.println(sizeOfList);
	  
	  List<String> list2= new ArrayList<String>() ;
	  list2.add("zzzunnayeed");	
	  list2.add("iniafda");
	  list2.add("usrsaxt");
	  list2.add("arveenpp");
	  list2.add("aaostafcxa");
	
	
}
	// method used to count characters in a String
	public static Set countChar(String message) {
		Map<Character,Integer> charMapToCount = new HashMap<Character, Integer>();	
		// loop through String	
		for(int i = 0; i < message.length(); i++) {
		// take one character 
			char c = message.charAt(i);
		// ignore space in String as we do not need to count using if-continue statement
			if(c == ' ') continue;
		// if the character is present in map(containsKey()== true), then increase the value by 1: put(k, Map.get(k)+1)
			else if(charMapToCount.containsKey(c)) charMapToCount.put(c, charMapToCount.get(c)+1);
		// else the character does not exists in map, then put the characters(k) with values 1: put(k,1)
			else charMapToCount.put(c,1);
		}
		
		
		// Displaying map values
		 Set<Map.Entry<Character,Integer>> numset =  charMapToCount.entrySet();
		 for(Map.Entry<Character, Integer> m : numset){
			// System.out.println("Char: "+ m.getKey()+ " count: " + m.getValue());
		 }
		
		return charMapToCount.entrySet();
	}
	
	
	

	
	
}
