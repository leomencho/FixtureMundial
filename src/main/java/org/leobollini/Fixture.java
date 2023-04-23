package org.leobollini;

public class Fixture {

    public Fixture() {
    }

    public Fixture(int id, String equipoLocal, Integer golesLocal, String equipoVisitante, Integer golesVisitante) {
        this.id = id;
        EquipoLocal = equipoLocal;
        GolesLocal = golesLocal;
        EquipoVisitante = equipoVisitante;
        GolesVisitante = golesVisitante;
    }

    private int id;
    private String EquipoLocal;
    private Integer GolesLocal;

    private String EquipoVisitante;
    private Integer GolesVisitante;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEquipoLocal() {
        return EquipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        EquipoLocal = equipoLocal;
    }

    public Integer getGolesLocal() {
        return GolesLocal;
    }

    public void setGolesLocal(Integer golesLocal) {
        GolesLocal = golesLocal;
    }

    public String getEquipoVisitante() {
        return EquipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        EquipoVisitante = equipoVisitante;
    }

    public Integer getGolesVisitante() {
        return GolesVisitante;
    }

    public void setGolesVisitante(Integer golesVisitante) {
        GolesVisitante = golesVisitante;
    }

    @Override
    public String toString() {
        return "Fixture{" +
                "id=" + id +
                ", EquipoLocal='" + EquipoLocal + '\'' +
                ", GolesLocal=" + GolesLocal +
                ", EquipoVisitante='" + EquipoVisitante + '\'' +
                ", GolesVisitante=" + GolesVisitante +
                '}';
    }
}
