package src.ru.mirea.lab4._2;

public class Shop {
    public static void main(String[] args) {
        Priceable penprice = new Pen();
        Priceable glassprice = new Glasses(4, 3.35);
System.out.println("Ручки: "+ (((Pen) penprice).getWrites()?"пишут,":"состояние такое, что веселее сломать об кого-тоб,")+" Цвет: "+((Pen) penprice).getColour()+
        ", чернила: "+((Pen) penprice).getInkcolour()+ ", ёмкость: " + ((Pen) penprice).getBloodspilling() + ", продаём по " + penprice.getPrice() +" блокцепных сребренников за штуку");
System.out.println("Очки: "+ (((Glasses) glassprice).getBroken()?"разрублены ":"пронзают тьму ")+"СИЛА: "+((Glasses) glassprice).getTranparency()+", окуляров: <->" + ((Glasses) glassprice).getGlasscount()+"<-> гони "+glassprice.getPrice()+" рупий.");
    }
}
