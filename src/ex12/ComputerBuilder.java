package ex12;

public abstract class ComputerBuilder {
    private Computer computer;

    public Computer buildComputer(){
        System.out.println("build computer with:");
        prepareCase();
        prepareMotherBoard();
        prepareCPU();
        prepareGPU();
        prepareMemory();
        prepareRunTest();

        return computer;
    }

    protected void prepareCase(){
        System.out.println("prepare case");
    }

    protected void prepareMotherBoard(){
        System.out.println("prepare mother board");
    }


    protected void prepareCPU(){
        System.out.println("prepare CPU");
    }


    protected void prepareGPU(){
        System.out.println("prepare GPU");
    }


    protected void prepareMemory(){
        System.out.println("prepare memory");
    }


    protected void prepareRunTest(){
        System.out.println("prepare run test");
    }
}
