
package Entidades;

public class Curso {
    private String NomCurso;
    private int CantHorDia;
    private int CantDiaxSem;
    private String turno;
    private double PrecHora;
    private String alumnos []=new String [5];

    public Curso() {
    }

    public Curso(String NomCurso, int CantHorDia, int CantDiaxSem, String turno, double PrecHora, String[] alumnos) {
        this.NomCurso = NomCurso;
        this.CantHorDia = CantHorDia;
        this.CantDiaxSem = CantDiaxSem;
        this.turno = turno;
        this.PrecHora = PrecHora;
        this.alumnos = alumnos;
    }

    public String getNomCurso() {
        return NomCurso;
    }

    public void setNomCurso(String NomCurso) {
        this.NomCurso = NomCurso;
    }

    public int getCantHorDia() {
        return CantHorDia;
    }

    public void setCantHorDia(int CantHorDia) {
        this.CantHorDia = CantHorDia;
    }

    public int getCantDiaxSem() {
        return CantDiaxSem;
    }

    public void setCantDiaxSem(int CantDiaxSem) {
        this.CantDiaxSem = CantDiaxSem;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecHora() {
        return PrecHora;
    }

    public void setPrecHora(double PrecHora) {
        this.PrecHora = PrecHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

 
}
