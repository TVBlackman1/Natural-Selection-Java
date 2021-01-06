package com.company.logic;

public abstract class SimulationObject implements IEatable {
    double x;
    double y;
    double width;
    double height;
//    double listOfObjects;
    SimulationObjectType type;

    SimulationObject() {
        this(0, 0);
    }

    SimulationObject(double x, double y) {
        this.x = x;
        this.y = y;

        setType();
        setSizes();
        LogicalNamespace.getInstance().getList(type).add(this);
    }

    protected abstract void setType();
    protected abstract void setSizes();

    abstract void update();

    void delete() {

    }
}
