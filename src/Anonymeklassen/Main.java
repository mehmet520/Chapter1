package Anonymeklassen;

public class Main {
    public static void main(String[] args) {

        //Bisher
        Person p1 = new Person("Ralf");

        //Anonym
        new Person("Olaf") {
            @Override
            public void printName() {
                System.out.println("Der Name: " + this.getName());
            }
        };

        Tier hund1 = new Tier() {
            @Override
            public String machLaute() {
                return "wau wau";
            }
        };
        Tier katze1 = new Tier() {
            @Override
            public String machLaute() {
                return null;
            }
        };

        Tier elefant = new Tier() {
            @Override
            public String machLaute() {
                return "törö";
            }
        };

        Tier schwein = new Tier() {
            @Override
            public String machLaute() {
                return "Oink oink";
            }
        };
    }
}
