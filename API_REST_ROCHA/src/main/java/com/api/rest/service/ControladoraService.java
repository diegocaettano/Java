package com.api.rest.service;
 
import java.util.List;
import java.util.Optional;

import com.api.rest.entity.ControladoraEntity;
import com.api.rest.entity.GateEntity;
import com.api.rest.repository.ControladoraRepository;
import com.api.rest.repository.GateRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
public class ControladoraService {
 
    @Autowired
    ControladoraRepository ControladoraRepo;
 
        public List<ControladoraEntity> getAll() {
        return ControladoraRepo.getAll();
    }

     
    @Autowired
    ControladoraRepository ControladoraRepo2;
 
        public Optional<ControladoraEntity> findByCD_EQUIPAMENTO(Integer cD_EQUIPAMENTO) {
        return ControladoraRepo.findByCD_EQUIPAMENTO(cD_EQUIPAMENTO);
    }

    @Autowired
    GateRepository GateRepo;

        public Optional<GateEntity> findByCodGate(Integer CodGate){
            return GateRepo.findByCodGate(CodGate);
        }






}