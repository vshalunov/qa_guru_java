package com.github.zlw;

public class NewBook {

    public static void main(String[] args) {
        Book Lagom = new Book();
        Lagom.nameBook = "Lagom";
        Lagom.totalCountOfPages = 200;
        Lagom.countOfPagesRead = 200;
        Lagom.sayNameBook();
        Lagom.readToLeft();

        Book Uve = new Book();
        Uve.nameBook = "Uve";
        Uve.totalCountOfPages = 490;
        Uve.countOfPagesRead = 380;
        Uve.sayNameBook();
        Uve.readToLeft();
    }


}
