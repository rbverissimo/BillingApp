package br.com.billingapp.classes;

public class Month {
    private String name;
    private double energyBill;
    private double waterBill;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEnergyBill() {
        return energyBill;
    }

    public void setEnergyBill(double energyBill) {
        this.energyBill = energyBill;
    }

    public double getWaterBill() {
        return waterBill;
    }

    public void setWaterBill(double waterBill) {
        this.waterBill = waterBill;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
