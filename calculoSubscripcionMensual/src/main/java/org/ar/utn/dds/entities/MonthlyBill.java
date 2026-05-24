package org.ar.utn.dds.entities;

public class MonthlyBill {
    public double calculateAmount(Client client){
        return client.calculatePrice();
    }
}
