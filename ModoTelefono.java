/**
 * ModoTelefono
 * 
 * Jose Alejandro Prince Martinez & Thomas Landers Molina
 * Programación Orientada a Objetos
 * Laboratorio 4
 */
public interface ModoTelefono {
    /**
     * Funcion que conecta y desconecta el telefono
     * @return
     */
    public boolean ConectDesconectTelefono();
    /**
     * Funcion que muestra los contactos
     * @return
     */
    public String MostrarContactos();
    /**
     * Funcion que llama a un numero telefonico
     * @param numContacto
     * @return
     */
    public String LlamarContactos(String numContacto);
    /**
     * Funcion que finaliza una llamada
     * @return
     */
    public String FinalizarLlamada();
    /**
     * Funcion que cambia entre speaker y audifonos
     * @return
     */
    public boolean CambiarSpeaker();
}
