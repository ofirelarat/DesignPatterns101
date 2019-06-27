package ex06;

public class NumFlyWeight {
    private int base;
    private int pow;

    public NumFlyWeight(int base, int pow) {
        this.base = base;
        this.pow = pow;
    }

    public int getNum(){
        return (int)Math.pow(base, pow);
    }
}
