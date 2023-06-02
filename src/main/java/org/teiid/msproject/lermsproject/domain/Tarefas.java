package org.teiid.msproject.lermsproject.domain;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name = "tarefas")
public class Tarefas
 {

     @Id
     @GeneratedValue(generator = "increment")
     //@SequenceGenerator (name = "tournament_seq", sequenceName = "tournament_seq", initialValue = 100)
     private int id;
     private int idtarefaprincipal;
     private String nometarefa;
     private String recurso;

    public float getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public float getIdtarefaprincipal () {
        return idtarefaprincipal;
    }

    public void setIdtarefaprincipal (int idtarefaprincipal) {
        this.idtarefaprincipal = idtarefaprincipal;
    }

    public String getNometarefa () {
        return nometarefa;
    }

    public void setNometarefa (String nometarefa) {
        this.nometarefa = nometarefa;
    }

    public String getRecurso () {
        return recurso;
    }

    public void setRecurso (String recurso) {
        this.recurso = recurso;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefas)) return false;

        Tarefas tarefas = (Tarefas) o;

        if (Float.compare(tarefas.id, id) != 0) return false;
        if (Float.compare(tarefas.idtarefaprincipal, idtarefaprincipal) != 0) return false;
        if (nometarefa != null ? !nometarefa.equals(tarefas.nometarefa) : tarefas.nometarefa != null) return false;
        if (recurso != null ? !recurso.equals(tarefas.recurso) : tarefas.recurso != null) return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = (id != +0.0f ? Float.floatToIntBits(id) : 0);
        result = 31 * result + (idtarefaprincipal != +0.0f ? Float.floatToIntBits(idtarefaprincipal) : 0);
        result = 31 * result + (nometarefa != null ? nometarefa.hashCode() : 0);
        result = 31 * result + (recurso != null ? recurso.hashCode() : 0);
        return result;
    }

    @Override
    public String toString () {
        return "Tarefas{" +
                "id=" + id +
                ", idtarefaprinciaal=" + idtarefaprincipal +
                ", nometarefa='" + nometarefa + '\'' +
                ", recurso='" + recurso + '\'' +
                '}';
    }
}
