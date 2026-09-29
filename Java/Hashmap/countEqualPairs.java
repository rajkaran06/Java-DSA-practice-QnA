class Solution {
    public int equalPairs(String words) {
        // code here
         HashMap<Character,Integer> map = new HashMap<>();
          for(int i =0;i<words.length();i++){
            char ch = words.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
         }
            int count =0;
            for(char ch : map.keySet()){
                int freq = map.get(ch);
                 count+= freq*freq;
         }
         return count;
            }
        }
