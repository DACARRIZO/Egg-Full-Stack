/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas
 */
package Contructores;

public class Libros {
    private String ISBN;
    private String titulo;
    private String autor;
    private int NumPag;

    public Libros() {
    }

    public Libros(String ISBN, String titulo, String autor, int NumPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.NumPag = NumPag;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return NumPag;
    }

    public void setNumPag(int NumPag) {
        this.NumPag = NumPag;
    }

    @Override
    public String toString() {
        return "Libros{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", NumPag=" + NumPag + '}';
    }
    
            
}
