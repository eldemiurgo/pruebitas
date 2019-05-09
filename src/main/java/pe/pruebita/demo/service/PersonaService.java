package pe.pruebita.demo.service;


import pe.pruebita.demo.model.Persona;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class PersonaService {

    AtomicInteger id = new AtomicInteger();
    List<Persona> personaList = new ArrayList<>(
            Arrays.asList(
                    new Persona(id.getAndIncrement() ,"Ronny","Cabana",30),
                    new Persona(id.getAndIncrement() ,"Carmen","Cabana",28)
            )

    );

    public  List<Persona> getAll(){return personaList;}


    public void savePersona(Persona persona) {

        persona.setId(id.incrementAndGet());

        personaList.add(persona);
    }


}