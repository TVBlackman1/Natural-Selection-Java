package logic;

public class SimulationObjectFactory {

    public static SimulationObject create(SimulationObjectType type) {
        if(type == SimulationObjectType.BACTERIA_GREEN) {
            return new BacteriaGreen();
        }
        if(type == SimulationObjectType.BACTERIA_RED) {
            return new BacteriaRed();
        }
        if(type == SimulationObjectType.FOOD) {
            return new Food();
        }

        return null;
    }

    public static void createN(SimulationObjectType type, int count) {
        for(int i = 0; i < count; i++) {
            create(type);
        }
    }
}
