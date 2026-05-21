package org.ar.utn.dds.calculosubscripcion;

public class CommercialPlan extends Plan {
    final private double additionalPerDevice;

    public CommercialPlan(double baseFixedRate,double additionalPerDevice) {
        super(baseFixedRate);
        this.additionalPerDevice = additionalPerDevice;
    }

    private double additional(int deviceCount){
        return additionalPerDevice*deviceCount;
    }

    @Override
    public double calculatePrice(int deviceCount){
        return additional(deviceCount) + baseFixedRate;
    }

}
