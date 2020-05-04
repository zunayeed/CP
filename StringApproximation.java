package zun.java.basics.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class StringApproximation {

	public static void main(String[] args) {
		
var list1 = new ArrayList<String>() ;  list1.add("zunayeed");list1.add("nusrat"); list1.add("ishrat");list1.add("parveen");list1.add("mostafa"); 
var list2= new ArrayList<String>() ;   list2.add("zunayeeeeeed");	 list2.add("nusrat");list2.add("ishrat");list2.add("parveeen");list2.add("mosssstaaafaaa");
		
		System.out.println( Arrays.toString(approximateSum(list1, list2)) );
		
	}
	

  static String[] approximateSum(List<String> list1, List<String>list2) {
		
	 String[] ultimate = new String[list1.size()];
	 var it_lt1 = list1.iterator();
	 var it_lt2 = list2.iterator();
	 int	index = 0;
		while(it_lt1.hasNext() && it_lt2.hasNext()) {
		ultimate[index] = compDiff(it_lt1.next(), it_lt2.next());	
			index++;
		}
		return ultimate;
	}
	
 static String compDiff(String s1, String s2) {
	 
	 var s1it = countChar(s1).values().iterator();
	 var s2it = countChar(s2).values().iterator();
	 var dif =  new int[countChar(s1).size()]; 
	 int index = 0 ; 
	 String result = "yes";
	 while(s1it.hasNext() && s2it.hasNext()) {
		 dif[index] = Math.abs(s1it.next()-s2it.next());
		 if(dif[index]>3)
			 result = "no";
	      index++;
	 }
	 
	 return result;
 }
	
 static Map<Character,Integer> countChar(String message){
	 
	 var mapFreq = new HashMap<Character, Integer>();
	 for(int i = 0; i<message.length();i++) {
		 char c = message.charAt(i);
		 if(c==' ')continue;
		 else if(!(mapFreq.containsKey(c))) mapFreq.put(c,1 );		 
		 else mapFreq.put(c, mapFreq.get(c)+1);		 
	 }	 
	 return mapFreq;
 }
}
