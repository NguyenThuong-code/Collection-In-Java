package material.controller;

import material.model.CrispyFlour;
import material.model.Discount;
import material.model.Material;
import material.model.Meat;
import material.storage.ReadWriteFile;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class MaterialManager  {
    public static LinkedList<Material> materialLinkedList ;
    static {
        materialLinkedList = ReadWriteFile.readFile();
    }
    public void addNewMaterial(Material material){
        materialLinkedList.add(material);
        ReadWriteFile.writeFile(materialLinkedList);
    }
    //Display all products in linkedList
//    public void displayProduct(){
//        for (Material st: materialLinkedList
//             ) {
//            System.out.println(st.toString());
//        }
//    }

    //Add product into linkedList
    public void addFlourMaterial(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id Flour:");
        String id = sc.nextLine();
        System.out.println("Enter name flour: ");
        String name = sc.nextLine();
        System.out.println("Enter the date manufacturing");
        System.out.println("year");
        int y = sc.nextInt();
        System.out.println("month");
        int m = sc.nextInt();
        System.out.println("day");
        int d = sc.nextInt();
        LocalDate manufacturingDate = LocalDate.of(y, m, d);
        System.out.println("Enter cost:");
        int cost = sc.nextInt();
        System.out.println("Enter the quantity:");
        int quantity = sc.nextInt();
        CrispyFlour crispyFlour = new CrispyFlour(id, name, manufacturingDate, cost, quantity);
        materialLinkedList.add(crispyFlour);
        ReadWriteFile.writeFile(materialLinkedList);
    }
    public void addMeatMaterial(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id meat:");
        String id = sc.nextLine();
        System.out.println("Enter name meat: ");
        String name = sc.nextLine();
        System.out.println("Enter the date manufacturing");
        System.out.println("year");
        int y = sc.nextInt();
        System.out.println("month");
        int m = sc.nextInt();
        System.out.println("day");
        int d = sc.nextInt();
        LocalDate manufacturingDate = LocalDate.of(y, m, d);
        System.out.println("Enter cost:");
        int cost = sc.nextInt();
        System.out.println("Enter the weight:");
        double weight = sc.nextDouble();
        Meat meat = new Meat(id, name, manufacturingDate, cost, weight);
        materialLinkedList.add(meat);
    }
    //remove Material in LinkedList
    public void deleteMaterial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position that u want to remove!");
        String pos = sc.nextLine();
        for (int i = 0; i < materialLinkedList.size(); i++) {
            Material material= materialLinkedList.get(i);
            if (material.getId().equals(pos)) {
                materialLinkedList.remove(material);
            }
        }
    }
    //Search product by name
    public void searchElementByName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product that u want to find!");
        String name = sc.nextLine();
        for (int i = 0; i < materialLinkedList.size(); i++) {
            Material material = materialLinkedList.get(i);
            if (material.getName().equalsIgnoreCase(name)) {
                System.out.println(materialLinkedList.get(i));
            }else {
                System.out.println("The product was not founds");
            }
        }
    }
//Sort product following to increasing
    public void sortFollowingIncreasingAm() {
        AmountComparator comparator=new AmountComparator();
        Collections.sort(materialLinkedList,comparator);
        for (Material st: materialLinkedList
             ) {
            System.out.println(st.toString());
        }
        }
    //Sort product following to increasing
    public void sortFollowingDecreasingAm() {
        AmountComparator comparator=new AmountComparator();
        Collections.sort(materialLinkedList,comparator.reversed());
        for (Material st: materialLinkedList
        ) {
            System.out.println(st.toString());
        }
    }

    //Calculate after discount
    public double getRealMoney(){
        double total=0;
        for (int i=0; i<materialLinkedList.size();i++){
            if(materialLinkedList.get(i) instanceof Discount){
                Discount discount=(Discount) materialLinkedList.get(i);
                total+=discount.getRealMoney();
            }
        }
        return total;
    }
    public double getTotalMoney(){
        double total=0;
        for (int i=0;i<materialLinkedList.size();i++){
            total+=materialLinkedList.get(i).getAmount();
        }
        return total;
    }
    public double getDifference(){
        double difference=getTotalMoney()-getRealMoney();
        return difference;

    }

}
