package joaq;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {       
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
