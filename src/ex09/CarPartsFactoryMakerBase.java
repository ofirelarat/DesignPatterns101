package ex09;

public abstract class CarPartsFactoryMakerBase {
    public abstract Battary createBattay();
    public abstract Engine createEngine();
    public abstract AirConditioner createAirConditioner();
    public abstract LightsSystem createLightsSystem();

    public Seat createSeats(){
        return new Seat();
    }

    public Weel createWeel(){
        return new Weel();
    }

    public Tin createJeck(){
        return  new Tin();
    }
}
