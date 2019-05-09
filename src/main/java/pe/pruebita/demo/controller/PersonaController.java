package pe.pruebita.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pe.pruebita.demo.model.Persona;
import pe.pruebita.demo.service.PersonaService;

@Controller
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @GetMapping({"/","/index"})
    public String index(){return "index";}

    @GetMapping("/persona")
    public String getPersonas(Model model){
        model.addAttribute("persona",personaService.getAll());
        return "persona";
    }

    @GetMapping("/persona/add")
    public String addPersona(Model model){
        model.addAttribute("persona", new Persona());
        return "persona-add";
    }

    @PostMapping("/persona/save")
    public String savePersona(Persona persona, Model model){

        personaService.savePersona(persona);

        model.addAttribute("persona", personaService.getAll());

        return "persona";
    }

}