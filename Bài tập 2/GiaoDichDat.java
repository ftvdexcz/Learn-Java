package Q6;

/**
 *
 * @author NC
 */
public class GiaoDichDat extends GiaoDich implements TinhGia{
    private int loaiDat;

    public GiaoDichDat() {
    }

    public GiaoDichDat(String ma, String ngayGiaoDich, double gia, int soLuong, int loaiDat) {
        super(ma, ngayGiaoDich, gia, soLuong);
        this.loaiDat = loaiDat;
    }

    public int getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(int loaiDat) {
        this.loaiDat = loaiDat;
    }

    @Override
    public String toString() {
        return getMa() + "\t" + getNgayGiaoDich() + "\t" + getGia() + "\t" + getSoLuong() + "\t" + loaiDat;
    }

    @Override
    public double getGia() {
        int heSo;
        if(loaiDat == 1) heSo = 200;
        else if(loaiDat == 2) heSo = 400;
        else heSo = 800;
        
        return super.getGia()*getSoLuong()*heSo;
    }
    
    
}
