package bai2;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.sql.Connection;
import java.sql.SQLException;

public interface IXuLy {
    public void themNhanVienMoi(NhanVien nvmoi);
    public void inMenu();
//    public Connection getConnection();
    public void hienThiNhanVien(String maNhanVien);
    public void xoaNhanVien(String maNhanVien);
    public void suaNhanVien(String maNhanVien, String tenNhanVienMoi);
}
