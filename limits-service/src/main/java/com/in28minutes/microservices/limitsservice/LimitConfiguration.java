package com.in28minutes.microservices.limitsservice;

public class LimitConfiguration {
    private int minimum;
    private int maximm;

    protected LimitConfiguration() {

    }

    public LimitConfiguration(int minimum, int maximm) {
        super();
        this.minimum = minimum;
        this.maximm = maximm;
    }


    public int getMaximm() {
        return maximm;
    }

    public int getMinimum() {
        return minimum;
    }
}
