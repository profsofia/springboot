
package service;

import java.util.List;
import model.Persona;

public interface IPersonaService {
    //metodos sin implementación
    public List<Persona> verPersonas();
    public void crearPersona (Persona per);
    public void borrarPersona (Long id);
    public Persona buscarPersona (Long id);
}
