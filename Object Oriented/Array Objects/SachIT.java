package arrayObj;

public class SachIT extends TaiLieu{
    private boolean dia;

    public SachIT() {
        // Ngầm định gọi hàm khởi tạo mặc định của lớp cha, nếu lớp cha chưa có hàm 
        // khởi tạo mặc định thì sẽ lỗi 
    }

    public SachIT(int ma, String ten, String tacGia, double gia, boolean dia) {
        super(ma, ten, tacGia, gia);
        this.dia = dia;
    }

    public boolean isDia() {
        return dia;
    }

    public void setDia(boolean dia) {
        this.dia = dia;
    }
    
    @Override
    public double getGia(){
        if(dia) return super.getGia()+20000;
        else 
            return super.getGia();
    }
    
    @Override
    public String toString(){
        return getMa() + "\t" + getTen() + "\t" + getTacGia() + "\t" + getGia() + "\t" + (dia?"Co dia":"Khong dia");
    }
}
