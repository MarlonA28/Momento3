import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        
        String[] referencias = new String[5];

        referencias[0] = "Chaqueta de Cuero Icon";
        referencias[1] = "Jean Slim Fit";
        referencias[2] = "Camiseta Polo Leather";

        int opcion;

        
        do {
            System.out.println("\n===== MENU DE REFERENCIAS =====");
            System.out.println("1. Listar referencias");
            System.out.println("2. Buscar referencia");
            System.out.println("3. Agregar referencia");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {

                case 1:
                    
                    System.out.println("\n--- LISTA DE REFERENCIAS ---");

                    for (int i = 0; i < referencias.length; i++) {

                        if (referencias[i] != null) {
                            System.out.println(i + ". " + referencias[i]);
                        }
                    }
                    break;

                case 2:
                    
                    System.out.print("\nIngrese el nombre de la referencia: ");
                    String buscar = entrada.nextLine();

                    boolean encontrada = false;

                    for (int i = 0; i < referencias.length; i++) {

                        if (referencias[i] != null &&
                            referencias[i].equalsIgnoreCase(buscar)) {

                            System.out.println("Referencia encontrada: "
                                    + referencias[i]);

                            System.out.println("Posicion: " + i);

                            encontrada = true;
                        }
                    }

                    if (encontrada == false) {
                        System.out.println("La referencia no existe.");
                    }
                    break;

                case 3:
                    
                    boolean agregado = false;

                    for (int i = 0; i < referencias.length; i++) {

                        if (referencias[i] == null) {

                            System.out.print("\nIngrese el nombre de la nueva referencia: ");
                            String nuevaReferencia = entrada.nextLine();

                            referencias[i] = nuevaReferencia;

                            System.out.println("Referencia agregada correctamente.");

                            agregado = true;
                            break;
                        }
                    }

                    if (agregado == false) {
                        System.out.println("No hay espacios disponibles.");
                    }
                    break;

                case 4:
                    System.out.println("\nSaliendo del programa...");
                    break;

                default:
                    System.out.println("\nOpcion no valida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 4);

        entrada.close();
    }
}