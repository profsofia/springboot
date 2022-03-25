
package com.pruba.springBootWeb.Controller;

import java.util.List;
import model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import service.IPersonaService;

//para indicarle al framework que esta va a ser la clase controladora.
@RestController
public class Controller {
    
    //inyectamos la dependencia
    @Autowired
            private IPersonaService persoServ;
    @PostMapping ("/nueva/persona")
    public void agregarPersona(@RequestBody Persona perso){
        persoServ.crearPersona(perso);
    }
    @GetMapping ("/ver/persona")
    @ResponseBody
    public List<Persona> verPersonas(){
       return persoServ.verPersonas();
    }
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
      persoServ.borrarPersona(id);
    }
}
