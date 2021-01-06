package com.company.logic;

import java.util.ArrayList;

public class LogicalNamespace {
    private static LogicalNamespace instance;

    private final ArrayList<ArrayList<SimulationObject>> listsOfObjects;

    private LogicalNamespace() {
        listsOfObjects = new ArrayList<>();

        int listCount = SimulationObjectType.values().length;
        for(int i = 0; i < listCount; i++) {
            listsOfObjects.add(new ArrayList<>());
        }
    }

    public ArrayList<SimulationObject> getList(SimulationObjectType type) {
        return listsOfObjects.get(type.ordinal());
    }

    public static LogicalNamespace getInstance() {
        if (instance == null) {
            instance = new LogicalNamespace();
        }
        return instance;
    }
}