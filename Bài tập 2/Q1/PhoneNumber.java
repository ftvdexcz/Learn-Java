package Q1;

public class PhoneNumber {
    // sdt có dạng: 0maVung-noiVung
    private int maVung; // mã vùng 
    private int noiVung; // sdt nội vùng 

    public PhoneNumber() {
    }

    public PhoneNumber(int maVung, int noiVung) {
        this.maVung = maVung;
        this.noiVung = noiVung;
    }

    public int getMaVung() {
        return maVung;
    }

    public void setMaVung(int maVung) {
        this.maVung = maVung;
    }

    public int getNoiVung() {
        return noiVung;
    }

    public void setNoiVung(int noiVung) {
        this.noiVung = noiVung;
    }
    
    @Override
    public String toString(){
        return "0" + maVung + "-" + noiVung;
    }
}
