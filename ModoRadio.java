/**
 * ModoRadio
 * 
 * Jose Alejandro Prince Martinez & Thomas Landers Molina
 * Programación Orientada a Objetos
 * Laboratorio 4
 */
public interface ModoRadio {
    /**
     * funcion para cambiar el tipo de banda
     * @return
     */
    public boolean cambiarFMAM();
    /**
     * Funcion que cambia de emisora
     */
    public float cambiarEmisora();
    /**
     * Funcion que guarda una emisora
     */
    public void guardarEmisora();
    /**
     * Funcion que carga una emisora guardada
     * @return
     */
    public String cargarEmisora();
}
