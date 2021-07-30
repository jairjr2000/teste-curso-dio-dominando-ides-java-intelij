package br.com.dio.model;

public class FirstProgram {
    public static void main(String[] args) {
        Cat cat = new Cat("Black", "Felix", 12);
        Cat cat2 = new Cat("White", "Garfield", 13);
        System.out.println(cat);
        System.out.println(cat2);

        Book book = new Book("Clean Code", 464);
        System.out.println(book);
    }
}
class Book {
    private String name;
    private Integer numPages;

    public Book(String name, Integer numPages) {
        this.name = name;
        this.numPages = numPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumPages() {
        return numPages;
    }

    public void setNumPages(Integer numPages) {
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", numPages=" + numPages +
                '}';
    }
}