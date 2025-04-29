public class Main {
    public static void main(String[] args) {
        int n1 = 0b1001; // 5
        int n2 = 0b0100; // 

        // method 1: using forloop
        int len1 = Integer.toBinaryString(n1).length();
        int len2 = Integer.toBinaryString(n2).length();
        int max = Math.max(len1, len2);
        int count=0;
        for(int i=0; i<max; i++){
            int bit1 = (n1 >> i) & 1;
            int bit2 = (n2 >> i) & 1;
            if(bit1 != bit2){
                count++;
            }
        }
        
        // method 2: using xor operator
        // int xor = n1^n2; // xor = 1001 ^ 1100 = 0101
        // int count=0;
        // while(xor > 0){
        //     count += xor & 1; // check if the last bit is 1
        //     xor = xor >> 1; // right shift to check the next bit
        // }
        System.out.println("Number of different bits: " + count);
    }
}
