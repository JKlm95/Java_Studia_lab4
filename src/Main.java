import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
        b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
        c) zabezpieczyć kod przed wprowadzeniem:
           - za dużej liczby (index > tab.length),
           - wprowadzeniem innego znaku niż liczba,
        d) użyć metody finally aby wyświetlić komunikat zakończenia programu
        e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu

           PODPOWIEDZI:
           scan.next() - można wprowadzać dowolny znak z klawiatury,
           index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego)

           warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
           boolean isIndexCorrect
           white(!isIndexCorrect) {}
        */

        String [] tab = {"a", "b", "c", "d", "e", "f"};

        System.out.println("Podaj index tablicy od 0 do 5");

        Scanner scan = new Scanner(System.in);

        boolean isIndexCorrect = false;

       while(!isIndexCorrect)
       {
           try
           {
               String s = tab[Integer.parseInt(scan.next())];
               System.out.println(s);
               isIndexCorrect = true;
           }
           catch (ArrayIndexOutOfBoundsException e)
           {
               System.out.println("Brak elementu w tablicy");
//               throw e;
           }
           catch (NumberFormatException e)
           {
               System.out.println("Podana wartość nie jest liczbą");
//               throw e;
           }
           finally
           {

               System.out.println("Koniec programu");
           }
       }



        /* zad.2
        a) stworzyć dowolny przykład z NullPonterException,
        b) stworzyć dowolny przykład z ArithmeticException ,
        c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
         */







    }
}
