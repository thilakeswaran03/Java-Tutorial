public class Main {

    // function to return the sum of array
    public static int add(int[] arr, int l){
        if(l<0){
            return 0;
        }
        return arr[l]+add(arr, l-1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int l = arr.length-1;
        int res  = add(arr, l);
        System.out.println(res);
    }
}
