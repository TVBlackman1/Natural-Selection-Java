package com.company.logic;

import java.util.ArrayList;

interface IRange {
    double calculate(SimulationObject a, SimulationObject b);
}

public abstract class Bacteria extends SimulationObject {
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
    protected void init() {
        super.init();
        setTargetType();
    }

    @Override
    protected abstract void setType();

    @Override
    protected void setSizes() {
        width = 20;
        height = 20;
    }

    protected abstract void setTargetType();

    @Override
    void update() {
        SimulationObject concreteTarget = findNearestTarget();
        if(concreteTarget != null) {
            goTo(concreteTarget.x, concreteTarget.y);
            tryEat();
        }
    }

    SimulationObject findNearestTarget() {
        IRange range = (a, b) -> Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));

        LogicalNamespace logicalNamespace = LogicalNamespace.getInstance();
        ArrayList<SimulationObject> targetList = logicalNamespace.getList(targetType);

        if(targetList.size() == 0)
            return null;

        SimulationObject identity = targetList.get(0);

        SimulationObject nearestTarget = targetList.stream().reduce(identity, (nearest, current) -> {
            if(range.calculate(this, current) < range.calculate(this, nearest)) {
                return current;
            }
            return nearest;
        });

        if(range.calculate(this, nearestTarget) > senseRange)
            return null;

        return nearestTarget;
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
