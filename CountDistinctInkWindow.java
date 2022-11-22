package POTDGFG;
import java.util.*;
public class CountDistinctInkWindow {

    ArrayList<Integer> countDistinct(int arr[], int n, int k)
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        int l = 0;
        int j=0;
      //  int ctr =0;
        while(j<n){
            if(j-l+1==k){
                list.add(map.size());
                map.put(arr[l],map.get(arr[l])-1);
                if(map.get(arr[l])==0){
                    map.remove(arr[l]);
                }
                l++;
            }
            else{
                map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            }
            j++;
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
