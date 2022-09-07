package material.model;


import java.io.Serializable;
import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount, Serializable {
    private int quantity;


    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        double price = getQuantity() * getCost();
        return price;
    }

    @Override
    public LocalDate getExpiryDate() {
        return null;
    }

    @Override
    public double getRealMoney() {
        return 0;
    }

    @Override
    public String toString() {
        return "CrispyFlour{" +
                super.toString() +
                ", quantity=" + quantity +
                '}';
    }




}
