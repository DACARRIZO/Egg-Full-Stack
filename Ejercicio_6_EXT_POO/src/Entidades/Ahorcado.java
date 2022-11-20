/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author dacar
 */
public class Ahorcado {
    private String [] vectorPalabra;
    private String palabra;
    private int tamPalabra;
    private int letrasEncontradas;
    private int jugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] vectorPalabra, String palabra, int tamPalabra, int letrasEncontradas, int jugadas) {
        this.vectorPalabra = vectorPalabra;
        this.palabra = palabra;
        this.tamPalabra = tamPalabra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadas = jugadas;
    }

    public String[] getVectorPalabra() {
        return vectorPalabra;
    }

    public void setVectorPalabra(String[] vectorPalabra) {
        this.vectorPalabra = vectorPalabra;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getTamPalabra() {
        return tamPalabra;
    }

    public void setTamPalabra(int tamPalabra) {
        this.tamPalabra = tamPalabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }
    
}
