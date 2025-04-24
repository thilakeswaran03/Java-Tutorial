public class Main {
    public static void main(String[] args) {
        int n = 0b0101;
        int ans = 0;
        int bits = Integer.toBinaryString(n).length();
        while (bits-- > 0){
            int last = n&1;
            System.out.println(last);

            ans = (ans << 1) | last;
            n = n >> 1;
        }
        System.out.println(ans);
    }
}
