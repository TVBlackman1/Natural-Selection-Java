package com.company.logic;

public class FoodGenerator implements Runnable {

    int count;
    int interval;
    public FoodGenerator(int count, int interval) {
        this.count = count;
        this.interval = interval;
    }

    @Override
    public void run() {
        while(true) {
            SimulationObjectFactory.createN(SimulationObjectType.FOOD, count);
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
