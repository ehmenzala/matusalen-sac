
import admin.model.Admin;
import admin.model.AdminSession;
import admin.model.AdminSessionFetcher;
import book.model.Book;
import book.model.BookFetcher;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        BookFetcher bf = new BookFetcher();
        bf.createBook(new Book(5, "tutt", "asdasdsa", "gendakdas", 177, 2020, "esasdasd,", "165-645-564", 5, "fraduauwdwd"));   
    }
    
    public static void readFileFromBookFetcher() {
        BookFetcher bf = new BookFetcher();
        ArrayList<Book> totalBooks = bf.readAllBooks();
        for (Book book : totalBooks) {
            System.out.println("# Book: " + book.getTitle());
            System.out.println("> ID: " + book.getId());
            System.out.println("> Author: " + book.getAuthor());
            System.out.println("> Genre: " + book.getGenre());
            System.out.println("> No. Pages: " + book.getNumberOfPages());
            System.out.println("> Published day: " + book.getPublishedDate());
            System.out.println("> Language: " + book.getLanguage());
            System.out.println("> ISBN: " + book.getIsbn());
            System.out.println("> Rating: " + book.getRating());
            System.out.println("> Fragment: " + book.getFragment());
            System.out.println();
        }
    }
    
    public static void AdminSessionFetcherTest() {
        AdminSessionFetcher asf = new AdminSessionFetcher();
        AdminSession testSession = new AdminSession(new Admin("Esteban"), "correo@correo.com", "micontra");
        //asf.createSession(testSession);
        //System.out.println("# Test session");
        //System.out.println("Name: " + testSession.getAdmin().getName());
        //System.out.println("Correo: " + testSession.getEmail());
        //System.out.println("Pass: " + testSession.getPassword());
        
        String message = asf.exists(testSession) ? "Sí existe" : "No existe";
        System.out.println(message);
    }
    
    public static void myLittlePonny() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¡Bienvenido(a) a My Little Pony!");
        
        // Solicitar el nombre del personaje
        System.out.print("Ingresa el nombre de tu personaje: ");
        String nombre = scanner.nextLine();
        
        // Mostrar el mensaje de bienvenida
        System.out.println("¡Hola, " + nombre + "! ¿Con qué poni te gustaría interactuar?");
        
        // Solicitar la elección de la poni
        System.out.println("Elige una poni: ");
        System.out.println("1. Twilight Sparkle");
        System.out.println("2. Rainbow Dash");
        System.out.println("3. Pinkie Pie");
        
        int opcion = scanner.nextInt();
        
        // Seleccionar la poni y mostrar una frase
        switch (opcion) {
            case 1:
                System.out.println("Twilight Sparkle dice: ¡Hola! ¿Quieres aprender magia conmigo?");
                break;
            case 2:
                System.out.println("Rainbow Dash dice: ¡Vamos a volar a toda velocidad juntos!");
                break;
            case 3:
                System.out.println("Pinkie Pie dice: ¡Ven a mi fiesta y diviértete al máximo!");
                break;
            default:
                System.out.println("Opción inválida. No hay interacción con esa poni.");
                break;
        }
        
        // Cerrar el escáner
        scanner.close();
    }
}
