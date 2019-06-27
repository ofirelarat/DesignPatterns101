package ex12;

public class OfficeComputerBuilder extends ComputerBuilder {
    @Override
    protected void prepareCase() {
        System.out.println("Office Computer case");
    }

    @Override
    protected void prepareMotherBoard() {
        System.out.println("Office Computer mother board");
    }

    @Override
    protected void prepareCPU() {
        System.out.println("Office Computer cpu");
    }

    @Override
    protected void prepareGPU() {
        System.out.println("Office Computer GPU");
    }

    @Override
    protected void prepareMemory() {
        System.out.println("Office Computer memory");
    }
}
