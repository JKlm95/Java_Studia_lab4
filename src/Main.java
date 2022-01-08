
public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) napisać interfejs CzlowiekI
        b) zadeklarować 2 metody

        c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI
        d) zadeklarować 3 metody

        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI
        f) zadeklarować 3 metody
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować: Code/Prawy myszy-->Generate-->getters/setters/toString)
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola
        c) wypisać metody toString() wszystkich objektów
        */


        Student student1 = new Student("John", "Erasmus", "Wyzsza Szkola Robienia Halasu", 1, "Nic nierobienie");
        Student student2 = new Student("Jan", "Patriota", "Najlepsza Politechnika", 2, "Polityka");
        Pracownik pracownik1 = new Pracownik("Al", "Bundy", 36, "Firmopol", "Operator koparki recznej");
        Pracownik pracownik2 = new Pracownik("Aleksander", "Kwiatkowski", 42, "Blysk","Konserwator powierzchni plaskich");
        student1.toString();
        student2.toString();
        pracownik1.toString();
        pracownik2.toString();
        System.out.println(student1 + "\n" + student2 + "\n" + pracownik1 + "\n" + pracownik2);


    }
}
