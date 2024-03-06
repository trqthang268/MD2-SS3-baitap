import java.util.Arrays;

public class baitap01 {
    public static void main(String[] args) {
//      mảng ban đầu
        int[] arr = {1,2,3,4,5,6,7,8,9};
//      mảng mới
        int[] newArr = new int[arr.length-1];
//      phần tử muốn xóa
        int x = 7;
        for (int i = 0, k=0; i < arr.length; i++) {
            if (arr[i] != x ){
                newArr[k]=arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
