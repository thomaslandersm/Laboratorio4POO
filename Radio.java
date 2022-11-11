/**
 * Radio
 * 
 * Jose Alejandro Prince Martinez & Thomas Landers Molina
 * Programación Orientada a Objetos
 * Laboratorio 4
 */
public class Radio {
    private String banda;
    private int volumen;
    private boolean encendido;
    private float emisora;

/**
 * 
 */

    public Radio(){
        banda = "FM";
        volumen = 75;
        encendido = false;
        emisora = (float) 92.5;
    }


    
    /** 
     * @return float
     */
    public float getEmisora() {
        return this.emisora;
    }

    
    /** 
     * @param emisora
     */
    public void setEmisora(float emisora) {
        this.emisora = emisora;
    }

    
    /** 
     * @return String
     */
    public String getBanda() {
        return this.banda;
    }

    
    /** 
     * @param banda
     */
    public void setBanda(String banda) {
        this.banda = banda;
    }

    
    /** 
     * @return int
     */
    public int getVolumen() {
        return this.volumen;
    }

    
    /** 
     * @param volumen
     */
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    
    /** 
     * @return boolean
     */
    public boolean isEncendido() {
        return this.encendido;
    }

    
    /** 
     * @return boolean
     */
    public boolean getEncendido() {
        return this.encendido;
    }

    
    /** 
     * @param encendido
     */
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

}
