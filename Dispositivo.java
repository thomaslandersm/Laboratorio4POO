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

    public Radio getRadio() {
        return this.radio;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public Telefono getTel() {
        return this.tel;
    }

    public void setTel(Telefono tel) {
        this.tel = tel;
    }

    public Musica getTemas() {
        return this.temas;
    }

    public void setTemas(Musica temas) {
        this.temas = temas;
    }

    public float[] getEmisoras() {
        return this.emisoras;
    }

    public void setEmisoras(float[] emisoras) {
        this.emisoras = emisoras;
    }

    public ArrayList<Float> getEmisorasGuardadas() {
        return this.emisorasGuardadas;
    }

    public void setEmisorasGuardadas(ArrayList<Float> emisorasGuardadas) {
        this.emisorasGuardadas = emisorasGuardadas;
    }

    public String[] getEmisorasNombre() {
        return this.emisorasNombre;
    }

    public void setEmisorasNombre(String[] emisorasNombre) {
        this.emisorasNombre = emisorasNombre;
    }

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

    public boolean ConectDesconectTelefono(){
        return true;
    }

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

    public String LlamarContactos(String numContacto){
        String llamada = "Se ha llamado a " + numContacto + ". \nLa plática fue larga y divertida.\n" + FinalizarLlamada();
        return llamada;
    }

    public String FinalizarLlamada(){
        return "Se ha finalizado la llamada";
    }

    public boolean CambiarSpeaker(){
        return true;
    }

    public String PlanificarViajes(String direccion){
        return "Se ha creado una ruta hacia " + direccion;
    }

    public boolean encenderApagar(){
        radio.setEncendido(true);
        boolean estado = radio.getEncendido();
        return estado;
    }
   public int cambiarVolumen(int a){
        if(estadoRadio){
            if(a > 0){
                volumen += a;
            }
            else{
                if(volumen > 0){
                    volumen += a;
                }
            }
            return volumen;
        } else return -1;
    }

    public boolean cambiarFMAM(){
        radio.setBanda("AM");
        return true;
    }

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

    public String seleccionarLista(int num){
        temas.llenarMusica();
        String[] lista = temas.getListaReprod();
        String listaEscogida = lista[num];
        return "Has decidido escuchar la playlist: " + listaEscogida;
    }

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


