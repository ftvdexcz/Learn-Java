package Q6;

public class GiaoDichVang extends GiaoDich implements TinhGia{
    private int loaiVang;

    public GiaoDichVang() {
    }

    public GiaoDichVang(String ma, String ngayGiaoDich, double gia, int soLuong, int loaiVang) {
        super(ma, ngayGiaoDich, gia, soLuong);
        this.loaiVang = loaiVang;
    }

    public int getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(int loaiVang) {
        this.loaiVang = loaiVang;
    }
    
    @Override
    public String toString(){
        return getMa() + "\t" + getNgayGiaoDich() + "\t" + getGia() + "\t" + getSoLuong() + "\t" + loaiVang;
    }

    @Override
    public double getGia() {
        return getSoLuong()*super.getGia();
    }
}
