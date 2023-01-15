package Model;
import Abstraksi.PetugasInterface;
import Entity.PetugasEntity;

import java.util.ArrayList;

public class PetugasModel implements PetugasInterface{

    private ArrayList<PetugasEntity> DataPetugas;

    public PetugasModel() {
        DataPetugas = new ArrayList<>();
    }

    public ArrayList<PetugasEntity> getDataPetugas(){
        return DataPetugas;
    }

    public int cekPetugas(String user, String psw){
        int loop = 0;
        for(PetugasEntity petugasEntity : getDataPetugas()){
            if(petugasEntity.getUser().equals(user) && petugasEntity.getPsw().equals(psw)){
                break;
            }else{
                loop++;
            }
        }
        return loop;
    };

    public PetugasEntity showDataPetugas(int index){
        return DataPetugas.get(index);
    }

    @Override
    public void view() {

    }

    @Override
    public void insert(Object x) {
        DataPetugas.add((PetugasEntity) x);
    }

    @Override
    public void delete(int index) {
        DataPetugas.remove(index);
    }
}
