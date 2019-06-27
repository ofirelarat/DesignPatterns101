package ex02;

import java.util.List;

public class Leaf extends TreeComponent {

    public Leaf(int value) {
        super(value);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void addChild(TreeComponent c) {

    }

    @Override
    public void removeChild(TreeComponent c) {

    }

    @Override
    public List<TreeComponent> getChilds() {
        return null;
    }

    @Override
    public int sum() {
        return this.value;
    }

    @Override
    public boolean isEven() {
        return this.value%2 == 0;
    }
}