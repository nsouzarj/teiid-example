package org.teiid.msproject.lermsproject.servico;

import net.sf.mpxj.MPXJException;
import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.ResourceAssignment;
import net.sf.mpxj.ResourceAssignmentContainer;
import net.sf.mpxj.reader.UniversalProjectReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.teiid.msproject.lermsproject.domain.Tarefas;
import org.teiid.msproject.lermsproject.service.ServiceTarefas;

import java.util.ArrayList;
import java.util.List;
@Service
public class LerMsProject {

    @Autowired
    private ServiceTarefas serviceTarefas;
    UniversalProjectReader reader = new UniversalProjectReader();
    ProjectFile project = reader.read("Jurua_09fev23.mpp");
    ResourceAssignmentContainer resourceAssignments=project.getResourceAssignments();

    Tarefas tarefas = null;
    List<Tarefas> tarefasList = new ArrayList<>();

    public LerMsProject () throws MPXJException {
    }
    @Bean
    public void leraquivo(){

        for(ResourceAssignment resso:resourceAssignments){
            if(resso.getResource()!=null){
                tarefas= new Tarefas();
                tarefas.setIdtarefaprincipal(resso.getTask().getUniqueID());
                tarefas.setNometarefa(resso.getTask().getName());
                tarefas.setRecurso(resso.getResource().getName());
                serviceTarefas.salvarTarefa(tarefas);
                tarefasList.add(tarefas);
            }
        }

        System.out.println("Tarefas "+serviceTarefas.tarefasList());


    }


}
