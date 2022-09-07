package material.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Meat extends Material implements Discount, Serializable {
    private double weight;

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        double price = getWeight() * getCost();
        return price;
    }

    @Override
    public LocalDate getExpiryDate() {
        LocalDate a = getManufacturingDate();
        LocalDate limitDay = a.plusDays(7);
        return limitDay;
    }

    @Override
    public double getRealMoney() {
        return 0;
    }

    @Override
    public String toString() {
        return "Meat{" +
                super.toString() +
                ", weight=" + weight +
                '}';
    }


}

