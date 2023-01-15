package Controller;

import Entity.PetugasEntity;
import Model.PetugasModel;
import View.AllObjController;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class ControllerPetugas {
    public PetugasModel petugass = new PetugasModel();
    int loginpetugas = 0;

    public ControllerPetugas() {
    }

    public ArrayList<PetugasEntity> view() {
        return petugass.getDataPetugas();
    }

    public void insert(String nama, String id) {
        PetugasEntity ptug = new PetugasEntity();
        ptug.setNama(nama);
        ptug.setId(id);
        petugass.insert(ptug);
    }

    public void delete(int index)
    {
        petugass.delete(index);
    }

    public void dataPetugas() {
        String user [] = {"desy"};
        String psw [] = {"111"};
        String nama[] = {"desy"};
        String id[] = {"1230"};

        for(int i = 0; i<user.length; i++){
            petugass.insert(new PetugasEntity(user[i],psw[i],nama[i],id[i]));
        }
    }
    public DefaultTableModel listpetugas(){
        DefaultTableModel dtmlistpetugas = new DefaultTableModel();
        Object[] kolom ={" ID"," Nama Petugas "};
        dtmlistpetugas.setColumnIdentifiers(kolom);
        int size = AllObjController.petugas.view().size();
        for(int i=0; i<size; i++){
            Object [] obat = new Object[5];
            obat[0] = AllObjController.petugas.view().get(i).getId();
            obat[1] = AllObjController.petugas.view().get(i).getNama();
            dtmlistpetugas.addRow(obat);
        }
        return  dtmlistpetugas;
    }

    public void cekPetugas(String user, String psw) {
        loginpetugas = petugass.cekPetugas(user,psw);
    }

    public PetugasEntity petugasEntity(){
        return petugass.showDataPetugas(loginpetugas);
    }

}
