public class Main {
    public static void main(String[] args) {

        Author pushkin = new Author("Александр", "Пушкин");
        Author lermottov = new Author("Михаил", "Лермонтов");
        Book onegin = new Book("Евгений Онегин", pushkin, 1780);
        Book borodino = new Book("Бородино", lermottov, 1814);//сначала указать автора,
        // потом его использовать,
        // наоборот все краснеет. ВСЕ РАБОТАЕТ СВЕРХУ ВНИЗ???? если да, то слева направо  тоже имеются где-то правила?
        System.out.println("Книга: " + onegin.getNameBook() + ", " + "автор" + ": " + onegin.getAuthor().getNameFirst() + " " + onegin.getAuthor().getNameSecond() + ", " + "год издания" + " " + onegin.getYear());
        // print так делать или отдельным методом
        //можно ли геттеры вызывать в вывод не только по отдельности, их никак не объединить
        //borodino != borodino.getNameBook() + borodino.getAuthor().getNameFirst() + borodino.getAuthor().getNameSecond() + borodino.getYear()
        // пока не запушишь, новую ветку не создашь, так ведь?

        borodino.setYear(1815);
        System.out.println(borodino.getYear());



    }
}