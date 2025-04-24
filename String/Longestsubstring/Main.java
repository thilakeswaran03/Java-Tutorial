import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

    //using hashset
    public static void lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int count =0;
        Set<Character> charset  = new HashSet<>();

        while(j < s.length()){
            while(charset.contains(s.charAt(j))){
                charset.remove(s.charAt(i));
                i++;
            }
            charset.add(s.charAt(j));
            count = Math.max(count, j-i+1);
            j++;
        }
        System.out.println(count);
    }

    // using hashmap
    public static void possiblesubstring(String s){
        int max=0;
        int l =0;
        HashMap<Character, Integer> charset = new HashMap<>();

        for(int r=0; r<s.length(); r++){
            char curr = s.charAt(r);
            if(!charset.containsKey(curr)){
                charset.put(curr, r);
            } else{
                l = Math.max(l, charset.get(curr)+1);
                charset.put(curr,r);
            }

            max = Math.max(max, (r-l)+1);
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        //lengthOfLongestSubstring("abcabcbb");
        possiblesubstring("pwwew");
    }
}
