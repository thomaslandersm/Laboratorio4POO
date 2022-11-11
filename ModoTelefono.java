/**
 * ModoTelefono
 * 
 * Jose Alejandro Prince Martinez & Thomas Landers Molina
 * Programación Orientada a Objetos
 * Laboratorio 4
 */
public interface ModoTelefono {
    public boolean ConectDesconectTelefono();
    public String MostrarContactos();
    public String LlamarContactos(String numContacto);
    public String FinalizarLlamada();
    public boolean CambiarSpeaker();
}
