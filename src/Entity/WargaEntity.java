package Entity;

public class WargaEntity {
    protected String nama,id;

    public WargaEntity(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public WargaEntity() {

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
