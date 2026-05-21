package org.ar.utn.dds.calculosubscripcion;

public class HomePlan extends Plan {

    public HomePlan(double baseFixedRate) {
        super(baseFixedRate);
    }

    @Override
    public double calculatePrice(int deviceCount) {
        return this.baseFixedRate;
    }
}
