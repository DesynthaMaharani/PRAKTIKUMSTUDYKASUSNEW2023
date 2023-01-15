package Entity;

public class PetugasEntity extends WargaEntity{
    private String user,psw;

    public PetugasEntity(String user, String psw, String nama, String id) {
        super(nama,id);
        this.user=user;
        this.psw= psw;
    }

    public PetugasEntity() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    @Override
    public String getNama(){
        return nama;
    }
    @Override
    public String getId(){
        return id;
    }
}
