package org.ar.utn.dds.entities;

public abstract class Plan {
    final protected double baseFixedRate;

    public Plan(double baseFixedRate) {
        this.baseFixedRate = baseFixedRate;
    }

    abstract public double calculatePrice(int deviceCount);
}

