public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */


        Kwadrat kwadrat = new Kwadrat(3, "");
        System.out.println(kwadrat.nazwaFigury("kwadrat"));
        System.out.println(kwadrat.pole());
        System.out.println(kwadrat.obwod());

        Prostokat prostokat = new Prostokat(4, 6,"");
        System.out.println(prostokat.nazwaFigury("prostokat"));
        System.out.println(prostokat.pole());
        System.out.println(prostokat.obwod());


    }
}
