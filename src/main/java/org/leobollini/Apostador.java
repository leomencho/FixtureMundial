package org.leobollini;

import java.util.HashSet;
import java.util.Set;

public class Apostador {

    public Apostador(int id, Boolean local, Boolean empate, Boolean visitante) {
        this.id = id;
        this.local = local;
        this.empate = empate;
        this.visitante = visitante;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private Boolean local;
    private Boolean empate;
    private Boolean visitante;

    public Boolean getLocal() {
        return local;
    }

    public void setLocal(Boolean local) {
        this.local = local;
    }

    public Boolean getEmpate() {
        return empate;
    }

    public void setEmpate(Boolean empate) {
        this.empate = empate;
    }

    public Boolean getVisitante() {
        return visitante;
    }

    public void setVisitante(Boolean visitante) {
        this.visitante = visitante;
    }

    @Override
    public String toString() {
        return "Apostador{" +
                "id=" + id +
                ", local=" + local +
                ", empate=" + empate +
                ", visitante=" + visitante +
                '}';
    }
}
