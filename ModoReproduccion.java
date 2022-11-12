/**
 * Reproducción
 * 
 * Jose Alejandro Prince Martinez & Thomas Landers Molina
 * Programación Orientada a Objetos
 * Laboratorio 4
 */
public interface ModoReproduccion {
    /**
     * Funcion que selecciona una lista de reproducción
     * @param num
     * @return
     */
    public String seleccionarLista(int num);
    /**
     * Funcion que cambia de canción
     * @return
     */
    public String cambiarCancion();
    /**
     * Funcion que reproduce una cancion
     * @return
     */
    public String escucharCancion();
}
