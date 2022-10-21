package it.giuseppe;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Programma {
    private String nomeProgramma;
    private double dimensione;

    public Programma(String nomeProgramma, double dimensione) {
        this.nomeProgramma = nomeProgramma;
        this.dimensione = dimensione;
    }

}