package material.controller;

import material.model.Material;

import java.util.Comparator;

public class AmountComparator implements Comparator<Material> {
    @Override
    public int compare(Material o1, Material o2) {
       if (o1.getAmount()>o2.getAmount()){
           return 1;
       }else if (o1.getAmount()==o2.getAmount()){
           return 0;
       }else{
           return -1;
       }
    }
}
