package decisionMaking;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        // Cho người dùng chọn một món ăn trong danh sách món ăn
        System.out.println("1. Cơm canh chua");
        System.out.println("2. Cá chiên sả ớt");
        System.out.println("3. Mì xào bò");
        System.out.println("4. Phở");
        System.out.println("5. Thịt kho trứng");
        System.out.println("6. Hủ tiếu nam vang");

        // Người dùng nhập số theo menu để chọn món ăn
        Scanner sc = new Scanner(System.in);

        System.out.println("Vui lòng nhập số tương ứng với menu");
        int i = sc.nextInt();

        System.out.println("Vui lòng nhập số lượng của món ăn");
        int soluong = sc.nextInt();

        switch (i){
            case 1:
                System.out.println("cần order cơm canh chua số lượng" + soluong);
                break;
            case 2:
                System.out.println("cần order Cá chiên sả ớt" + soluong);
                break;
            case 3:
                System.out.println("cần order Mì xào bò" + soluong);
                break;
            case 4:
                System.out.println("cần order Phở" + soluong);
                break;
            case 5:
                System.out.println("cần order Thịt kho trứng" + soluong);
                break;
            case 6:
                System.out.println("cần order Hủ tiếu nam vang" + soluong);
                break;
            default:
                System.out.println("Người dùng cần nhập đúng số tương ứng trong menu");
        }
    }
}
