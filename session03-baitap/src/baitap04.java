import java.util.Scanner;

public class baitap04 {
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
        int vitrir = 0;
        int vitric = 0;
        int max = arr[0][0];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(max < arr[i][j]){
                    max=arr[i][j];
                    vitrir = i;
                    vitric = j;
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là :"+max);
        System.out.printf("Vị trí phần tử lớn nhất trong mảng là arr[%d][%d]",vitrir,vitric);
    }
}
