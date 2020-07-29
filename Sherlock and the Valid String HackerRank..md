- [Sherlock and the Valid String of HackerRank](https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings)
#  Sherlock and the Valid String of HackerRank Algorithm:
- To check a string S can be converted to a “valid” string by removing less than or equal to one character.
  1. Assume only lowercase letters
  2. Store the frequency of each character of a string using  __charAt()__ function.
  3. __find first character__ with non-zero frequency1 and set countFrequency1 to 0 and break the loop once countFrequency1 is 1.
  4. traverse from the next index. Find a character with different frequency(frequency2) from frequency1, and count the number of times both frequencies(frequency1 and frequency2) occur until(break or exit loop) getting different frequency. In other words, increment countFrequency1 and countFrequency2. 
  5. Keep counting and look for another non-zero frequency. If we find a third non-zero frequency, or count of both the frequencies(countFrequency1 and countFrequency2) become greater than 1, return NO. 
