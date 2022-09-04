package br.com.billingapp.classes;

public class Tenant {

    public int id;
    private String name;
    private double rent;
    private int numberPeopleLiving;
    private Month moth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /* public double getMonthlyEnergyBill(Month month){
       double eBill = moth.getEnergyBill()

    } */
}
