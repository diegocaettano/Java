package com.api.rest.repository;
 
import java.util.List;
import java.util.Optional;

import com.api.rest.entity.ControladoraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
 
@Repository
public interface ControladoraRepository extends JpaRepository<ControladoraEntity, Integer> {
 
    @Query("FROM ControladoraEntity")
    public List<ControladoraEntity> getAll();

    @Query(value= "SELECT TOP 1 * FROM LOG_ACESSO_TESTE  WHERE CD_EQUIPAMENTO=:cD_EQUIPAMENTO ORDER BY CD_LOG_ACESSO DESC", nativeQuery = true)
    Optional<ControladoraEntity> findByCD_EQUIPAMENTO(Integer cD_EQUIPAMENTO);


}

