package EqualsHashCodeToString;

public class EqualDemo {
    public static void main(String[] args) {

        PKW p1 = new PKW(100, "BNW", 20000, 5);
        PKW p2 = new PKW(100, "BNW", 20000, 5);

        System.out.println(p1.equals(p2));
        System.out.println(p1);
    }
}