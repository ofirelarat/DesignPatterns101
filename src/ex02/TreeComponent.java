package ex02;

import java.util.List;

public abstract class TreeComponent {
    protected int value;

    public TreeComponent(int value) {
        this.value = value;
    }

    public abstract void addChild(TreeComponent c);

    public abstract void removeChild(TreeComponent c);

    public abstract List<TreeComponent> getChilds();

    public abstract int sum();

    public abstract boolean isEven();
}