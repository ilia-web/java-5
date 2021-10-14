public class lesson5_task4 {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 7, 8, -3, -2};
        int pos = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0) {
                pos+=arr[i];
            }
        }
        System.out.println(pos);
    }
}
