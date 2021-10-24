package Q1;

public class IntlPhoneNumber extends PhoneNumber{
    private int maQuocGia;

    public IntlPhoneNumber() {
    }

    public IntlPhoneNumber(int maVung, int noiVung, int maQuocGia) {
        super(maVung, noiVung);
        this.maQuocGia = maQuocGia;
    }

    public int getMaQuocGia() {
        return maQuocGia;
    }

    public void setMaQuocGia(int maQuocGia) {
        this.maQuocGia = maQuocGia;
    }

    @Override
    public String toString(){
        return maQuocGia + "-" + super.getMaVung() + "-" + super.getNoiVung();
    } 
}
