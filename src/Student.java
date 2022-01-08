public class Student implements StudentI
{
    @Override
    public String imie(String imie)
    {
        return null;
    }

    @Override
    public String nazwisko(String nazwisko)
    {
        return null;
    }

    @Override
    public String nazwaUczelni(String uczelnia)
    {
        return null;
    }

    @Override
    public int rokStudiow(int rok)
    {
        return 0;
    }

    @Override
    public String kierunekStudiow(String kierunek)
    {
        return null;
    }

    private String imie;
    private String nazwisko;
    private String uczelnia;
    private int rok;
    private String kierunek;


    public Student(String imie, String nazwisko, String uczelnia, int rok, String kierunek)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.uczelnia = uczelnia;
        this.rok = rok;
        this.kierunek = kierunek;
    }

    public String getImie()
    {
        return imie;
    }

    public void setImie(String imie)
    {
        this.imie = imie;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko)
    {
        this.nazwisko = nazwisko;
    }

    public String getUczelnia()
    {
        return uczelnia;
    }

    public void setUczelnia(String uczelnia)
    {
        this.uczelnia = uczelnia;
    }

    public int getRok()
    {
        return rok;
    }

    public void setRok(int rok)
    {
        this.rok = rok;
    }

    public String getKierunek()
    {
        return kierunek;
    }

    public void setKierunek(String kierunek)
    {
        this.kierunek = kierunek;
    }


    @Override
    public String toString()
    {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", uczelnia='" + uczelnia + '\'' +
                ", rok=" + rok +
                ", kierunek='" + kierunek + '\'' +
                '}';
    }
}
