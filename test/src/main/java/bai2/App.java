package bai2;


import jdk.nashorn.internal.ir.IfNode;

import java.sql.SQLException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws SQLException {
        XuLy xlc = new XuLy();
        int flagStop = 1;
        Scanner sc = new Scanner(System.in);
        int choice;/*
        String maNhanVien;
        String tenNhanVien;
        NhanVien nvTmp;*/

        System.out.println("Menu chức năng ");
        while (flagStop == 1) {
            xlc.inMenu();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Thoát");
                    System.exit(0);
                case 1:
                    System.out.print("Nhập mã nhân viên: ");
                    maNhanVien = sc.nextLine();
                    System.out.print("Nhập tên nhân viên: ");
                    tenNhanVien = sc.nextLine();
                    nvTmp = new NhanVien(maNhanVien, tenNhanVien);
                    xlc.themNhanVienMoi(nvTmp);
                    break;
                case 2:
                    System.out.print("Nhập mã nhân viên: ");
                    maNhanVien = sc.nextLine();
                    xlc.hienThiNhanVien(maNhanVien);
                    break;
                case 3:
                    System.out.print("Nhập mã nhân viên: ");
                    maNhanVien = sc.nextLine();
                    xlc.xoaNhanVien(maNhanVien);
                    break;
                case 4:
                    System.out.print("Nhập mã nhân viên: ");
                    maNhanVien = sc.nextLine();
                    System.out.print("Nhập tên nhân viên sửa: ");
                    tenNhanVien = sc.nextLine();
                    xlc.suaNhanVien(maNhanVien,tenNhanVien);
                    break;
            }
            System.out.println("Nhập 1 để tiếp tục, nhập 0 để thoát.");
            if (sc.nextInt() == 0) {
                System.exit(0);
            }
        }

    }
}
