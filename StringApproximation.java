package zun.java.basics.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class StringApproximation {

	public static void main(String[] args) {
			
var list1 = new ArrayList<String>() ;  list1.add("zunasdfyeed");list1.add("sdinia"); list1.add("snsxussrfat");list1.add("xpcvaxxrveevdn");list1.add("mostafa"); var list2= new ArrayList<String>() ;   list2.add("zunayeeeeeed");	 list2.add("zxzzindfsdiaa");list2.add("nzczusrsat");list2.add("zfdfparvvfxceenpp");list2.add("aazxvmoscvtafa");
		
		System.out.println( Arrays.toString(approximateSum(list1, list2)) );
	} // end og main method
	
	
public static String[] approximateSum(List<String> list1, List<String> list2) {
	var ultimate = new String[list1.size()];
	var it_lt1 = list1.iterator();
	var it_lt2 = list2.iterator();
   int	index = 0;
	while(it_lt1.hasNext() && it_lt2.hasNext()) {
		ultimate[index] = compareDifference(it_lt1.next(), it_lt2.next());
		index++;
	} 
	return ultimate;
	 
 } // End of Approximatesum

	
//-----------------------------------------------------------------
public static String compareDifference(String m1, String m2) {
	var s1 = countChar(m1);
	var s2 = countChar(m2);
			
	//System.out.println("s2 map "+s2 + "\n"+"s1 map "+s1);	
			
var differences = new int[s1.size()];		
String result = "yes";	
var iterator1 = s1.values().iterator();
var iterator2 = s2.values().iterator();
int index = 0;
while (iterator1.hasNext() && iterator2.hasNext()) {
  differences[index] =Math.abs(iterator1.next()-iterator2.next()) ;
    if(differences[index]>3) {
    	result = "no";}
    index++;
}
	       			
//System.out.println("difference matrix"+ Arrays.toString(differences));
//System.out.println("result is:  " + result);
	
			return result; 
}// -----------------------------------------compareMapping method end
//-----------------------------------------------------------------------	
// returns a map of character and number of times each character appears
public static Map<Character, Integer> countChar(String message) {
	var charCountMap = new HashMap<Character, Integer>();			
	for(int i = 0; i < message.length(); i++) {		
		char c = message.charAt(i);
		if(c == ' ') continue;		
		else if(charCountMap.containsKey(c)) charCountMap.put(c, charCountMap.get(c)+1);	
		else charCountMap.put(c,1);
	}		
	return charCountMap;
		} //-------------------------------------------countChar method end 	
	
	
}// end of class test33

 
