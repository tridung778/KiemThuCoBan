package polypro.model;

/**
 *
 * @author Tri Dung
 */
public class HocVien {

    public int maHV;
    public int maKH;
    public String maNH;

    public HocVien() {
    }

    public int getMaHV() {
        return maHV;
    }

    public void setMaHV(int maHV) {
        this.maHV = maHV;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getMaNH() {
        return maNH;
    }

    public void setMaNH(String maNH) {
        this.maNH = maNH;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public HocVien(int maHV, int maKH, String maNH) {
        this.maHV = maHV;
        this.maKH = maKH;
        this.maNH = maNH;
    }
    public double diem = -1.0;

    @Override
    public String toString() {
        return this.toString();
    }

}
