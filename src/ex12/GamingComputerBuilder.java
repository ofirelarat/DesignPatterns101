package ex12;

public class GamingComputerBuilder extends ComputerBuilder {
    @Override
    protected void prepareCase() {
        System.out.println("Gaming Computer case");
    }

    @Override
    protected void prepareMotherBoard() {
        System.out.println("Gaming Computer mother board");
    }

    @Override
    protected void prepareCPU() {
        System.out.println("Gaming Computer cpu");
    }

    @Override
    protected void prepareGPU() {
        System.out.println("Gaming Computer GPU");
    }

    @Override
    protected void prepareMemory() {
        System.out.println("Gaming Computer memory");
    }
}
