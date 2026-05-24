package org.ar.utn.dds.entities;

public class CorporativePlan extends Plan {
    private final double discountPercentage;

    public CorporativePlan(double baseFixedRate, double discountPercentage) {
        super(baseFixedRate);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculatePrice(int deviceCount){
        return baseFixedRate * (1-(discountPercentage/100));
    }

}
