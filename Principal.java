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

                                    System.out.println("¿Que banda elige? FM/AM");
                                    rpa = teclado.nextLine();
                                    boolean fm = rpa.equalsIgnoreCase("FM");
                                    boolean am = rpa.equalsIgnoreCase("AM");
                                    if (fm == false && am == false ){
                                        System.out.println("Ese tipo de banda no esta disponible");
                                    } else {

                                    while (modos) {
                                        if (rpa.equalsIgnoreCase("FM")){
                                            System.out.println("\n1. Cambiar de emisora\n2. Guardar Emisora\n3. Cargar emisora\n4. Cambiar volukmen\n5. Cambiar modalidad\n");

                                            try {
                                                elegir = teclado.nextInt();
                                                teclado.nextLine();

                                                switch (elegir) {
                                                    case 1:
                                                        float cambioEmisora = radioA.cambiarEmisora();
                                                        System.out.println("Ahora se esta escuchando la emisora: " + cambioEmisora);
                                                        break;
                                                    case 2:
                                                        System.out.println("Emisora guardada");
                                                        radioA.guardarEmisora();
                                                        break;
                                                    case 3:
                                                        System.out.println(radioA.cargarEmisora());
                                                        break;
                                                    case 4:
                                                        int a = teclado.nextint();
                                                        int nuevoVolumen = radioA.cambiarVolumen(a);
                                                        System.out.println("Se cambio el volumen a " + nuevoVolumen);
                                                        break;
                                                    case 5:
                                                        modos = false;
                                                        break;
                                                }
                                            } catch (Exception e) {
                                                teclado.nextLine();
                                                System.out.println("\nEsa opción no es válida para esta modalidad");
                                            }

                                        } else if (rpa.equalsIgnoreCase("AM")){
                                            radioA.cambiarFMAM();
                                            System.out.println("\n1. Cambiar de emisora\n2. Guardar Emisora\n3. Cargar emisora\n4. Cambiar volukmen\n5. Cambiar modalidad\n");

                                            try {
                                                elegir = teclado.nextInt();
                                                teclado.nextLine();

                                                switch (elegir) {
                                                    case 1:
                                                        float cambioEmisora = radioA.cambiarEmisora();
                                                        System.out.println("Ahora se esta escuchando la emisora: " + cambioEmisora);
                                                        break;
                                                    case 2:
                                                        System.out.println("Emisora guardada");
                                                        radioA.guardarEmisora();
                                                        break;
                                                    case 3:
                                                        System.out.println(radioA.cargarEmisora());
                                                        break;
                                                    case 4:
                                                        int nuevoVolumen = radioA.cambiarVolumen();
                                                        System.out.println("Se cambio el volumen a " + nuevoVolumen);
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
                                                    System.out.println("Ingrese un número:");
                                                    try {
                                                        int numero = teclado.nextInt();
                                                        teclado.nextLine();

                                                        String listaReproduccion = radioA.seleccionarLista(numero);
                                                        System.out.println(listaReproduccion);
                                                    } catch (Exception e) {
                                                        teclado.nextLine();
                                                        System.out.println("El número ingresado es invalido");
                                                    }
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
                                                    System.out.println("Ingrese el nombre del lugar al que quiere ir:");
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
