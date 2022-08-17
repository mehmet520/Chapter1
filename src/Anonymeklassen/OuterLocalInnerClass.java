package Anonymeklassen;

public class OuterLocalInnerClass {

    private int length = 5;

    public static void main(String[] args) {
        OuterLocalInnerClass outer = new OuterLocalInnerClass();
        outer.calculate();
    }

    public void calculate() {
        final int width = 20;
        class Inner {
            public void multiply() {
                System.out.println(length * width);
            }
        }
        Inner inner = new Inner();
        inner.multiply();
    }
}

