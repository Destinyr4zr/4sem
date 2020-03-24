package src.ru.mirea.lab4._2;

public class Pen implements Priceable{

    public Pen ()
    {
        this.colour = "blue";
        this.bloodspilling=1488;
        this.inkcolour="gory";
        this.writes=true;
        this.prestige = bloodspilling*22%7;
    }

    public Pen (String colour, double bloodspilling, String inkcolour)
    {
        this.colour=colour;
        this.bloodspilling = bloodspilling;
        this.inkcolour=inkcolour;
        if (bloodspilling>0)
        {
            writes=true;
        }
        else
            writes=false;
        double moneyuse = 3.14;
        this.prestige = moneyuse*bloodspilling;
    }

    public boolean getWrites ()
    {
        return this.writes;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getInkcolour() {
        return inkcolour;
    }

    public void setInkcolour(String inkcolour) {
        this.inkcolour = inkcolour;
    }

    public double getBloodspilling() {
        return bloodspilling;
    }

    public void setBloodspilling(double bloodspilling) {
        this.bloodspilling = bloodspilling;
    }

    @Override
    public double getPrice() {
        return prestige;
    }

    private String colour;
    private String inkcolour;
    private boolean writes;
    private double bloodspilling;
    private double prestige;
}
