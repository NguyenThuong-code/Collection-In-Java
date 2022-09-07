package material.view;

import material.controller.MaterialManager;
import material.model.CrispyFlour;
import material.model.Material;
import material.model.Meat;
import java.time.LocalDate;
import java.util.LinkedList;

public class MainMaterial {

    public static LinkedList<Material> materialLinkedList= MaterialManager.materialLinkedList;
    public static void main(String[] args) {
//MaterialManager Mn= new MaterialManager();
//    Mn.addNewMaterial(new Meat("1","Beef", LocalDate.of(2022, 5, 12), 105, 6));
//    Mn.addNewMaterial(new Meat("6", "seafood", LocalDate.of(2022, 8, 10),145, 2));
//    Mn.addNewMaterial(new Meat("7", "chicken", LocalDate.of(2022, 8, 8),157, 5));
//    Mn.addNewMaterial(new Meat("8", "pork", LocalDate.of(2022, 8, 15),140, 8));
//    Mn.addNewMaterial(new Meat("9", "lamb", LocalDate.of(2022, 8, 11),160, 9));
//
//    Mn.addNewMaterial(new CrispyFlour("1", "Plain", LocalDate.of(2021, 12, 5), 230, 4));
//    Mn.addNewMaterial(new CrispyFlour("2","Rice", LocalDate.of(2021,9,5), 200, 3));
//    Mn.addNewMaterial(new CrispyFlour("3","Bread", LocalDate.of(2021,11,6), 240, 5));
//    Mn.addNewMaterial(new CrispyFlour("4","Baking", LocalDate.of(2022,2,9), 250, 7));
//    Mn.addNewMaterial(new CrispyFlour("5","Cornflour", LocalDate.of(2022,7,19), 245, 9));
//        Mn.addFlourMaterial();
        System.out.println(materialLinkedList);

//        for (Material st: materialLinkedList
//             ) {
//            System.out.println(st.toString());
//        }
//    }
//    Mn.addMeatMaterial();
//        Mn.deleteMaterial();
//    Mn.displayProduct();
//Mn.searchElementByName();
//        System.out.println();
//        Mn.sortFollowingIncreasingAm();
//        System.out.println();
//        Mn.sortFollowingDecreasingAm();
    }
}
