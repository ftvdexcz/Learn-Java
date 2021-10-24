package Q2;

public class PTGT {
    private String ma;
    private String hangSX;
    private int namSX;
    private double gia;
    private String mau;

    public PTGT() {
    }

    public PTGT(String ma, String hangSX, int namSX, double gia, String mau) {
        this.ma = ma;
        this.hangSX = hangSX;
        this.namSX = namSX;
        this.gia = gia;
        this.mau = mau;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }
    
}
