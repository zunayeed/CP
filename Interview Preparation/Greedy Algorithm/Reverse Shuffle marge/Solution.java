import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String string = scan.next();
		char[] str = string.toCharArray();
		int n = str.length;
		int[] unused= new int[26];
		int[] used = new int[26];
		int[] required = new int[26];
		char[] result = new char[100000];
		int j =0;
		
		// filling array mapping char freq 
		for(int i=0;i<n;i++) {
			unused[str[i]-'a']++;
		}
		for(int i=0; i<26;i++) {
			required[i]=unused[i]/2;
		}
		char ch = str[n-1];// last character 
		int chPosition = ch-'a';// index present in the above array
		result[j++]=ch;
		// add 1 value to useds and deduct one form unsued
		unused[chPosition]--;
		used[chPosition]++;
		
		// rest of char 
		//add required is smaller than present 
		// ch smaller 
		// ch can be larger, no issue for lexicography
		
		for(int i=n-2;i>=0;i--) {
			ch = str[i];
			chPosition = ch -'a';
				// to add or not 
			if(used[chPosition]<required[chPosition]) {
				// add char and it can be bigger  or smaller
				if(ch>result[j-1]) { // add char when greater
					result[j++]=ch;
					unused[chPosition]--;
					used[chPosition]++;
				}
				else {
					// check if last element is integer or not 
					// pop particular value
	while(j>0 && ch<result[j-1] && 
	  used[result[j-1]-'a']-1+ unused[result[j-1]-'a'] >=
			required[result[j-1]-'a']
			) {
				used[result[--j]-'a']--;// popping element
			   }
			result[j++]=ch;
			unused[chPosition]--;
			used[chPosition]++;
	
				}
			}else {
				unused[chPosition]--;// discarding particular char
			}
		}
		String res = String.copyValueOf(result) ;
		for(int i=0;i<n/2;i++) {
			System.out.print(res.charAt(i)+"");
		}
		
	  }
}

