import ex01.Context;
import ex02.Composite;
import ex02.Leaf;
import ex02.TreeComponent;
import ex03.*;
import ex05.ILogFunc;
import ex05.LogCreator;
import ex06.LargeNums;
import ex07.ChatMediator;
import ex07.Colleague;
import ex07.Mediator;
import ex08.ArmsDayEx;
import ex08.GymTrain;
import ex08.LegDayEx;
import ex09.CarPartsFactoryMakerBase;
import ex09.ElectronicPartsFactory;
import ex10.ColorsBorder;
import ex10.Opacity;
import ex10.ThreeDLights;
import ex10.WindowHandler;
import ex12.Computer;
import ex12.ComputerBuilder;
import ex12.GamingComputerBuilder;

public class Program {
    public static void main(String[] args) {
        /// EX01
        System.out.println("**************EX01**************");
        Context context = new Context();
        context.init();

        context.passLevel();
        context.getHit();
        context.getHit();
        context.passLevel();
        context.getHit();
        context.passLevel();
        context.getHit();
        context.getHit();
        context.passLevel();

        /// EX02
        System.out.println("**************EX02**************");
        TreeComponent tree = new Composite(6);
        TreeComponent leaf1 = new Leaf(2);
        TreeComponent tree1 = new Composite(10);
        TreeComponent leaf2 = new Leaf(12);
        tree.addChild(leaf1);
        tree.addChild(tree1);
        tree1.addChild(leaf2);
        System.out.println("the tree sum is: " + tree.sum());
        System.out.println("is this tree even: " + isEven(tree));

        /// EX03
        System.out.println("**************EX03**************");
        Car smallCar = new SmallCar();
        Car bigCar = new BigCar();
        CarProxy proxy = new CarProxy(smallCar);
        proxy.showFuel();
        proxy = new CarProxy(bigCar);
        proxy.showLoc();

        /// EX05
        System.out.println("**************EX05**************");
        ILogFunc log = LogCreator.createLog("this is the best log class ever", LogCreator.LogLevel.error);
        log.executeLog();

        /// EX06
        System.out.println("**************EX06**************");
        LargeNums largeNums = new LargeNums();
        largeNums.addNum(4,5);
        largeNums.addNum(7,9);
        largeNums.getNums();

        /// EX07
        System.out.println("**************EX07**************");
        Mediator mediator = new ChatMediator();
        Colleague c1 = new Colleague(mediator, "ofir");
        Colleague c2 = new Colleague(mediator, "bla");
        Colleague c3 = new Colleague(mediator, "koren");
        c1.sendToUser("koren", "hi my friend");
        c2.sendBroadcast("hello all!");

        /// EX08
        System.out.println("**************EX08**************");
        GymTrain train = new LegDayEx();
        train.totalGymRutin();
        train = new ArmsDayEx();
        train.totalGymRutin();

        /// EX09
        System.out.println("**************EX09**************");
        CarPartsFactoryMakerBase partsFactoryMakerBase = new ElectronicPartsFactory();
        partsFactoryMakerBase.createBattay();

        /// EX10
        System.out.println("**************EX10**************");
        WindowHandler colors = new ColorsBorder();
        WindowHandler opacity = new Opacity();
        WindowHandler threeD = new ThreeDLights();
        WindowHandler base = new WindowHandler();
        opacity.setNext(colors);
        threeD.setNext(opacity);
        base.setNext(threeD);
        base.handle();

        /// EX12
        System.out.println("**************EX12**************");
        ComputerBuilder builder = new GamingComputerBuilder();
        Computer c = builder.buildComputer();

    }

    private static boolean isEven(TreeComponent c)
    {
        if (!c.isEven())
            return false;

        if(c.getChilds() != null) {
            for (TreeComponent child : c.getChilds()) {
                return isEven(child);
            }
        }


        return true;
    }
}
