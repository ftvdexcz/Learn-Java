package Q6;

public class GiaoDich {
    private String ma;
    private String ngayGiaoDich;
    private double gia;
    private int soLuong;

    public GiaoDich() {
    }

    public GiaoDich(String ma, String ngayGiaoDich, double gia, int soLuong) {
        this.ma = ma;
        this.ngayGiaoDich = ngayGiaoDich;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    public int getNgay(){
        String[] time = ngayGiaoDich.split("/");
        return Integer.parseInt(time[0]);
    }

}
