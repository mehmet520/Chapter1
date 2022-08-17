package Innereklassen;

public class Mannschaft {

    //Methooden der Klasse Manschaft
    public void erstelleSportler() {

        class Sportler {

            String name;
            int alter;

            public Sportler(String _name, int _alter) {
                name = _name;
                alter = _alter;
            }

            public void getSportler() {
                System.out.println("Sportler erstellt: " + this.name + " Alter: " + this.alter);
            }
        }
        Sportler sp1 = new Sportler("Peter", 25);
        Sportler sp2 = new Sportler("Mike", 26);
        Sportler sp3 = new Sportler("Hans", 34);

        sp1.getSportler();
        sp2.getSportler();
        sp3.getSportler();

    }
}
