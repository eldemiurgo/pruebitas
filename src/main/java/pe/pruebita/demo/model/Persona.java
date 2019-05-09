package pe.pruebita.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Persona {
    private Integer id ;
    private String name;
    private  String lasname;
    private Integer age;

}