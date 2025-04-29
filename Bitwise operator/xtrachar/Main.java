public class Main{
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "helllo";

        char res = 0;

        String concat = str1 + str2;

        char[] arr = concat.toCharArray();

        for(int i=0; i<arr.length; i++){
            // res ^= arr[i];

            res = (char) (res^arr[i]);
        }

        System.out.println("The extra charactor : "+ res);
    }
}