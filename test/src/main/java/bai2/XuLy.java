package bai2;


import java.nio.file.FileSystemNotFoundException;
import java.sql.*;

public class XuLy {
    public void themNhanVienMoi(NhanVien nvMoi) throws SQLException {
        if (isExist(nvMoi.getMaNhanVien())) {
            System.out.println("Đã tồn tại mã "+ nvMoi.getMaNhanVien());
        }else{
            Connection cnn = getConnection();
            Statement statement = cnn.createStatement();
            String strSQL = "INSERT INTO NHAN_VIEN VALUES ('" + nvMoi.getMaNhanVien() + "','" + nvMoi.getTenNhanVien() + "')";
            int row = statement.executeUpdate(strSQL);
            if (row == 1) {
                System.out.println("Thành công");
            }
            cnn.close();
        }
    }
    private boolean isExist(String maNhanVien){
        boolean check = false;
        try{
            Connection cnn = getConnection();
            String strSQL = "SELECT COUNT(*) as dem FROM NHAN_VIEN WHERE MA_NHAN_VIEN ='" + maNhanVien + "'";
            Statement statement = cnn.createStatement();
            ResultSet rs = statement.executeQuery(strSQL);
            int test=0;
            while (rs.next()){
                test=Integer.parseInt(rs.getString(1).toString());
            }
            System.out.println("test " +test);
            if (test >= 1){
                check = true;
            }
            cnn.close();
        }catch (Exception e){

        }
        return check;
    }
    public void inMenu() {

        System.out.println("0. Thoát.");
        System.out.println("1. Thêm một nhân viên mới.");
        System.out.println("2. Hiển thị một nhân viên theo mã nhân viên.");
        System.out.println("3. Xóa một nhân viên khỏi CSDL theo mã nhân viên.");
        System.out.println("4. Sửa tên một nhân viên theo mã nhân viên.");
    }

    private Connection getConnection() throws SQLException {
        String hostName = "localhost";
        String sid = "orcl";
        String username = "SYSTEM";
        String password = "123456";
        String connectionURL = "jdbc:oracle:thin:@" + hostName + ":1521:" + sid;
        Connection conn = DriverManager.getConnection(connectionURL, username, password);
        return conn;
    }

    public void hienThiNhanVien(String maNhanVien) throws SQLException {
        if (isExist(maNhanVien)) {
            Connection cnn = getConnection();
            String strSQL = "SELECT * FROM NHAN_VIEN WHERE MA_NHAN_VIEN ='" + maNhanVien + "'";
            Statement statement = cnn.createStatement();
            ResultSet rs = statement.executeQuery(strSQL);
            System.out.println("Nhân viên: ");
            System.out.println("Mã nhân viên: " + rs.getString(1));
            System.out.println("Tên nhân viên: " + rs.getString(2));
            cnn.close();
        } else {
            System.out.println("Không chứa nhân viên có mã " + maNhanVien);
        }

    }

    public void xoaNhanVien(String maNhanVien) throws SQLException {
        if (isExist(maNhanVien)){
            Connection cnn = getConnection();
            String strSQL = "DELETE FROM NHAN_VIEN WHERE MA_NHAN_VIEN ='" + maNhanVien + "'";
            Statement statement = cnn.createStatement();
            int rs = statement.executeUpdate(strSQL);
            if (rs == 1) {
                System.out.println("Đã xóa nhân viên mã " + maNhanVien);
            }
            cnn.close();
        } else {
            System.out.println("Không có nhân viên mã " + maNhanVien + " trong cơ sở dữ liệu!");
        }

    }

    public void suaNhanVien(String maNhanVien, String tenNhanVienMoi) throws SQLException {
        if(isExist(maNhanVien)){
            Connection cnn = getConnection();
            String strSQL = "UPDATE NHAN_VIEN SET TEN_NHAN_VIEN ='" + tenNhanVienMoi + "' WHERE MA_NHAN_VIEN ='" + maNhanVien + "'";
            Statement statement = cnn.createStatement();
            int rs = statement.executeUpdate(strSQL);
            if (rs == 1) {
                System.out.println("Đã sửa nhân viên mã " + maNhanVien);
            }
            cnn.close();
        }else {
            System.out.println("Không có nhân viên mã " + maNhanVien + " trong cơ sở dữ liệu!");
        }



    }
}
