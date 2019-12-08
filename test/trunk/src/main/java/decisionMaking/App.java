package decisionMaking;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /*Xếp loại học sinh
        Nếu điểm số < 5 => Không đạt
        Nếu điểm số > 5 => đạt
        */

        double diemSo = 0;
        System.out.println("Vui long nhap diem so: ");

        //Cho nguoi dung nhap diem tu man hinh
        Scanner sc = new Scanner(System.in);
        diemSo = sc.nextDouble();

        // Decision making
        if (diemSo < 5 || diemSo == 5) {
            System.out.println("Xep loai khong dat");
        }else if (diemSo > 5) {
            System.out.println("Xep loai dat");
        }else {
            System.out.println("Du lieu khong hop le");
        }


    }
}
