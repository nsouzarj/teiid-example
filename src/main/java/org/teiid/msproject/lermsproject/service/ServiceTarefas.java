package org.teiid.msproject.lermsproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.teiid.msproject.lermsproject.domain.Tarefas;
import org.teiid.msproject.lermsproject.repositiry.TarefasRepository;

import java.util.List;

@Service
public class ServiceTarefas {
    @Autowired
    private TarefasRepository tarefasRepository;
    public void salvarTarefa(Tarefas tarefas){
        tarefasRepository.save(tarefas);
    }

    public List<Tarefas> tarefasList(){
       return tarefasRepository.findAll();
    }
}
