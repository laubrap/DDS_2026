package org.ar.utn.dds.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Client {
    private String name;
    private String address;
    private String contactNumber;
    private Plan plan;
    private List<String> inUseDevices;

    public Client(String name, String address, String contactNumber, Plan plan) {
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.plan = plan;
        this.inUseDevices = new ArrayList<>();
    }

    public Client(String name, String address, String contactNumber, Plan plan, List<String> inUseDevices) {
        this(name, address, contactNumber,plan);
        this.inUseDevices = new ArrayList<>(inUseDevices); //maneja el caso de si viene vacia o no
    }

    public double calculatePrice(){
        return plan.calculatePrice(inUseDevices.size());
    }
}
