package Controller;

import Entity.ObatEntity;
import Model.ObatModel;
import View.AllObjController;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class ControllerObat {
    public ObatModel obt =new ObatModel();

    public ControllerObat(){
    }

    public ArrayList<ObatEntity> view(){
        return obt.getDataObat();
    }

    public void insert(String namaobat,String jenisobat,String harga,String refnumber) {
        ObatEntity obaat = new ObatEntity();
        obaat.setNamaobat(namaobat);
        obaat.setJenisobat(jenisobat);
        obaat.setHarga(harga);
        obaat.setRefnumber(refnumber);
        obt.insert(obaat);
    }

    public void delete(int index)
    {
        obt.delete(index);
    }

    public void update(int index,String namaobat,String jenisobat,String harga,String refnumber) {

        ObatEntity obaat = new ObatEntity();
        obaat.setNamaobat(namaobat);
        obaat.setJenisobat(jenisobat);
        obaat.setHarga(harga);
        obaat.setRefnumber(refnumber);
        obt.update(index,obaat);
    }

    public DefaultTableModel listobat(){
        DefaultTableModel dtmlistobat = new DefaultTableModel();
        Object[] kolom ={" Nama Obat"," Jenis Obat", " Harga"," RefNumber"};
        dtmlistobat.setColumnIdentifiers(kolom);
        int size = AllObjController.obat.view().size();
        for(int i=0; i<size; i++){
            Object [] obat = new Object[5];
            obat[0] = AllObjController.obat.view().get(i).getNamaobat();
            obat[1] = AllObjController.obat.view().get(i).getJenisobat();
            obat[2] = AllObjController.obat.view().get(i).getHarga();
            obat[3] = AllObjController.obat.view().get(i).getRefnumber();
            dtmlistobat.addRow(obat);
        }
        return  dtmlistobat;
    }

    public int cekObat(String refnumber){
        int keterangan = -1;
        if(obt.getDataObat().size()>0){
            for(int i=0;i<obt.getDataObat().size();i++){
                if(refnumber.equals(obt.getDataObat().get(i).getRefnumber())){
                    keterangan = i;
                    break;
                }
                else{
                    keterangan = -1;
                }
            }
        }
        return keterangan;
    }

    public ObatEntity showDataObat (int refnumber){
        return obt.getDataObat().get(refnumber);
    }

}
