package Head_First_OOAD;

import java.util.ArrayList;
import java.util.List;

public class Inventry {
    private ArrayList<Guitar> guitars;
    public Inventry(){
        guitars = new ArrayList<>();
    }
    public void addGuitar(String serialNumber,double price,String builder,String model,String type,String backWood,String topWood){
     Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(guitar);
    }
    public Guitar getGuitar(String serialNUmber){
        for (Guitar guitar : guitars) {
            if (guitar.getserialNumber()==serialNUmber){
                return Guitar;
            }
        }
        return null;
    }
    
}
