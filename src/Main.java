public class Main {
    public static void main(String... args) {

        Author author1 = new Author("Гавриил","Троепо́льский");
        Author author2 = new Author("Иван"," Тургенев");

        System.out.println(author1.equals(author2));

        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());

        Book houseworkWhiteBimBlackEar = new Book("Белый бим черное ухо", author1, 1971);
        Book muMu = new Book("Му Му", author2, 1854);

        printInfo(houseworkWhiteBimBlackEar);
        printInfo(muMu);

        }
    private static void printInfo(Book book) {
        System.out.println(book);
        System.out.println(book.hashCode());
    }
    }
