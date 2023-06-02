package org.teiid.msproject.lermsproject.repositiry;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.teiid.msproject.lermsproject.domain.Tarefas;

@Repository
public interface TarefasRepository extends JpaRepository<Tarefas,Long> {
}
