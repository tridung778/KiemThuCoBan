package polypro.model;

/**
 *
 * @author Tri Dung
 */
public class NhanVien {

    public String maNV;
    public String matKhau;
    public String hoTen;
    public String Email;
    public boolean vaiTro;

    public NhanVien() {
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public boolean isVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

    public NhanVien(String maNV, String matKhau, String hoTen, String Email, boolean vaiTro) {
        this.maNV = maNV;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.Email = Email;
        this.vaiTro = vaiTro;
    }
    
    @Override
    public String toString() {
        return this.maNV;
    }

   
}
