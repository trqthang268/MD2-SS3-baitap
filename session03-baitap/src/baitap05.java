import java.util.Scanner;

public class baitap05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
                System.out.printf("Giá trị của arr[%d] là:", i);
                arr[i] = Integer.parseInt(scanner.nextLine());
        };
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: "+min);
    }
}
