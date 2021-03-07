public static int nonDivisibleSubset(int k, List<Integer> s) {
    // Write your code here
    int[] remainders = new int[k];
    for(int i=0; i<s.size();i++){
        int num = s.get(i);
        int index = num%k;
        remainders[index]++;
    }
    int size = 0;
    for(int i=1; i<=k/2;i++){
        if(i*2 == k){
            size++;
        }
        else{
            size += Math.max(remainders[i], remainders[k-i]);
        }
    }
        return remainders[0] !=0 ? size+1:size; 
    }

}
