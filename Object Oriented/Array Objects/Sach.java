package arrayObj;

public class Sach extends TaiLieu{
    private int soTrang;

    public Sach() {
    }

    public Sach(int ma, String ten, String tacGia, double gia, int soTrang) {
        super(ma, ten, tacGia, gia);
        this.soTrang = soTrang;
    }
    
    @Override
    public double getGia(){
        if(soTrang>500) 
            return super.getGia()*0.9;
        else
            return super.getGia();
    }
    
    @Override
    public String toString(){
        return getMa() + "\t" + getTen() + "\t" + getTacGia() + "\t" + getGia() + "\t" + soTrang; 
    }
}
