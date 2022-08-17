package Anonymeklassen;

public class AnonInner2 {

    public int pay() {
        return admission(5, new SaleTodayOnly() {
            public int dollarsOff() {
                return 3;
            }
        });
    }

    public int admission(int basePrice, SaleTodayOnly sale) {
        return basePrice - sale.dollarsOff();
    }

    interface SaleTodayOnly {
        int dollarsOff();
    }
}

