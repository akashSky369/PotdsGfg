package POTDGFG;

public class ReverseWords {
    public static String reverseWords(String s) {
s = s.trim();
StringBuilder res = new StringBuilder();
StringBuilder ctr = new StringBuilder();

for (int i=s.length()-1; i>=0; i--){
    if (s.charAt(i)==' '){
        if (!ctr.isEmpty()) {
            ctr.reverse();
            res.append(ctr);
            res.append(' ');
        }
        ctr = new StringBuilder();
    }
    else {
        ctr.append(s.charAt(i));
    }
}
ctr.reverse();
res.append(ctr);

return res.toString();
    }
    public static void main(String[] args) {


        System.out.println(reverseWords("a good   example"));
    }
}
