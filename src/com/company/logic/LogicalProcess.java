package com.company.logic;

import java.util.ArrayList;

public class LogicalProcess implements Runnable {

    LogicalNamespace logicalNamespace;
    public LogicalProcess() {
        logicalNamespace = LogicalNamespace.getInstance();
    }

    private void logicalStep() {
        ArrayList<SimulationObject> arrayList;

        arrayList = logicalNamespace.getList(SimulationObjectType.BACTERIA_RED);
        arrayList.forEach(SimulationObject::update);

        arrayList = logicalNamespace.getList(SimulationObjectType.BACTERIA_GREEN);
        arrayList.forEach(SimulationObject::update);

    }

    private void logicalInit() {
        SimulationObjectFactory.createN(SimulationObjectType.FOOD, 3);
        SimulationObjectFactory.createN(SimulationObjectType.BACTERIA_RED, 2);
        SimulationObjectFactory.createN(SimulationObjectType.BACTERIA_GREEN, 1);

        FoodGenerator foodGenerator = new FoodGenerator(1, 2000);
        Thread foodGeneratorThread = new Thread(foodGenerator);
        foodGeneratorThread.start();
    }

    @Override
    public void run() {
        logicalInit();

        while(true) {
            logicalStep();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
