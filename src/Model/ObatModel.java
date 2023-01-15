package Model;
import Abstraksi.ObatInterface;
import Entity.ObatEntity;

import java.util.ArrayList;

public class ObatModel implements ObatInterface{
    private ArrayList<ObatEntity> DataObat;
    public ArrayList<ObatEntity> getDataObat;

    public ObatModel() {
        DataObat = new ArrayList<>();
    }

    public ArrayList<ObatEntity> getDataObat(){
        return DataObat;
    }

    @Override
    public void view() {
    }

    @Override
    public void insert(Object x) {
        DataObat.add((ObatEntity) x);
    }

    @Override
    public void update(int index, Object x) {
        DataObat.set(index,(ObatEntity) x);
    }

    @Override
    public void delete(int index) {
        DataObat.remove(index);
    }

    public void get_where(String refnumber){
        DataObat.get(Integer.parseInt(refnumber));
    }

}
