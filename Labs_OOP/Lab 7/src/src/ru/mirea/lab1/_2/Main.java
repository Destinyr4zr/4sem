package src.ru.mirea.lab1._2;

import java.util.Date;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> items = new LinkedList<String>();

        // добавим в список ряд элементов
        items.add("Камень");
        items.add("Ножницы");
        items.addLast("Бумага"); // добавляем на последнее место
        items.addFirst("Карандаш"); // добавляем на первое место
        items.add(4, "Бутылка"); // добавляем элемент по индексу 1

        System.out.printf("В списке %d элементов: \n", items.size());
        printer(items);
        System.out.println("-------------------------------");
        System.out.println("Первый элемент:");
        System.out.println(items.get(1));
        System.out.println("Изменим 2 на Молотов");
        items.set(1, "Молотов");
        printer(items);
        // проверка на наличие элемента в списке
        if(items.contains("Бутылка")){

            System.out.println("\nУ нас есть чем утолить жажду - у нас же есть бутылка!\n");
        }
        items.remove("Бутылка");
        items.removeFirst(); // удаление первого элемента
        items.removeLast(); // удаление последнего элемента
        System.out.println("удаление первого и последнего элемента");
        printer(items);
        LinkedList<Chiners> people = new LinkedList<Chiners>();
        people.add(new Chiners("Ню"));
        people.addFirst(new Chiners("Ма"));
        people.addLast(new Chiners("Хей"));
        for(Chiners p : people){

            System.out.println(p.getName());
        }
        people.remove(1); // удаление второго элемента
        System.out.println("удаление второго элемента");
        for(Chiners p : people){

            System.out.println(p.getName());
        }
        Chiners first = people.getFirst();
        System.out.println("вывод первого элемента");
        System.out.println(first.getName()); // вывод первого элемента
        System.out.println("Добавление 1000000 элементов: ");
        people.clear();
        Date startLinked = new Date();
        for (int i=0; i<1000000; i++)
        {
            people.addFirst(new Chiners("0"));
            people.addLast(new Chiners("1"));
        }
        Date finishLinked = new Date();
        System.out.println(finishLinked.getTime()-startLinked.getTime()+" ms");
        System.out.println("Удаление 1000000 элементов: ");
        startLinked = new Date();
        for (int i=0; i<1000000; i++)
        {
            people.removeFirst();
            people.removeLast();
        }
        finishLinked = new Date();
        System.out.println(finishLinked.getTime()-startLinked.getTime()+" ms");
    }

    public static <T> void printer(LinkedList<T> items) {
        for (T hold : items) {

            System.out.println(hold);
        }
    }
}
