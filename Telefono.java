public class Telefono {
    private String[] contactos;
    private String[] numeros;

    public Telefono(){
        contactos = new String[10];
        numeros =new String[10];
    }


    public String[] getContactos() {
        return this.contactos;
    }

    public void setContactos(String[] contactos) {
        this.contactos = contactos;
    }

    public String[] getNumeros() {
        return this.numeros;
    }

    public void setNumeros(String[] numeros) {
        this.numeros = numeros;
    }

    public void llenarContactos(){
        contactos[0] = "Papá luchon";
        numeros[0] = "42589592";
        contactos[1] = "La Matriarca";
        numeros[1] = "41283332";
        contactos[2] = "Alejandra";
        numeros[2] = "39260500";
        contactos[3] = "Tia Alexa";
        numeros[3] = "47668882";
        contactos[4] = "Eduardo";
        numeros[4] = "50162449";
        contactos[5] = "Primo Juan";
        numeros[5] = "42196299";
        contactos[6] = "LuisFer";
        numeros[6] = "40497772";
        contactos[7] = "Gerardo";
        numeros[7] = "30115547";
        contactos[8] = "Abuela";
        numeros[8] = "56951731";
        contactos[9] = "Amorcito";
        numeros[9] = "42006918";

    }
}

