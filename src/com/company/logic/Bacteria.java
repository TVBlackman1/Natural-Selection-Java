package com.company.logic;

public class Bacteria extends SimulationObject {
    double speed = 2;
    double senseRange = 20;

    double timeWithoutFood = 0;
    double maxTimeWithoutFood = 200;
    double livingTime = 0;
    double maxLivingTime = 20;

    SimulationObjectType targetType;

    Bacteria() {
    }

    @Override
    protected void setType() {

    }

    @Override
    protected void setSizes() {
        width = 10;
        height = 10;
    }

    @Override
    void update() {

    }

    void findNearestTarget() {

    }

    void exploreTerrain() {

    }

    void goTo(double x, double y) {

    }

    void tryEat() {

    }

    void move(double x, double y) {

    }

    void shift(double dx, double dy) {

    }

    void giveBirthNewBacteria() {

    }

    void mutate() {

    }
}
