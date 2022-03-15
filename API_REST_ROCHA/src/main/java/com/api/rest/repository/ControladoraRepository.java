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

    @Query(value= "SELECT TOP 1 * FROM LOG_ACESSO WHERE CD_EQUIPAMENTO=:cD_EQUIPAMENTO ORDER BY CD_LOG_ACESSO DESC", nativeQuery = true)
    Optional<ControladoraEntity> findByCD_EQUIPAMENTO(Integer cD_EQUIPAMENTO);

    @Query(value= "SELECT TOP 1 * FROM view_consultaCTRL_BSR01 WHERE CD_EQUIPAMENTO=:cD_EQUIPAMENTOBSR01 ORDER BY CD_LOG_ACESSO", nativeQuery = true)
    Optional<ControladoraEntity> findByCD_EQUIPAMENTOBSR01(Integer cD_EQUIPAMENTOBSR01);

    
    @Query(value= "SELECT TOP 1 * FROM view_consultaCTRL_BSR02 WHERE CD_EQUIPAMENTO=:cD_EQUIPAMENTOBSR02 ORDER BY CD_LOG_ACESSO", nativeQuery = true)
    Optional<ControladoraEntity> findByCD_EQUIPAMENTOBSR02(Integer cD_EQUIPAMENTOBSR02);


}

