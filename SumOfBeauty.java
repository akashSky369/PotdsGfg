package POTDGFG;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SumOfBeauty {
    public static int beautySum(String s) {
        // code here
        if (s.length()<=2){
            return 0;
        }
int ans = 0;
        int l  = 0;
        int h = 2;
        while (l<s.length()){
            int k = h;
            while (k<s.length()){
                ans+=beauty(s.substring(l,k+1));
                k++;
            }
            l++;
            h++;
        }
        return ans;
    }

    public static int beauty(String s){
        Map<Character,Integer> map = new HashMap<>();
        for (char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int max = Collections.max(map.values());
        int min = Collections.min(map.values());
        return max-min;
    }

    public static void main(String[] args) {

        System.out.println(beautySum("geeksforgeeks"));
        //aaac
    }
}
