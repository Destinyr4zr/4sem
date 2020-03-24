package ru.mirea.pract2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author ("Sarah Connor", "motherofterminator@yahoo.com", 'F');
System.out.println (author1.ToString());
author1.setEmail("SKYNETISHERE@DARPA.net");
System.out.println(author1.ToString());
    }
}
