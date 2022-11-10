import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        boolean ejecucion = true;
        String rpa = "";
        int elegir = 0;

        Dispositivo radioA = new Dispositivo();
        
        System.out.println("¿Desea encender la radio? si/no");
        rpa = teclado.nextLine();

        if (rpa.equalsIgnoreCase("si")){
                    System.out.println("Bienvenido al sistema de radio");
                    
                    while (ejecucion){
                        System.out.println("\nEscoja el modo que quiere usar:");
                        System.out.println("\n1: Modo Radio\n2: Modo Reproducción\n3: Modo Telefono\n4: Modo Productividad\n5: Apagar la radio");
            
                        try {
                            elegir =teclado.nextInt();
                            teclado.nextLine();
                            
                            boolean modos = true;

                            switch (elegir) {
                                case 1:
                                    while (modos) {
                                        System.out.println("\n1. AM/FM\n2. Cambiar de emisora\n3. Guardar Emisora\n4. Cargar emisora\n5. Cambiar volukmen\n6. Cambiar modalidad\n");

                                        try {
                                            elegir = teclado.nextInt();
                                            teclado.nextLine();

                                            switch (elegir) {
                                                case 1:
                                                    
                                                    break;
                                            
                                                case 2:
                                                    break;
                                                case 3:
                                                    break;
                                                case 4:
                                                    break;
                                                case 5:
                                                    break;
                                                case 6:
                                                    modos = false;
                                                    break;
                                            }
                                        } catch (Exception e) {
                                            teclado.nextLine();
                                            System.out.println("\nEsa opción no es válida para esta modalidad");
                                        }
                                    }
                                    
                                    break;
                            
                                case 2:
                                    while (modos) {
                                        System.out.println("\n1. Seleccionar lista de reproducción\n2. Escuchar canción\n3. Cambiar canción\n4. Cambiar volukmen\n5. Cambiar modalidad\n");
                                        
                                        try {
                                            elegir = teclado.nextInt();
                                            teclado.nextLine();

                                            switch (elegir) {
                                                case 1:
                                                    
                                                    break;
                                            
                                                case 2:
                                                    break;
                                                case 3:
                                                    break;
                                                case 4:
                                                    break;
                                                case 5:
                                                    modos = false;
                                                    break;
                                            }
                                        } catch (Exception e) {
                                            teclado.nextLine();
                                            System.out.println("\nEsa opción no es válida para esta modalidad");
                                        }
                                    }
                                    break;
                                case 3:
                                    while (modos) {
                                        System.out.println("\n1. Mostrar contactos\n2. Llamar contactos\n3. Cambiar salida de audio\n4. Cambiar volukmen\n5. Cambiar modalidad\n");
                                        
                                        try {
                                            elegir = teclado.nextInt();
                                            teclado.nextLine();

                                            switch (elegir) {
                                                case 1:
                                                    
                                                    break;
                                            
                                                case 2:
                                                    break;
                                                case 3:
                                                    break;
                                                case 4:
                                                    break;
                                                case 5:
                                                    modos = false;
                                                    break;
                                            }
                                        } catch (Exception e) {
                                            teclado.nextLine();
                                            System.out.println("\nEsa opción no es válida para esta modalidad");
                                        }
                                    }
                                    break;
                                case 4:
                                    while (modos) {
                                        System.out.println("\n1. Planificar viaje\n2. Cambiar modalidad");
                                        
                                        try {
                                            elegir = teclado.nextInt();
                                            teclado.nextLine();

                                            switch (elegir) {
                                                case 1:
                                                    System.out.println("");
                                                    String direccion = teclado.nextLine();
                                                    String viaje = radioA.PlanificarViajes(direccion);
                                                    System.out.println(viaje);
                                                    break;
                                            
                                                case 2:
                                                    modos = false;
                                                    break;
                                            }
                                        } catch (Exception e) {
                                            teclado.nextLine();
                                            System.out.println("\nEsa opción no es válida para esta modalidad");
                                        }
                                    }
                                    break;
                                case 5:
                                    ejecucion = false;
                                    System.out.println("\nApagando el dispositivo...");
                                    break;
                            }
                        } catch (Exception e) {
                            teclado.nextLine();
                            System.out.println("\nEse modo no esta disponible\n");
                        }
            
                    }

        } else {
            System.out.println("\nSe ha decidio apagar la radio.\nTenga un feliz día");
        }
    }
}