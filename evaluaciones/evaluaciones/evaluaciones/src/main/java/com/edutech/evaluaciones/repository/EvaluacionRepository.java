package com.edutech.evaluaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.edutech.evaluaciones.model.entity.EvaluacionEntity;

public interface EvaluacionRepository extends JpaRepository<EvaluacionEntity, Integer> {
     
    EvaluacionEntity findByCodigo(String codigo);
    boolean existsByCodigo(String codigo);
    void deleteByCodigo(String codigo);

}
