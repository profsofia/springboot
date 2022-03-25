
package service;

import com.pruba.springBootWeb.repository.PersonaRepository;
import java.util.List;
import model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PersonaService implements IPersonaService {

    
    
    //hacemos la inyeccion de dependencia
    @Autowired
    public PersonaRepository persRepo;
    
    @Override
    public List<Persona> verPersonas() {
        //nos retorna la lista de personas
     return persRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
     //metodo para guardar
     persRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
     persRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
       return persRepo.findById(id).orElse(null);
    }
    
}
