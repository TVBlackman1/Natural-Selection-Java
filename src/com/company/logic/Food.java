package com.company.logic;

public class Food extends SimulationObject{
    public Food() {
        super();
    }

    @Override
    protected void setType() {
        type = SimulationObjectType.FOOD;
    }

    @Override
    protected void setSizes() {
        width = 10;
        height = 10;
    }

    @Override
    void update() {

    }
}
