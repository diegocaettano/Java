package com.api.rest.repository;
 
import java.util.Optional;

import com.api.rest.entity.GateEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
 
@Repository
public interface GateRepository extends JpaRepository<GateEntity, Integer> {
    // Para homologação alterar a view para view_consultaSituacaoGateGexpo_Homolog
    @Query(value= "SELECT TOP 1 * FROM view_consultaSituacaoGateGexpo_Homolog  WHERE Gate_Cod =:CodGate ORDER BY Codigo DESC", nativeQuery = true)
    Optional<GateEntity> findByCodGate(Integer CodGate);

}

