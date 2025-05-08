public class Main {

    public static boolean isSymmetric(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i][j] != arr[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {2, 4, 5}, {3, 5, 6}};
        System.out.println(isSymmetric(arr));
    }
}
