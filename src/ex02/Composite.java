package ex02;

import java.util.ArrayList;
import java.util.List;

public class Composite extends TreeComponent {

    List<TreeComponent> children = new ArrayList<TreeComponent>();

    public Composite(int value) {
        super(value);
    }

    @Override
    public void addChild(TreeComponent c) {
        System.out.println("added component to the tree");
        children.add(c);
    }

    @Override
    public void removeChild(TreeComponent c) {
        System.out.println("remove component to the tree");
        children.remove(c);
    }

    @Override
    public List<TreeComponent> getChilds() {
        System.out.println("get components");
        return children;
    }

    @Override
    public int sum() {
        int sumTotal = 0;
        for (TreeComponent c : children) {
            sumTotal += c.sum();
        }

        return this.value + sumTotal;
    }

    @Override
    public boolean isEven() {
        boolean b = true;
        for (TreeComponent c:children) {
            if(!c.isEven()){
                b = false;
            }
        }

        return this.value % 2 == 0 && b;
    }

}