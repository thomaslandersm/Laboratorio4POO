public class Musica {
    private String[] canciones;
    private String[] duracion;
    private String[] autores;
    private String[] generos;
    private String[] listaReprod;

    public Musica(){
        canciones = new String[20];
        duracion = new String[20];
        autores = new String[20];
        generos = new String[20];
        listaReprod = new String[3];
    }


    public String[] getCanciones() {
        return this.canciones;
    }

    public void setCanciones(String[] canciones) {
        this.canciones = canciones;
    }

    public String[] getDuracion() {
        return this.duracion;
    }

    public void setDuracion(String[] duracion) {
        this.duracion = duracion;
    }

    public String[] getAutores() {
        return this.autores;
    }

    public void setAutores(String[] autores) {
        this.autores = autores;
    }

    public String[] getGeneros() {
        return this.generos;
    }

    public void setGeneros(String[] generos) {
        this.generos = generos;
    }

    public String[] getListaReprod() {
        return this.listaReprod;
    }

    public void setListaReprod(String[] listaReprod) {
        this.listaReprod = listaReprod;
    }

    public void llenarMusica(){
        canciones[0] = "Imagine";
        duracion[0] = "3:53";
        autores[0] = "John Lennon";
        generos[0] = "Pop";
        
        canciones[1] = "Johnny B. Goode";
        duracion[1] = "2:59";
        autores[1] = "Chuck Berry";
        generos[1] = "Rock";
        
        canciones[2] = "Back in Black";
        duracion[2] = "4:14";
        autores[2] = "AC/DC";
        generos[2] = "Rock";
        
        canciones[3] = "Bohemian Rhapsody";
        duracion[3] = "5:59";
        autores[3] = "Queen";
        generos[3] = "Hard rock";
        
        canciones[4] = "Billie Jean";
        duracion[4] = "4:55";
        autores[4] = "Michael Jackson";
        generos[4] = "Funk";
        
        canciones[5] = "Dont' stop believin'";
        duracion[5] = "4:10";
        autores[5] = "Journey";
        generos[5] = "Pop";
        
        canciones[6] = "Welcome to the jungle";
        duracion[6] = "4:39";
        autores[6] = "Guns N' Roses";
        generos[6] = "Rock";
        
        canciones[7] = "Hotel California";
        duracion[7] = "6:31";
        autores[7] = "the Eagles";
        generos[7] = "Rock";
        
        canciones[8] = "Hallelujah";
        duracion[8] = "7:20";
        autores[8] = "Leonard Cohen";
        generos[8] = "Folk rock";
        
        canciones[9] = "Gwyn Theme";
        duracion[9] = "3:39";
        autores[9] = "Motoi Sakuraba";
        generos[9] = "Soundtrack";
        
        canciones[10] = "Magalovania";
        duracion[10] = "5:13";
        autores[10] = "Toby Fox";
        generos[10] = "Soundtrack";
        
        canciones[11] = "Death by Glamour";
        duracion[11] = "2:14";
        autores[11] = "Toby Fox";
        generos[11] = "Soundtrack";
        
        canciones[12] = "Battle Against a True Hero";
        duracion[12] = "2:36";
        autores[12] = "Toby Fox";
        generos[12] = "Soundtrack";
        
        canciones[13] = "Cornfield Chase";
        duracion[13] = "2:06";
        autores[13] = "Hans Zimmer";
        generos[13] = "Soundtrack";
        
        canciones[14] = "Duel of the Fates";
        duracion[14] = "4:13";
        autores[14] = "John Williams";
        generos[14] = "Música clásica";
        
        canciones[15] = "Unravel";
        duracion[15] = "4:02";
        autores[15] = "Toru Kitajima";
        generos[15] = "J-Rock";
        
        canciones[16] = "Gas Gas Gas";
        duracion[16] = "3:16";
        autores[16] = "Manuel";
        generos[16] = "Dance/Electrónica";
        
        canciones[17] = "Deja Vu";
        duracion[17] = "4:25";
        autores[17] = "Dave Rogers";
        generos[17] = "Dance/Electr+onica";
        
        canciones[18] = "Radio Ga Ga";
        duracion[18] = "5:53";
        autores[18] = "Queen";
        generos[18] = "Pop";
        
        canciones[19] = "Silhouette";
        duracion[19] = "4:26";
        autores[19] = "Kana-Boon";
        generos[19] = "J-Rock";
        
        listaReprod[0] = "Musica Relajante";
        listaReprod[1] = "La depresion";
        listaReprod[2] = "Party Hard";
    }
}
