package br.com.billingapp.classes;

import java.util.List;

public class RealEstate {

    private int id;
    private Address address;
    List<Tenant> tenants;

    public RealEstate(int id, Address address, List<Tenant> tenants) {
        this.id = id;
        this.address = address;
        this.tenants = tenants;
    }
}
