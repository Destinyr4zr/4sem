package src.ru.mirea.lab4._2;

public class Glasses implements Priceable{

    public Glasses  ()
    {
        this.broken = true;
        this.glasscount = 1;
        this.tranparency = -100500.420;
        this.Ocularmzda = 666.999*this.tranparency;
    }

    public  Glasses (int glasscount, double tranparency)
    {
        this.glasscount = glasscount;
        this.tranparency = tranparency;
        switch (glasscount)
        {
            case 1:
            {
                this.Ocularmzda=8800.5553535*tranparency;
                break;
            }
            case 2:
            {
                this.Ocularmzda=777*tranparency;
                break;
            }
            case 3:
            {
                this.Ocularmzda=666.777*tranparency;
                break;
            }
            case 4:
            {
                this.Ocularmzda=13*tranparency;
                break;
            }
            case 6:
            {
                this.Ocularmzda=47.42*tranparency;
                break;
            }
            default:
            {
                double glasscost = 22%7*tranparency;
                if (glasscount>6)
                {
                    this.Ocularmzda = glasscost*glasscount*tranparency;
                }
                else if (glasscount<0)
                {
                    this.Ocularmzda = 100.500*tranparency;
                }
                else
                {
                    this.Ocularmzda=glasscost*glasscount*tranparency;
                }
                break;
            }
        }
        if (glasscount<2)
        {
            this.broken=true;
        }
        else
            this.broken=false;
    }

    public double getTranparency() {
        return tranparency;
    }

    public void setTranparency(double tranparency) {
        this.tranparency = tranparency;
    }

    public int getGlasscount() {
        return glasscount;
    }

    public void setGlasscount(int glasscount) {
        this.glasscount = glasscount;
    }

    public boolean getBroken ()
    {
        return this.broken;
    }

    @Override
    public double getPrice() {
        return Ocularmzda;
    }

    private double tranparency;
    private boolean broken;
    private int glasscount;
    private double Ocularmzda;
}
