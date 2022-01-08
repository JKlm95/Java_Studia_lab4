public class Dom implements Budynek
{

    private double pow;
    private String adres;
    private int valueo;
    private int valuem;
    private KolorEnum kolor;
    private int koty;
    private int psy;


    public Dom(double pow, String adres, int valueo, int valuem, KolorEnum kolor, int koty, int psy, int sumaZwierzat)
    {
        this.pow = pow;
        this.adres = adres;
        this.valueo = valueo;
        this.valuem = valuem;
        this.kolor = kolor;
        this.koty = koty;
        this.psy = psy;
        sumaZwierzat(koty, psy);
    }

    private int sumaZwierzat(int koty,int psy)
    {
        return koty + psy;
    }


    //implementacja metod
    @Override
    public double powierzchnia(double pow)
    {
        return 0;
    }

    @Override
    public String adresBudynku(String adres)
    {
        return null;
    }

    @Override
    public int liczbaOkien(int valueo)
    {
        return 0;
    }

    @Override
    public void liczbaMieszkancow(int valuem)
    {

    }

    @Override
    public void kolorDomu(KolorEnum kolor)
    {

    }

    @Override
    public int iloscZwierzat(int koty, int psy)
    {
        return 0;
    }

//gettery i settery
    public double getPow()
    {
        return pow;
    }

    public void setPow(double pow)
    {
        this.pow = pow;
    }

    public String getAdres()
    {
        return adres;
    }

    public void setAdres(String adres)
    {
        this.adres = adres;
    }

    public int getValueo()
    {
        return valueo;
    }

    public void setValueo(int valueo)
    {
        this.valueo = valueo;
    }

    public int getValuem()
    {
        return valuem;
    }

    public void setValuem(int valuem)
    {
        this.valuem = valuem;
    }

    public KolorEnum getKolor()
    {
        return kolor;
    }

    public void setKolor(KolorEnum kolor)
    {
        this.kolor = kolor;
    }

    public int getKoty()
    {
        return koty;
    }

    public void setKoty(int koty)
    {
        this.koty = koty;
    }

    public int getPsy()
    {
        return psy;
    }

    public void setPsy(int psy)
    {
        this.psy = psy;
    }

//toString
    @Override
    public String toString()
    {
        return "Dom{" +
                "pow=" + pow +
                ", adres='" + adres + '\'' +
                ", valueo=" + valueo +
                ", valuem=" + valuem +
                ", kolor=" + kolor +
                ", koty=" + koty +
                ", psy=" + psy +
                '}';
    }
}

