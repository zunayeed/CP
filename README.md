# Competitive-Programming
__This repository is for problem solving__ 
- [Must Do Coding Questions for Companies like Amazon,Microsoft,Adobe](https://www.geeksforgeeks.org/must-do-coding-questions-for-companies-like-amazon-microsoft-adobe/#stack) 
- [geeksforGeeksAll algorithm](https://www.geeksforgeeks.org/fundamentals-of-algorithms/)
- [helpfulyoutubevideo](https://youtu.be/bVKHRtafgPc)

- [Shafaet Vai's Link](http://www.shafaetsplanet.com/)
- [Count triplests Hackerrank Solution](https://www.youtube.com/watch?v=tBFZMaWP0W8)
- [running median calculation using queues](https://www.youtube.com/watch?v=VmogG01IjYc)
- [fradulent activity notification using counting sort](https://jjromi.github.io/2017/lucky_45/) this problem can be solved using priority queue concepts with hackerrank video
  - [counting sort algorithm luckys video-code need to be written with links](https://www.youtube.com/watch?v=pEJiGC-ObQE)
```java
   static long substrCount(string s)
    {
        long retVal = s.length();

        for (int i = 0; i < s.length(); i++)
        {
            char startChar = s[i];
            int diffCharIdx = -1;
            for (int j = i + 1; j < s.length; j++)
            {
                char currChar = s[j];
                if (startChar == currChar)
                {
                    if ((diffCharIdx == -1) || (j - diffCharIdx) == (diffCharIdx - i))
                    { 
			retVal++;
		    }
                }
                else
                {
                    if (diffCharIdx == -1)
                        diffCharIdx = j;
                    else
                        break;
                }
            }// inner for loop
        } // outer for loop
        return retVal;
    }

If you are interested in exploring employment opportunities at Solid State Cooling Systems, please contact us directly by calling 1-845-296-1300 or sending us an email at info1@sscooling.com.
```
