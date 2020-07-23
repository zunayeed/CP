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

public static void MergeSort(int[] A, int n){
	int mid, i, []L, []R ;
	if(n<2) return;
	mid=n/2; 
       L = new int[mid];
       R = new int[n-mid];
       for( i=0; i<mid; i++){
	L[i]= A[i];
	}
	for(i=mid;i<n;i++){
	R[i-mid] = A[i];	
	}
	MergeSort(L,mid);
	MergeSort(R,mid);
	Merge(A,L,mid,R,n,n-mid);
}
```
