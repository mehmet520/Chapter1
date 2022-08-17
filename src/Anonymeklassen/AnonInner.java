package Anonymeklassen;

public class AnonInner {

    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            int dollarsOff() {
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }

    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }
}
