import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String rpa = "";
        int elegir = 0;
        boolean conectividad = false;

        Dispositivo radioA = new Dispositivo();
        
        System.out.println("¿Desea encender la radio? si/no");
        rpa = teclado.nextLine();

        if (rpa.equalsIgnoreCase("si")){
                boolean ejecucion = radioA.encenderApagar();
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
                                                    int nuevoVolumen = radioA.cambiarVolumen();
                                                    System.out.println("Se cambio el volumen a " + nuevoVolumen);
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
                                        System.out.println("\n1. Seleccionar lista de reproducción\n2. Escuchar canción\n3. Cambiar canción\n4. Cambiar volumen\n5. Cambiar modalidad\n");
                                        
                                        try {
                                            elegir = teclado.nextInt();
                                            teclado.nextLine();

                                            switch (elegir) {
                                                case 1:
                                                    
                                                    break;
                                            
                                                case 2:
                                                    String escuchar = radioA.escucharCancion();
                                                    System.out.println(escuchar);
                                                    break;
                                                case 3:
                                                    String cambio = radioA.cambiarCancion();
                                                    System.out.println(cambio);
                                                    break;
                                                case 4:
                                                    int nuevoVolumen = radioA.cambiarVolumen();
                                                    System.out.println("Se cambio el volumen a " + nuevoVolumen);
                                                    /*System.out.println("¿A cuánto quiere que este el volumen?");
                                                    try {
                                                        int volumen = teclado.nextInt();
                                                        teclado.nextLine();
                                                        radioA.cambiarVolumen();

                                                        System.out.println("El volumen actual es de " + volumen);
                                                    } catch (Exception e) {
                                                        teclado.nextInt();
                                                        System.out.println("Valor incorrecto para el volumen");
                                                    }*/
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
                                    System.out.println("¿Desea conectar su telefono? si/no");
                                    rpa = teclado.nextLine();
                                    boolean telefonear = radioA.ConectDesconectTelefono();
                                    if (rpa.equalsIgnoreCase("si"))
                                    while (telefonear) {
                                        System.out.println("\n1. Mostrar contactos\n2. Llamar contactos\n3. Cambiar salida de audio\n4. Cambiar volukmen\n5. Conectar/Desconectar teléfono\n6. Cambiar modalidad\n");
                                        
                                        try {
                                            elegir = teclado.nextInt();
                                            teclado.nextLine();

                                            switch (elegir) {
                                                case 1:
                                                    String contactos = radioA.MostrarContactos();
                                                    System.out.println(contactos);
                                                    break;
                                            
                                                case 2:
                                                    System.out.println("Marque el número al que quiere llamar:");
                                                    String telefono = teclado.nextLine();
                                                    String llamada = radioA.LlamarContactos(telefono);
                                                    System.out.println(llamada);
                                                    break;
                                                case 3:
                                                    System.out.println("¿Por donde quiere escuchar el audio? speaker/audifonos");
                                                    rpa = teclado.nextLine();
                                                    if (rpa.equalsIgnoreCase("speaker")){
                                                        boolean speaAudi = radioA.CambiarSpeaker();
                                                        System.out.println("La salida de audio es el speaker");
                                                    } else if (rpa.equalsIgnoreCase("audifonos")){
                                                        System.out.println("La salida de audio son los audifinos");
                                                    } else {
                                                        System.out.println("No se reconoce esta salida de audio");
                                                    }
                                                    break;
                                                case 4:
                                                    int nuevoVolumen = radioA.cambiarVolumen();
                                                    System.out.println("Se cambio el volumen a " + nuevoVolumen);
                                                    break;
                                                case 5:
                                                    if (conectividad == false){
                                                        System.out.println("¿Desea conectar su teléfono? si/no\n");
                                                        String conexion = teclado.nextLine();
                                                        if (conexion.equalsIgnoreCase("si")){
                                                            boolean conexiones = radioA.ConectDesconectTelefono();
                                                            System.out.println("Se conecto el teléfono");
                                                        } else if (conexion.equalsIgnoreCase("no")){
                                                            System.out.println("No se conecto el telefono");
                                                        } else {
                                                            System.out.println("Esa opción es inválida");
                                                        }
                                                    } else {
                                                        System.out.println("¿Desea desconectar su telédono? si/no");
                                                        String conexion = teclado.nextLine();
                                                        if (conexion.equalsIgnoreCase("si")){
                                                            System.out.println("Se desconecto el teléfono");
                                                        } else if (conexion.equalsIgnoreCase("no")){
                                                            System.out.println("No se desconecto el telefono");
                                                        } else {
                                                            System.out.println("Esa opción es inválida");
                                                        }
                                                    }
                                                    break;
                                                case 6:
                                                    telefonear = false;
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