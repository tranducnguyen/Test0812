package bai1;


import java.lang.reflect.Array;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Nhập hai số A, B");
        System.out.print("a = ");
        Scanner sc = new Scanner(System.in);

        /*int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        taoMang2Chieu(a, b);*/


    }
    public static void taoMang2Chieu(int a, int b) {
        int[][] mangTmp = new int[a][b];

        for (int i = 0; i < a; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            System.out.print("[");

            for (int j = 0; j < b; j++) {
                mangTmp[i][j] = i * j;
                System.out.print(mangTmp[i][j]);
                if (j<b-1){
                    System.out.print(",");
                }

            }
            if (i< a-1){
                System.out.print("],\n");
            }

            if (i == a - 1) {
                System.out.print("]]");
            }
        }
    }


}
