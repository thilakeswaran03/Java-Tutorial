public class Main {

    public static boolean islower(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(i>=j && arr[i][j]==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isupper(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(i<=j && arr[i][j]==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        int[][] arr1 = {{1, 0, 0}, {2, 3, 0}, {4, 5, 6}};
        int[][] arr2 = {{1, 2, 3}, {0, 4, 5}, {0, 0, 6}};

        System.out.println(islower(arr1));
        System.out.println(isupper(arr2));
    }
}
