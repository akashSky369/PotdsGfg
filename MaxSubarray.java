package POTDGFG;

import java.util.ArrayList;

public class MaxSubarray {
 //   a = [1, 2, -7, 2, 3,5]

  static ArrayList<Integer> findSubarray(int a[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ctrlist = new ArrayList<>();
        // code here
        int sum = 0;
        int ctrsum = 0;
for (int i = 0; i<n; i++){
    if (a[i]<0){
        if (ctrsum>sum){
         list = ctrlist;
        }
        ctrlist = new ArrayList<>();
        sum=Math.max(sum,ctrsum);
        ctrsum = 0;
    }
    else{
        ctrlist.add(a[i]);
        ctrsum+=a[i];
    }
}
if (ctrsum>sum){
    return ctrlist;
}
if (list.isEmpty()&&ctrlist.isEmpty()){
    list.add(-1);
    return list;
}

return list;
    }
    public static void main(String[] args) {
int[]a = {-1, 2};
        System.out.println(findSubarray(a, a.length));

    }
}
