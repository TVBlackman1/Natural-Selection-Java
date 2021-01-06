package com.company.logic;

public class BacteriaRed extends Bacteria{
    BacteriaRed() {
        type = SimulationObjectType.BACTERIA_GREEN;
        targetType = SimulationObjectType.FOOD;
    }
}
