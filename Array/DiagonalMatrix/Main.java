public class Main {

    public static boolean isdiagonal(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(i!=j && arr[i][j]!=0 ){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,0,0,0,0}, {0,1,0,0,0}, {0,0,1,0,0}, {0,0,0,1,0}, {0,0,0,0,1}};
        System.out.println(isdiagonal(arr));
    }
}
