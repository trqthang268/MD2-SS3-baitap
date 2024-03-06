import java.util.Scanner;

public class baitap07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số hàng của mảng");
        int r = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột của mảng");
        int c = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Giá trị của arr[%d}[%d] là:", i, j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        int sum = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(i==j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo chính là: "+sum);
    }
}
