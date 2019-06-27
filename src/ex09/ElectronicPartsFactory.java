package ex09;

public class ElectronicPartsFactory extends CarPartsFactoryMakerBase {
    @Override
    public Battary createBattay() {
        return new ElectronicBattary();
    }

    @Override
    public Engine createEngine() {
        return new ElectronicEngine();
    }

    @Override
    public AirConditioner createAirConditioner() {
        return new ElectronicAirConditioner();
    }

    @Override
    public LightsSystem createLightsSystem() {
        return new ElectronicLightsSystem();
    }
}
