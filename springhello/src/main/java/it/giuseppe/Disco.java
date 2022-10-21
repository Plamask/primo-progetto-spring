package it.giuseppe;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component
@Data
@ToString
public class Disco {
    private Programma programma;
    
    public Disco(Programma programma) {
        this.programma = programma;
    }

}