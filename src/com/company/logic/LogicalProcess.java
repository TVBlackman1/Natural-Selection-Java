package com.company.logic;

import java.util.ArrayList;

public class LogicalProcess implements Runnable {

    LogicalNamespace logicalNamespace;
    public LogicalProcess() {
        logicalNamespace = LogicalNamespace.getInstance();
    }

    private void logicalStep() {
        int listCount = SimulationObjectType.values().length;
        for(int i = 0; i < listCount; i++) {
            ArrayList<SimulationObject> arrayList = logicalNamespace.getList(SimulationObjectType.values()[i]);
            for (int j = 0; j < arrayList.size(); j++) {
                System.out.println("!" + arrayList.size());
            }
        }
    }

    private void logicalInit() {
        SimulationObjectFactory.createN(SimulationObjectType.FOOD, 12);
    }

    @Override
    public void run() {
        logicalInit();

        while(true) {
            logicalStep();

//            System.out.println("I work!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
