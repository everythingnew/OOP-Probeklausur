import java.util.ArrayList;

public class Mitglied
{

    // a)
    private int mitgliedsnr;
    private String name;
    private ArrayList<String> sparten;

    //c)
    public Mitglied()
    {
        sparten = new ArrayList<>();
    }

    //d)
    public Mitglied(int mitgliedsnr, String name)
    {
        this();
        this.mitgliedsnr = mitgliedsnr;
        this.name = name;
    }

    //e)
    public void addSparte(String sparte){
        //prüfen,ob die angegebene Bezeichnung schon in der Liste enthalten ist
        if (!sparten.contains(sparte)){
            //falls das nicht der Fall ist, dann in die Liste hinzufügen
            sparten.add(sparte);
        }
    }

    //b)
    public int getMitgliedsnr()
    {
        return mitgliedsnr;
    }

    public void setMitgliedsnr(int mitgliedsnr)
    {
        this.mitgliedsnr = mitgliedsnr;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public ArrayList<String> getSparten()
    {
        return sparten;
    }

    public void setSparten(ArrayList<String> sparten)
    {
        this.sparten = sparten;
    }
}
