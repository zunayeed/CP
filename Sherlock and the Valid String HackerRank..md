
Table of Contents: 
1. Sherlock and the Valid String of HackerRank Algorithm
   - follow third approach(best approach) but I gives wrong result, and still need to be modified


- [Sherlock and the Valid String of HackerRank](https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings)
#  Sherlock and the Valid String of HackerRank Algorithm:
- To check a string S can be converted to a “valid” string by removing less than or equal to one character.
  1. Assume only lowercase letters
  2. Store the frequency of each character of a string using  __charAt()__ function.
  3. __find first character__ with non-zero frequency1 and set countFrequency1 to 0 and break the loop once countFrequency1 is 1.
  4. traverse from the next index. Find a character with different frequency(frequency2) from frequency1, and count the number of times both frequencies(frequency1 and frequency2) occur until(break or exit loop) getting different frequency. In other words, increment countFrequency1 and countFrequency2. 
  5. Keep counting and look for another non-zero frequency. If we find a third non-zero frequency, or count of both the frequencies(countFrequency1 and countFrequency2) become greater than 1, return NO. 
  
```java 
// Java program to check if a string can be made 
// valid by removing at most 1 character. 
public class Test {   
// Assuming only lower case characters 
    static final int CHARS = 26;   
    /* To check a string S can be converted to a “valid” 
   string by removing less than or equal to one 
   character. */
    static boolean isValidString(String str) { 
        int freq[] = new int[CHARS]; 
  
        // freq[] : stores the  frequency of each 
        // character of a string 
        for (int i = 0; i < str.length(); i++) { 
            freq[str.charAt(i) - 'a']++; 
        } 
  
        // Find first character with non-zero frequency 
        int i, freq1 = 0, count_freq1 = 0; 
        for (i = 0; i < CHARS; i++) { 
            if (freq[i] != 0) { 
                freq1 = freq[i]; 
                count_freq1 = 1; 
                break; 
            } 
        }   
        // Find a character with frequency different 
        // from freq1. 
        int j, freq2 = 0, count_freq2 = 0; 
        for (j = i + 1; j < CHARS; j++) { 
            if (freq[j] != 0) { 
                if (freq[j] == freq1) { 
                    count_freq1++; 
                } else { 
                    count_freq2 = 1; 
                    freq2 = freq[j]; 
                    break; 
                } 
            } 
        }   
        // If we find a third non-zero frequency 
        // or count of both frequencies become more 
        // than 1, then return false 
        for (int k = j + 1; k < CHARS; k++) { 
            if (freq[k] != 0) { 
                if (freq[k] == freq1) { 
                    count_freq1++; 
                } 
                if (freq[k] == freq2) { 
                    count_freq2++; 
                } else // If we find a third non-zero freq 
                { 
                    return false; 
                } 
            } 
  
            // If counts of both frequencies is more than 1 
            if (count_freq1 > 1 && count_freq2 > 1) { 
                return false; 
            } 
        } 
  
        // Return true if we reach here 
        return true; 
    } 
// Driver code 
    public static void main(String[] args) { 
        String str = "abcbc"; 
  
        if (isValidString(str)) { 
            System.out.println("YES"); 
        } else { 
            System.out.println("NO"); 
        } 
    } 
} 
```
-----------------------------------------
``` java
\\ solution using hashMap
package zun.java.basics.practice3;
import java.util.HashMap; 
import java.util.Iterator; 
import java.util.Map; 
  
public class AllCharsWithSameFrequencyWithOneVarAllowed { 
      
	// Complete the isValid function below.
    static String isValid(String s) {
        if(s == null || s.isEmpty()){
            return "YES";
        }
        Map<Character,Integer> map = new HashMap<>();
    for(int i=0; i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
    }
    Iterator<Integer> itr = map.values().iterator();
    boolean first = true, second = true ; 
    int frequency1 = 0 , frequency2 = 0;
    int countFrequency1 =0, countFrequency2=0;
    while(itr.hasNext()){
        int i = itr.next();
        // if first is true, countFrequency1 is increased
        if(first){
            frequency1 = i ; 
            first = false; 
            countFrequency1++;
            continue;
        }
        if(i== frequency1){
            countFrequency1++; 
            continue;
        }
        // if second is true, countFrequency2 is increased 
        if(second){
            frequency2 = i; 
            countFrequency2++; 
            second = false;
            continue; 
        }
        if(i==frequency2){
            countFrequency2++;
            continue;
        }
        return "NO";
    }
         if(countFrequency1 > 1 && countFrequency2 > 1) { 
            return "NO"; 
          }else { 
            return "YES"; 
        } 

    }

      
    // Driver code 
    public static void main(String[] args) 
    { 
              
        System.out.println(isValid("aaaabbcc")); 
    } 
} 
```
------------------------------------------------------------------------------------------------------
```java
// Complete the isValid function below.
    static String isValid(String s) {
        Map<Character,Integer> map = new HashMap<>();
    for(int i=0; i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
    }

      List<Integer> mapValues = new ArrayList(map.values());
    int max = (int)Collections.max(mapValues);
    int min = (int)Collections.min(mapValues);
      
     if(min==max) return "YES"; 
     int min_count=0, max_count=0 ;  
     for(int i=0; i<mapValues.size();i++){
         if(mapValues.get(i)== max){
             max_count++;
         }
         if(mapValues.get(i)== min){
             min_count++;
         }
     }
     return (min_count==1||(max_count==1 && max== min+1))? "YES":"NO";

    } // end of isValid method
```

