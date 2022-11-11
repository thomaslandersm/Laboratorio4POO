public class Radio {
    private String banda;
    private int volumen;
    private boolean encendido;
    private float emisora;

    public Radio(){
        banda = "FM";
        volumen = 0;
        encendido = false;
        emisora = (float) 92.5;
    }


    public float getEmisora() {
        return this.emisora;
    }

    public void setEmisora(float emisora) {
        this.emisora = emisora;
    }

    public String getBanda() {
        return this.banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public int getVolumen() {
        return this.volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public boolean isEncendido() {
        return this.encendido;
    }

    public boolean getEncendido() {
        return this.encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

}
