public class Prostokat extends Figura
{
    @Override
    double pole()
    {
        return (bok1 * bok2);
    }

    @Override
    double obwod()
    {
        return ((2 * bok1) + (2 * bok2));
    }

    @Override
    String nazwaFigury(String figura)
    {
        return "To jest figura: prostokat";
    }

    private int bok1;
    private int bok2;
    private String figura;

    public Prostokat(int bok1, int bok2, String figura)
    {
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.figura = nazwaFigury(figura);
    }

    public int getBok1()
    {
        return bok1;
    }

    public void setBok1(int bok1)
    {
        this.bok1 = bok1;
    }

    public int getBok2()
    {
        return bok2;
    }

    public void setBok2(int bok2)
    {
        this.bok2 = bok2;
    }

    @Override
    public String toString()
    {
        return "Prostokat{" +
                "bok1=" + bok1 +
                ", bok2=" + bok2 +
                '}';
    }
}
