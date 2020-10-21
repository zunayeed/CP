    // Complete the isValid function below.
    static String isValid(String s) {
            Map<Character, Integer> hm = new HashMap<>();
    for(int i=0; i<s.length(); i++){
     hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
    }

     int min = Collections.min(hm.values());
     int max = Collections.max(hm.values());

    if(min==max)
        return "YES";
     HashMap<Integer,Integer> intMap = new HashMap();
           for(int count : hm.values())
           {
              Integer val = intMap.get(count);
               if(null != val)
                   {
                   intMap.put(count,val+1);
               }
               else
                   {
                   intMap.put(count,1);
               }
           }

    return intMap.size() == 2 && (intMap.get(min) == 1 || intMap.get(max) == 1) 
                      && (max-min<=1 || (min==1 && intMap.get(min) == 1))? "YES" : "NO";

    }
