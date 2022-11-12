/**
 * Dispositivo
 * 
 * Jose Alejandro Prince Martinez & Thomas Landers Molina
 * Programación Orientada a Objetos
 * Laboratorio 4
 */
import java.util.ArrayList;
import java.util.Random;

public class Dispositivo implements ModoTelefono,ModoProductividad,RadioA,ModoRadio,ModoReproduccion{
    private Radio radio;
    private Telefono tel;
    private Musica temas;
    private float[] emisoras;
    private ArrayList<Float> emisorasGuardadas;
    private String[] emisorasNombre;

    public Dispositivo(){
        radio = new Radio();
        tel = new Telefono();
        temas = new Musica();
        emisoras = new float[52];
        emisorasGuardadas = new ArrayList<Float>();
        emisorasNombre = new String[52];
  
    }

    
    /** 
     * @return Radio
     */
    public Radio getRadio() {
        return this.radio;
    }

    
    /** 
     * @param radio radio to set
     */
    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    
    /** 
     * @return Telefono
     */
    public Telefono getTel() {
        return this.tel;
    }

    
    /** 
     * @param tel tel to set
     */
    public void setTel(Telefono tel) {
        this.tel = tel;
    }

    
    /** 
     * @return Musica
     */
    public Musica getTemas() {
        return this.temas;
    }

    
    /** 
     * @param temas temas to set
     */
    public void setTemas(Musica temas) {
        this.temas = temas;
    }

    
    /** 
     * @return float[]
     */
    public float[] getEmisoras() {
        return this.emisoras;
    }

    
    /** 
     * @param emisoras emisoras to set
     */
    public void setEmisoras(float[] emisoras) {
        this.emisoras = emisoras;
    }

    
    /** 
     * @return ArrayList<Float>
     */
    public ArrayList<Float> getEmisorasGuardadas() {
        return this.emisorasGuardadas;
    }

    
    /** 
     * @param emisorasGuardadas emisorasGuardadas to set
     */
    public void setEmisorasGuardadas(ArrayList<Float> emisorasGuardadas) {
        this.emisorasGuardadas = emisorasGuardadas;
    }

    
    /** 
     * @return String[]
     */
    public String[] getEmisorasNombre() {
        return this.emisorasNombre;
    }

    
    /** 
     * @param emisorasNombre emisorasnombre to set
     */
    public void setEmisorasNombre(String[] emisorasNombre) {
        this.emisorasNombre = emisorasNombre;
    }

    /**
     * Funcion que da todas las emisoras de la radio
     */
    public void llenarDispositivo(){
        emisoras[0] = (float) 87.5;
        emisorasNombre[0] = "Asi Fue Mi Vida";
        
        emisoras[1] = (float) 88.1;
        emisorasNombre[1] = "Fabuestéreo";
            
        emisoras[2] = (float) 88.5;
        emisorasNombre[2] = "Galaxia La Picosa";

        emisoras[3] = (float) 88.9;
        emisorasNombre[3] = "Fabulosa";

        emisoras[4] = (float) 89.3;
        emisorasNombre[4] = "Estrella";

        emisoras[5] = (float) 89.7;
        emisorasNombre[5] = "Emisoras Unidas";

        emisoras[6] = (float) 90.1;
        emisorasNombre[6] = "YoSi Sideral";

        emisoras[7] = (float) 90.5;
        emisorasNombre[7] = "Radio Punto";

        emisoras[8] = (float) 90.9;
        emisorasNombre[8] = "Radio Éxitos";

        emisoras[9] = (float) 91.3;
        emisorasNombre[9] = "KeBuena";

        emisoras[10] = (float) 91.7;
        emisorasNombre[10] = "Rhema Stereo";

        emisoras[11] = (float) 92.1;
        emisorasNombre[11] = "Radio Universidad";

        emisoras[12] = (float) 92.5;
        emisorasNombre[12] = "Más Música";

        emisoras[13] = (float) 92.9;
        emisorasNombre[13] = "Flix FM";

        emisoras[14] = (float) 93.3;
        emisorasNombre[14] = "Joya";

        emisoras[15] = (float) 93.7;
        emisorasNombre[15] = "Mia 93.7";

        emisoras[16] = (float) 94.1;
        emisorasNombre[16] = "La Marca";

        emisoras[17] = (float) 94.5;
        emisorasNombre[17] = "La Sabrosona";

        emisoras[18] = (float) 94.9;
        emisorasNombre[18] = "949 Radio";

        emisoras[19] = (float) 95.3;
        emisorasNombre[19] = "Radio Viva";

        emisoras[20] = (float) 95.7;
        emisorasNombre[20] = "Radio Ranchera";

        emisoras[21] = (float) 96.1;
        emisorasNombre[21] = "Radio Nuevo Mundo";

        emisoras[22] = (float) 96.5;
        emisorasNombre[22] = "Atmósfera 96.5";

        emisoras[23] = (float) 96.9;
        emisorasNombre[23] = "Radio Sonora";

        emisoras[24] = (float) 97.3;
        emisorasNombre[24] = "Alfa 97.3";

        emisoras[25] = (float) 97.7;
        emisorasNombre[25] = "Kiss 977";

        emisoras[26] = (float) 98.1;
        emisorasNombre[26] = "Ilumina FM";

        emisoras[27] = (float) 98.5;
        emisorasNombre[27] = "Radio Mundial";

        emisoras[28] = (float) 98.9;
        emisorasNombre[28] = "Globo 98.9";

        emisoras[29] = (float) 99.3;
        emisorasNombre[29] = "La Grande 99.3";

        emisoras[30] = (float) 99.7;
        emisorasNombre[30] = "El Camino";

        emisoras[31] = (float) 100.1;
        emisorasNombre[31] = "Radio Infinita";

        emisoras[32] = (float) 100.5;
        emisorasNombre[32] = "Radio Cultural";

        emisoras[33] = (float) 100.9;
        emisorasNombre[33] = "Actitud FM";

        emisoras[34] = (float) 101.3;
        emisorasNombre[34] = "Extrema 101.3";

        emisoras[35] = (float) 101.7;
        emisorasNombre[35] = "Exa FM";

        emisoras[36] = (float) 102.1;
        emisorasNombre[36] = "Libertópolis";

        emisoras[37] = (float) 102.5;
        emisorasNombre[37] = "Fama 102.5";

        emisoras[38] = (float) 102.9;
        emisorasNombre[38] = "Caliente 102.9";

        emisoras[39] = (float) 103.3;
        emisorasNombre[39] = "Radio María (Guatemala)";

        emisoras[40] = (float) 103.7;
        emisorasNombre[40] = "Fiesta 103.7";

        emisoras[41] = (float) 104.1;
        emisorasNombre[41] = "Stereo Visión";

        emisoras[42] = (float) 104.5;
        emisorasNombre[42] = "Radio Faro Cultural";

        emisoras[43] = (float) 104.9;
        emisorasNombre[43] = "Tropicálida";

        emisoras[44] = (float) 105.3;
        emisorasNombre[44] = "Romántica";

        emisoras[45] = (float) 105.7;
        emisorasNombre[45] = "Unión Radio";

        emisoras[46] = (float) 106.1;
        emisorasNombre[46] = "La Red";

        emisoras[47] = (float) 106.5;
        emisorasNombre[47] = "Clásica 106.5";

        emisoras[48] = (float) 106.9;
        emisorasNombre[48] = "Radio Sónica";

        emisoras[49] = (float) 107.3;
        emisorasNombre[49] = "Radio Nacional";

        emisoras[50] = (float) 107.7;
        emisorasNombre[50] = "La Mega";

    }

    /** 
     * @return boolean
     * Modela la funcion de conectar y desconectar el teléfono
     */
    public boolean ConectDesconectTelefono(){
        return true;
    }

    
    /** 
     * @return String
     * Modela la función que muestra los contactos
     */
    public String MostrarContactos(){
        tel.llenarContactos();
        int i = 0;
        String telefono = "";
        String contactos = "";
        String[] tels = tel.getContactos();
        String[] nums = tel.getNumeros();
        for (String contacto : tels) {
            telefono = contacto + "\nNúmero telefonico: " + nums[i] + "\n";
            contactos += telefono;     
            i++;
        }
        return contactos;
    }

    /** 
     * @param numContacto
     * @return String
     * Modela la funcion para llamar a un número telefónico
     */
    public String LlamarContactos(String numContacto){
        String llamada = "Se ha llamado a " + numContacto + ". \nLa plática fue larga y divertida.\n" + FinalizarLlamada();
        return llamada;
    }

    
    /** 
     * @return String
     * Modela la función que finaliza una llamada
     */
    public String FinalizarLlamada(){
        return "Se ha finalizado la llamada";
    }

    
    /** 
     * @return boolean
     * Modela la función que cambia la salida de audio
     */
    public boolean CambiarSpeaker(){
        return true;
    }

    
    /** 
     * @param direccion
     * @return String
     * Modela la funcion que planifica un viaje
     */
    public String PlanificarViajes(String direccion){
        return "Se ha creado una ruta hacia " + direccion;
    }

    
    /** 
     * @return boolean
     * Modela la función que enciendo o apaga el
     */
    public boolean encenderApagar(){
        radio.setEncendido(true);
        boolean estado = radio.getEncendido();
        return estado;
    }
   
   /** 
    * @param a
    * @return int
    * Modela la función que cambia el volumen del dispositivo
    */
    public int cambiarVolumen(int a){
        int volumen = radio.getVolumen();
            if(a > 0){
                volumen += a;
            }
            else{
                if(volumen > 0){
                    volumen += a;
                }
            }
            return volumen;
    }

    
    /** 
     * @return boolean
     * Modela la función que cambia la banda de frecuencia
     */
    public boolean cambiarFMAM(){
        radio.setBanda("AM");
        return true;
    }

    
    /** 
     * @return float
     * MOdela la funcion que cambia de emisora
     */
    public float cambiarEmisora(){
        llenarDispositivo();

        int i = 0;
        float nuevaEmisora = 0;

        if (radio.getEmisora() == emisoras[50]){
            nuevaEmisora = emisoras[0];
            radio.setEmisora(nuevaEmisora);
        }

        while(i < emisoras.length){
            if (emisoras[i] == radio.getEmisora()){
                nuevaEmisora = emisoras[i+1];

            }
            i++;
        }
        radio.setEmisora(nuevaEmisora);

        return nuevaEmisora;
    }

    public void guardarEmisora(){
        float emisora = radio.getEmisora();
        emisorasGuardadas.add(emisora);
    }

    /**
 * 
 */
    
    /** 
     * @return String
     * Modela la función que carga una emisora guardada
     */
    public String cargarEmisora(){
        llenarDispositivo();
        Random carga = new Random();
        String estacion = "";
        int i = 0;
        int indice = 0;

        if (emisorasGuardadas.size() <= 0){
            estacion = "No se puede cargar ninguna emisora, ya que no hay emisoras guardadas";
        } else {
            float emisoraCarga = carga.nextInt(0,emisorasGuardadas.size()-1);
            radio.setEmisora(emisoraCarga);
        }

        while(i < emisoras.length){
            if (emisoras[i] == radio.getEmisora()){
                if (i == emisoras.length){
                    i = 0;
                    indice = i;
                }
                indice = i;

            }
            i++;
        }

        estacion = "\nBanda: " + radio.getBanda() + "\nEmisora: " + emisorasNombre[indice] + "\nFrecuencia: " + radio.getEmisora();
        
        return estacion;
    }

    /**
 * 
 */

    /** 
     * @param num
     * @return String
     * Modela una función que selecciona una lista de reproducción
     */
    public String seleccionarLista(int num){
        temas.llenarMusica();
        String[] lista = temas.getListaReprod();
        String listaEscogida = lista[num];
        return "Has decidido escuchar la playlist: " + listaEscogida;
    }

    /**
 * 
 */
    
    /** 
     * @return String
     * Modela la función que cambia de canción
     */
    public String cambiarCancion(){
        temas.llenarMusica();
        Random numCancion = new Random();
        int eleccion = numCancion.nextInt(0,19);
        String[] canciones = temas.getCanciones();
        String[] autores = temas.getAutores();
        String[] duracion = temas.getDuracion();
        String[] generos = temas.getGeneros(); 

        String cancionElegida = "Ahora esta escuchando:\n\nCanción: " + canciones[eleccion] +"\nAutor: "+ autores[eleccion] +"\nGénero: "+ generos[eleccion] +"\nDuración: "+ duracion[eleccion];
        return cancionElegida;
    }

    /** 
     * @return String
     * Modela la funcion que reproduce una canción
     */
    public String escucharCancion(){
        temas.llenarMusica();
        String[] canciones = temas.getCanciones();
        String[] autores = temas.getAutores();
        String[] duracion = temas.getDuracion();
        String[] generos = temas.getGeneros();

        String cancionEscuchar = "Va a escuchar:\n\nCanción: " + canciones[0] +"\nAutor: "+ autores[0] +"\nGénero: "+ generos[0] +"\nDuración: "+ duracion[0];
        return cancionEscuchar;
    }
}


