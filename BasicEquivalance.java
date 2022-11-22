package POTDGFG;

public class BasicEquivalance {
   static String baseEquiv(int n, int m)
    {
        // code here
        int i =2;
        while(i<=32){
            int num = giveBaseNum(n,i);
            System.out.println(i+"  "+num);
            int digits = digCount(num);
            if(digits==m){
                return "Yes";
            }
            i++;

        }
        return "No";
    }

    public static int giveBaseNum(int n,int base){
        StringBuilder str = new StringBuilder();
        while(n>0){
            int mod = n%base;
            str.append(mod);
            n/=base;
        }
        str.reverse();

        return Integer.parseInt(str.toString());
    }

    public static int digCount(int num){
        int n = 0;
        while(num>0){
            num = num/10;
            n++;
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println(baseEquiv(3,1));
    }
}
