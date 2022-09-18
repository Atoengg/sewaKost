package sewa;

public class penyewa {
    private String nama;
    private String nohp;
    private String alamat;
    private String email;

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setNohp(String nohp) {
        this.nohp = nohp;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getNohp() {
        return nohp;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getEmail() {
        return email;
    }
}
