### [Two Characters HackerRank](https://www.hackerrank.com/challenges/two-characters/problem)
```java
public class Test {
     public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int len = in.nextInt();
    String s = in.next();

    int longestSolution = 0;
    // nexted for loop to consider all combinations of (a,b)
    for (int i = 0; i < 26; i++)
    {
        for (int j = i + 1; j < 26; j++)
        {
            char c1 = (char)((int)'a' + i);
            char c2 = (char)((int)'a' + j);

            int currentChar = -1;
            int countChar = 0;
            // take each character of the input string, and check if it matches with specific ordered combination(ababab)
            for (int z = 0; z < len; z++)
            {
                if (s.charAt(z) == c1)
                {
                    if (currentChar == 1) // if last char was same as current one, that means this combination will not work, so cancel and go out of loop 
                    {
                        currentChar = -1;
                        break;
                    }
                    currentChar = 1; // if last character was not the same, make current character 1 and  count++
                    countChar++;
                }
                else if (s.charAt(z) == c2)
                {
                    if (currentChar == 2)
                    {
                        currentChar = -1;
                        break;
                    }
                    currentChar = 2;
                    countChar++;
                }
            } // end of for statement with z
            if (currentChar != -1 &&
                countChar > 1 &&
                countChar > longestSolution)
            {
                longestSolution = countChar;
            }
        }
    }
    System.out.println(longestSolution);
}
}
```
