public abstract class Dish {

    public Dish(String material, String colour) {
        this.material = material;
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    @Override
    public String toString() {
        return "International tolerant transgender dish: material: " + material + '"' + ", colour: " + colour + '\'' + '}';
    }
    protected String material;
    protected String colour;
}
