package org.ar.utn.dds.calculosubscripcion;

public abstract class Plan {
    final protected double baseFixedRate;

    public Plan(double baseFixedRate) {
        this.baseFixedRate = baseFixedRate;
    }

    abstract public double calculatePrice(int deviceCount);
}

