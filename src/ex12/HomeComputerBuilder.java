package ex12;

public class HomeComputerBuilder extends ComputerBuilder {
    @Override
    protected void prepareCase() {
        System.out.println("Home Computer case");
    }

    @Override
    protected void prepareMotherBoard() {
        System.out.println("Home Computer mother board");
    }

    @Override
    protected void prepareCPU() {
        System.out.println("Home Computer cpu");
    }

    @Override
    protected void prepareGPU() {
        System.out.println("Home Computer GPU");
    }

    @Override
    protected void prepareMemory() {
        System.out.println("Home Computer memory");
    }
}
