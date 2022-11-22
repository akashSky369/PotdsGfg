package POTDGFG;

import java.util.ArrayList;

public class UniquePartitions {

    public static ArrayList<ArrayList<Integer>> UniquePartitions(int n)
    {
        // Code here
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    ArrayList<Integer> helper = new ArrayList<>();
   int idx = n-1;
    int[] arr = new int[n];
    for (int i =0; i<n; i++){
        arr[i] = i+1;
    }

     dp(res,arr,n,idx,helper);

return res;
    }

   static void dp(  ArrayList<ArrayList<Integer>> res, int[] arr,int n,int idx,ArrayList<Integer> helper){

        //base case

       if (idx<0 || n<0){
           return;
       }

       helper.add(arr[idx]);

       if (n-arr[idx]==0){
           res.add(new ArrayList<>(helper));
       }
       dp(res,arr,n-arr[idx],idx,helper);
       helper.remove(helper.size()-1);

dp(res,arr,n,idx-1,helper);
    }
    public static void main(String[] args) {
        System.out.println(UniquePartitions(3));
    }
}
