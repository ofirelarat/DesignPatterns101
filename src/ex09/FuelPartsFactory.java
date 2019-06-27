package ex09;

public class FuelPartsFactory extends CarPartsFactoryMakerBase {
    @Override
    public Battary createBattay() {
        return new FuelBattary();
    }

    @Override
    public Engine createEngine() {
        return new FuelEngine();
    }

    @Override
    public AirConditioner createAirConditioner() {
        return new FuelAirConditioner();
    }

    @Override
    public LightsSystem createLightsSystem() {
        return new FuelLightsSystem();
    }
}
