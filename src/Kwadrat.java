public class Kwadrat extends Figura
{

    @Override
    double pole()
    {
        return (bok * bok);
    }

    @Override
    double obwod()
    {
        return (4 * bok);
    }

    @Override
    String nazwaFigury(String figura)
    {
        return "To jest figura: kwadrat";
    }


    private int bok;
    private String figura;


    public Kwadrat(int bok, String figura)
    {
        this.bok = bok;

        this.figura = nazwaFigury(figura);
    }

    public int getBok()
    {
        return bok;
    }

    public void setBok(int bok)
    {
        this.bok = bok;
    }

    @Override
    public String toString()
    {
        return "Kwadrat{" +
                "bok=" + bok +
                '}';
    }
}
