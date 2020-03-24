public class Kremankarozetka extends Dish {

    public Kremankarozetka ()
    {
        super ("Керамическая", "Бледно-розовая");
        this.depth = 0.3;
        this.form = "\"HEX\"";
        this.desintegrated = true;
    }

    public Kremankarozetka (String material, String colour, Double depth, String form)
    {
        super (material, colour);
        this.form = form;
        this.depth = depth;
        if (depth>0)
            this.desintegrated = true;
        else
            this.desintegrated = false;
    }

    public Double getDepth() {
        return depth;
    }

    public void setDepth(Double depth) {
        this.depth = depth;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }
    @Override
    public String toString() {
        return "3D Кремпанк-розетка: Материал: " + material + ", Форма: "+form+", Глубина: " + depth+", Цвет: " + colour +(desintegrated?", цела.":", РАСЩЕПЛЕНА!");
    }
    private String form;
    private Double depth;
    private boolean desintegrated;
}
