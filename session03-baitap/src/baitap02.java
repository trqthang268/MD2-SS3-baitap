import java.util.Arrays;

public class baitap02 {
    public static void main(String[] args) {
//        mảng ban đầu
        int[] arr = {1,2,3,4,5,6,7,9};
//        phần tử muốn thêm
        int x = 8;
//        mảng mới
        int[] newArr = new int[arr.length+1];

        for (int i = 0,k=0; i < newArr.length; i++) {
            if (i == 7) {
                newArr[i] = x;
            }else {
                newArr[i]=arr[k];
                k++;
            }
        }
        System.out.println("Mảng cũ là: "+Arrays.toString(arr));
        System.out.println("Mảng mới là: "+Arrays.toString(newArr));
    }
}
