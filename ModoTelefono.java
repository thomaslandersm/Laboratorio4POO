public interface ModoTelefono {
    public boolean ConectDesconectTelefono();
    public String MostrarContactos();
    public String LlamarContactos(String numContacto);
    public String FinalizarLlamada();
    public boolean CambiarSpeaker();
}
