```java
    // Complete the countInversions function below.
    static long countInversions(int[] arr) {
          int left = 0;
         int right = arr.length-1;
         int length = arr.length; 
         
        // left =  beginning index of arr 
         //right = end index of arr 
        // Keeps track of the inversion count at a 
        // particular node of the recursion tree 
        long inversionCount = 0; 
        
        if (left < right) { 
            int mid = (left + right) / 2; 
            // Left subarray 
            int[] leftArray = Arrays.copyOfRange(arr, left, mid + 1); 
      
            // Right subarray 
            int[] rightArray = Arrays.copyOfRange(arr, mid + 1, right + 1); 
  
            // Total inversion count = left subarray count 
            // + right subarray count + merge count 
  
            // Left subarray count 
            inversionCount += countInversions(leftArray); 
  
            // Right subarray count 
            inversionCount += countInversions(rightArray); 
  
            // Merge count 
            inversionCount += merge(arr, leftArray, rightArray,mid); 
        } 
  
        return inversionCount; 
       
    }


    // Function to count the number of inversions 
    // during the merge process 
    public static long merge(int[] arr, int[] leftArray, int[] rightArray,int mid) 
    { 
  
      
        //int left = 0;
        int i = 0, j = 0, k = 0;
        long swaps = 0; 
  
        while (i < leftArray.length && j < rightArray.length) { 
            if (leftArray[i] <= rightArray[j]) 
                arr[k++] = leftArray[i++]; 
            else { 
                arr[k++] = rightArray[j++]; 
                swaps += mid + 1  - i; 
            } 
        } 
  
        // Fill from the rest of the left subarray 
        while (i < leftArray.length) 
            arr[k++] = leftArray[i++]; 
  
        // Fill from the rest of the right subarray 
        while (j < rightArray.length) 
            arr[k++] = rightArray[j++]; 
  
        return swaps; 
    } 
    ```
