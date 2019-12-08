package homeWork;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        System.out.println("Nhap so: ");
        Scanner sc = new Scanner(System.in);
        int so = sc.nextInt();
        sumTest(so);
    }
    public static void sumTest (int a) {
        int so = a;
        int sum = 0;
        int tmp2 = 0;

        while( so > 0) {
            tmp2 = so%10;
            sum = sum + tmp2;
            so = so/10;
        }
        System.out.println("ket qua: "+ sum);
    }
}
