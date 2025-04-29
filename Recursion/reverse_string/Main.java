public class Main {
    public static String reverse(String s, int l){
        if(l==0){
            return s.charAt(0)+"";
        }
        return s.charAt(l)+reverse(s, l-1);
    }
    public static void main(String[] args) {
        String s = "FOUR";
        int l = s.length()-1;
        String ans = reverse(s, l);
        System.out.println(ans);
    }
}
