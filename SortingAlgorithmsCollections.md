# Merge Sorting 
```java 
// function to merge Arrays L and R into A
// leftCount = number of elements in L
// righCount = number of elements in R 
public static void Merge(int A, int L, int leftCount, int rightCount){
 int i,j,k;
// i - to mark index of left sub-array(L)
// j - to mark index of right sub-array(R)
// k - to mark index of merged sub-array(A)
i=0; j=0; k=0;
    while(i<leftCount && j<rightCount){
	 if(L[i]< R[j]){
		A[k++] = L[i++];
	  }else{
		A[k++] = R[j++];
	}
    }
  // when one of the conditions of above while loop fails, check the condition(two while //  loop) to fill the rest of the positions 
   while(i<leftCount){
		A[k++] = L[i++];
	}
   while(j<rightCount){
		A[k++] = R[j++];
	}
	
}
// recursive function to sort the array of integers
public static void MergeSort(int[] A, int n){
	int mid, i, []L, []R ;
	if(n<2) return; // base condition: if the array has less than 2 elements, do nothing
	mid=n/2; // find the mid index
	// create left and right sub arrays
	// mid elements(from index 0 till mid-1) shuold be a part of left sub-array
	// (n-mid) elements( from mid to n-1) will be a part of right sub-array
       L = new int[mid];
       R = new int[n-mid];
       for( i=0; i<mid; i++){
	L[i]= A[i]; // creating left subarray
	}
	for(i=mid;i<n;i++){
	R[i-mid] = A[i]; // creating right subarraty	
	}
	MergeSort(L,mid); // sorting the left subarray
	MergeSort(R,mid); // sorting the right subarray
	Merge(A,L,mid,R,n,n-mid);
}
```
