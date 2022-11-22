package POTDGFG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoPrimeSum {
    static String isSumOfTwo(int N) {
        // code here


        int prime[] = new int[N + 1];
        for (int i = 0; i <= N; i++)
            prime[i] = 1;

        for (int i = 2; i <= Math.sqrt(N); i++) {
            //check if number i is prime
            if (prime[i] == 1) {
                //update all the multiples of i
                for (int j = i * i; j <= N; j = j + i) {
                    prime[j] = 0;
                }
            }



            //34
            // 2 3 5 7 9 11 13 17 23 29 31
        }
        ArrayList<Integer> sieve = new ArrayList<>();
        for (int j =1; j< prime.length; j++){
            if (prime[j]==1){
                sieve.add(prime[j]);
            }
        }
        int l =0;
        int h = sieve.size()-1;
        while (l<h){
            if (sieve.get(l)+ sieve.get(h)==N){
                return "Yes";
            }
            else if (sieve.get(l)+ sieve.get(h)<N){
                l++;
            }
            else {
                h--;
            }
        }
        return "No";
    }


    static void findTheSubArray(int arr[], int n, int sum) {
        // Write your code here

        Map<Integer,Integer> map = new HashMap<>();
        int ressum = 0;
        boolean isTrue = true;
        int first, second = 0;
        for(int i =0; i<n ;i++){
            ressum +=arr[i];
            if(map.containsValue(ressum-sum)){

            }
        }
    }
    public static void main(String[] args) {
        System.out.println(isSumOfTwo(34));
    }
}
