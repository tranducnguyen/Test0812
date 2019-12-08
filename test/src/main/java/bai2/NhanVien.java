package bai2;

public class NhanVien {
    private String maNhanVien;
    private String tenNhanVien;

    NhanVien(String maNhanVien, String tenNhanVien){
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
    }
    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }
}
