package Entity;

public class ObatEntity {
    private String namaobat,jenisobat,harga,refnumber;

    public ObatEntity(String namaobat, String jenisobat, String harga, String refnumber) {
        this.namaobat = namaobat;
        this.jenisobat = jenisobat;
        this.harga = harga;
        this.refnumber = refnumber;
    }

    public ObatEntity(){}

    public String getNamaobat() {
        return namaobat;
    }

    public void setNamaobat(String namaobat) {
        this.namaobat = namaobat;
    }

    public String getJenisobat() {
        return jenisobat;
    }

    public void setJenisobat(String jenisobat) {
        this.jenisobat = jenisobat;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getRefnumber() {
        return refnumber;
    }

    public void setRefnumber(String refnumber) {
        this.refnumber = refnumber;
    }
}
