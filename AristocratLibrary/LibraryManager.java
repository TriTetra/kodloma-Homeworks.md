package AristocratLibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LibraryManager {
    private List<Library> books;

    // Kurucu metot
    public LibraryManager() {
        books = new ArrayList<>();
    }

    public void mainManager(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("-----------------Welcome to Aristocrat Library-------------------");
            System.out.println("1 - Add book            2 - Remove book           3 - Search book");
            System.out.println("                       4 - List of Books");
            System.out.println("----------------------| Enter x for exit |-----------------------");
            String process = scanner.next().toUpperCase();

            if (process.equals("X")){
                break;
            }
            switch (process){
                case "1":
                    addBook();
                    break;
                case "2":
                    removeBook();
                    break;
                case "3":
                    System.out.print("Kitap ismini giriniz : ");
                    String name = scanner.next();
                    findBookById(name);
                    break;
                case "4":
                    listBooks();
            }
        }
    }

    // Kitap ekleme metodu
    public void addBook() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int id = random.nextInt(1000)*400;

        System.out.print("Enter book name :");
        String bookName = scanner.next();
        System.out.print("Enter writer : ");
        String writer = scanner.next();
        System.out.print("Enter Date of book : ");
        String dateBook = scanner.next();
        System.out.print("Enter page of book : ");
        String pageBook = scanner.next();

        Library book = new Library(id,dateBook,pageBook,bookName,writer);
        if (!books.equals(book)){
            books.add(book);
            System.out.println("Kitap başarıyla eklenmiştir.! -> "+id);
        }else System.out.println("Kitap eklenemedi.!");
    }

    // Kitap silme metodu
    public void removeBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter book name :");
        String bookName = scanner.next();
        System.out.print("Enter writer : ");
        String writer = scanner.next();
        System.out.print("Enter Date of book : ");
        String dateBook = scanner.next();
        System.out.print("Enter page of book : ");
        String pageBook = scanner.next();
        System.out.print("Enter id of book : ");
        int id = scanner.nextInt();

        Library book = new Library(id,dateBook,pageBook,bookName,writer);
        if (books.equals(book)){
            books.remove(book);
            System.out.println("Kitap başarıyla Silinmiştir.!");
        }else System.out.println("Kitap Bulunamadı.!");
    }

    // Tüm kitapları listeleme metodu
    public void listBooks() {
        for (Library library : books) {
            System.out.println("[Kitap adı: " + library.getBookName()+"] "+
                               "[Yazar: " + library.getWriter()+"] "+
                               "[Sayfa sayısı: " + library.getPage()+"] "+
                               "[Date: " + library.getDate()+"] "+
                               "[Id: "+library.getBookId()+"]");
        }
    }

    // Kitap arama metodu
    public Library findBookById(String bookName) {
        for (Library library : books) {
            if (library.getBookName().equals(bookName)) {
                System.out.println("Kitabınız sistemde bulunmaktadır -> "+library.getBookName());
                return library;
            }else System.out.println("Kitabınız sistemde bulunamadı.");
        }
        return null;
    }
}
