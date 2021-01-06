package com.company.logic;

public class BacteriaRed extends Bacteria{
    BacteriaRed() {

    }

    @Override
    protected void setType() {
        type = SimulationObjectType.BACTERIA_RED;
    }

    @Override
    protected void setTargetType() {
        targetType = SimulationObjectType.FOOD;
    }
}
