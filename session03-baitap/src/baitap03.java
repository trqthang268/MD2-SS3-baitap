import java.util.Arrays;

public class baitap03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] brr = {5,6,7,8};
        int[] newArr = new int[arr.length+ brr.length];
        for (int i = 0,j=0,k=4; i < arr.length; i++) {
            newArr[j]=arr[i];
            newArr[k]=brr[i];
            j++;
            k++;
        }
        System.out.println("Mảng mới là: "+ Arrays.toString(newArr));
    }
}
