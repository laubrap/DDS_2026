package org.ar.utn.dds.calculosubscripcion;

public class MonthlyBill {
    public double calculateAmount(Client client){
        return client.calculatePrice();
    }
}
