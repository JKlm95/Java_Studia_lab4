public class Pracownik implements PracownikI
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
    public int ileLat(int wiek)
    {
        return 0;
    }

    @Override
    public String nazwaFirmy(String firma)
    {
        return null;
    }

    @Override
    public String nazwaStanowiska(String stanowisko)
    {
        return null;
    }

    private String imie;
    private String nazwisko;
    private int wiek;
    private String firma;
    private String stanowisko;

    public Pracownik(String imie, String nazwisko, int wiek, String firma, String stanowisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.firma = firma;
        this.stanowisko = stanowisko;
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

    public int getWiek()
    {
        return wiek;
    }

    public void setWiek(int wiek)
    {
        this.wiek = wiek;
    }

    public String getFirma()
    {
        return firma;
    }

    public void setFirma(String firma)
    {
        this.firma = firma;
    }

    public String getStanowisko()
    {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko)
    {
        this.stanowisko = stanowisko;
    }

    @Override
    public String toString()
    {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", firma='" + firma + '\'' +
                ", stanowisko='" + stanowisko + '\'' +
                '}';
    }
}
