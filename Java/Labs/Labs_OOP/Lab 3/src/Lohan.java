public class Lohan extends Dish {

    public Lohan ()
    {
        super("Деревянная", "Росписная");
        this.razmer = "Вмещает в себя Плутон";
    }

    public Lohan(String material, String colour, String razmer) {
        super(material, colour);
        this.razmer = razmer;
    }

    public String getRazmer() {
        return razmer;
    }
    public void setRazmer(String razmer) {
        this.razmer = razmer;
    }
    @Override
    public String toString() {
        return "Настоящая русская гетеросексуальная ЛОХАНЬ: РАЗМЕР: " + razmer + ", МАТЕРИАЛ: " + material + ", ЦВЕТ: " + colour + '}';
    }
    private String razmer;
}
