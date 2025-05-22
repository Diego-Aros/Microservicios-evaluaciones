package com.edutech.evaluaciones.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Evaluacion {
    private int idEvaluacion;
    private String fechaEvaluacion;
    private double notaEvaluacion;
    private String codigo;
}
