
package Entidades;

public class Cadena {
    private String frase;
    private int log;
    private char vocal;

    public Cadena() {
    }

    public Cadena(String frase, int log, char vocal) {
        this.frase = frase;
        this.log = log;
        this.vocal = vocal;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLog() {
        return log;
    }

    public void setLog(int log) {
        this.log = log;
    }

    public char getVocal() {
        return vocal;
    }

    public void setVocal(char vocal) {
        this.vocal = vocal;
    }
    
    
}
