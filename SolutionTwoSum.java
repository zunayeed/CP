package problemSolving;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class SolutionTwoSum {
	
	static int[] testNums = {15,11,2,9,0}; 
	public int[] twoSum(int[] nums, int target) {
	int[] result = new int[2]; // return types
	LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer,Integer>();
	for(int i = 0; i < nums.length; i++) {
		map.put(nums[i],i);
		int difference= target -nums[i];
		if(map.containsKey(difference)) {
			result[0]= i; 
			result[1]= map.get(difference);
			return result;
		}
		
	}
	return result;	
	}
	
public static void main(String[] args) {
	
	SolutionTwoSum t = new SolutionTwoSum();
	int res[] = t.twoSum(testNums, 9); 
	for(int i: res) {
		System.out.println(i);
	}
	

	
}
}
