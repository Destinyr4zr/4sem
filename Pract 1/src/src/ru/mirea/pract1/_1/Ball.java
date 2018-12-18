package src.ru.mirea.pract1._1;

import java.lang.*;

public class Ball {
    //Создание мяча без параметров
    public Ball() {
        manufacturer = "China";
        colour = Colour.Transparent;
        secondarycolour = Secondarycolour.Transparent;
        type = Type.Any;
        shape = Shape.Blur;
        weight = 0;
        plating = Plating.Sexy;
    }
//Создание мяча с параметрами
    public Ball(String manufacturer, Colour colour, Secondarycolour secondarycolour, Type type, Shape shape,
                double weight, Plating plating) {
        this.manufacturer = manufacturer;
        this.colour = colour;
        this.secondarycolour = secondarycolour;
        this.type = type;
        this.shape = shape;
        this.weight = weight;
        this.plating = plating;
    }

    public Ball(Type type) {
        manufacturer = "Russia";
        colour = Colour.White;
        secondarycolour = Secondarycolour.BlueRed;
        this.type = type;
        shape = Shape.Sphere;
        weight = 1.5;
        plating = Plating.Supermetafantasycoolness;
    }
//Вывод описания мяча
    public String ToString() {
        return "Congrats! U R kicking " + manufacturer + " " + colour + "\n" + type + " " + shape + " ball with "+ secondarycolour+" paintings, weighing " + weight + " kg" + " in \n" + plating + " coverage!";
    }
//Действия с характеристиками мяча
    public void setmanufacturer (String manufacturer){this.manufacturer = manufacturer;}

    public String getmanufacturer() {return manufacturer;}

    public void setcolour (Colour colour){this.colour = colour;}

    public Colour getcolour (){return colour;}

    public void setsecondarycolour(Secondarycolour secondarycolour) {this.secondarycolour = secondarycolour;}

    public Secondarycolour getsecondarycolour() {return secondarycolour;}

    public void settype(Type type) {this.type=type;}

    public Type gettype() {return type;}

    public void setshape(Shape shape) {this.shape = shape;}

    public Shape getshape() {return shape;}

    public void setweight (double weight) {this.weight=weight;}

    public double getweight () {return weight;}

    public void setplating (Plating plating) {this.plating=plating;}

    public Plating getplating () {return plating;}

    //Перечисления свойств мяча
    private String manufacturer;
    private Colour colour;
    private Secondarycolour secondarycolour;
    private Type type;
    private Shape shape;
    private double weight;
    private Plating plating;

    private enum Colour {
        Black, Yellow, White, Blue, Red, Orange, Green, Purple, Transparent
    }

    private enum Secondarycolour {
        Grey, Black, White, Yellow, Red, Blue, Green, BlueRed, Transparent
    }

    private enum Type {
        Football, Volleyball, Basketball, Demo, Any
    }

    private enum Shape {
        Triangle, Quadro, Misc, Sphere, Blur
    }

    private enum Plating {
        Metal, Sharp, Soft, Supermetafantasycoolness, Sexy
    }
}
