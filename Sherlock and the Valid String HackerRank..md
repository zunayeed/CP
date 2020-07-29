
Table of Contents: 
1. Sherlock and the Valid String of HackerRank Algorithm


- [Sherlock and the Valid String of HackerRank](https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings)
#  Sherlock and the Valid String of HackerRank Algorithm:
- To check a string S can be converted to a “valid” string by removing less than or equal to one character.
  1. Assume only lowercase letters
  2. Store the frequency of each character of a string using  __charAt()__ function.
  3. __find first character__ with non-zero frequency1 and set countFrequency1 to 0 and break the loop once countFrequency1 is 1.
  4. traverse from the next index. Find a character with different frequency(frequency2) from frequency1, and count the number of times both frequencies(frequency1 and frequency2) occur until(break or exit loop) getting different frequency. In other words, increment countFrequency1 and countFrequency2. 
  5. Keep counting and look for another non-zero frequency. If we find a third non-zero frequency, or count of both the frequencies(countFrequency1 and countFrequency2) become greater than 1, return NO. 
  ```java 
  / Java program to check if a string can be made 
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
