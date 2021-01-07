package logic;

public class BacteriaGreen extends Bacteria {

    BacteriaGreen() {

    }

    @Override
    protected void setType() {
        type = SimulationObjectType.BACTERIA_GREEN;
    }

    @Override
    protected void setTargetType() {
        targetType = SimulationObjectType.FOOD;
    }
}
