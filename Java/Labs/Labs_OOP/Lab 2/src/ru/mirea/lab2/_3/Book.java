package ru.mirea.lab2._3;

public class Book {
    Book() {
        title = "Divine comedy";
        author = "GOD";
        publishingyear = -4000;
        style = Style.ancient;
        genre = Genre.Fantasy;
    }
    Book (String title, String author)
    {
        this.title = title;
        this.author = author;
        publishingyear = 2077;
        style = Style.futuristic;
        genre = Genre.Science;
    }
    Book (String title, String author, int publishingyear, int circulation, Style style, Genre genre)
    {
        this.title = title;
        this.author = author;
        this.publishingyear = publishingyear;
        this.circulation = circulation;
        this.style = style;
        this.genre = genre;
    }

    private String title;
    private String author;
    private int publishingyear=2019;
    private int  circulation=1;
    private Style style = Style.workpaper;
    private Genre genre = Genre.Hobology;
    private enum Style {modern, ancient, futuristic, workpaper}
    private enum  Genre {Adventure, Pulp_fiction, Romance, Science, Fantasy, Guide, Encyclopedia, Hobology}
}
