public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Author tolstoy = new Author("Лев", "Толстой");
        Book book1 = new Book("Анна Каренина", tolstoy, 1960);
        System.out.println(book1);
        book1.setPublicationYear(1980);
        System.out.println(book1);

        Author pushkin = new Author("Александр", "Пушкин");
        Book book2 = new Book("Евгений Онегин", pushkin, 1973);
        System.out.println(book2);

        System.out.println(book1.equals(book2));

    }
}