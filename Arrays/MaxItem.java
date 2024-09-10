package Arrays;

public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {1,45,34,245,49};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
