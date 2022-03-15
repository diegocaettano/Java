package com.api.rest.controller;
 
import java.util.List;
import java.util.Optional;

import com.api.rest.entity.ControladoraEntity;
import com.api.rest.entity.GateEntity;
import com.api.rest.repository.ControladoraRepository;
import com.api.rest.repository.GateRepository;
import com.api.rest.service.ControladoraService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class ControladoraController {
 
    @Autowired
    ControladoraService ControladoraService;
 
    @RequestMapping(value = "api/controladores")
        public List<ControladoraEntity> consulControladoras() {
        return ControladoraService.getAll();
    }

    @Autowired
    private ControladoraRepository ControladoraRepo;

    @RequestMapping(value = "api/controladores/porcodigo/{CD_LOG_ACESSO}", method = RequestMethod.GET)
    public ResponseEntity<ControladoraEntity> GetById(@PathVariable(value = "CD_LOG_ACESSO") Integer id)
    {
        Optional<ControladoraEntity> infoAcesso = ControladoraRepo.findById(id);
        if(infoAcesso.isPresent())
            return new ResponseEntity<ControladoraEntity>(infoAcesso.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @Autowired
    private ControladoraRepository ControladoraRepo2;

    @RequestMapping(value = "api/controladores/equipamentos/{CD_EQUIPAMENTO}", method = RequestMethod.GET)
    public ResponseEntity<ControladoraEntity> getByCD_EQUIPAMENTO(@PathVariable(value = "CD_EQUIPAMENTO") Integer equip)
    {
        Optional<ControladoraEntity> infoAcesso = ControladoraRepo2.findByCD_EQUIPAMENTO(equip);
        if(infoAcesso.isPresent())
            return new ResponseEntity<ControladoraEntity>(infoAcesso.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "api/controladores/equipamentos/BSR01/{CD_EQUIPAMENTO}", method = RequestMethod.GET)
    public ResponseEntity<ControladoraEntity> getByCD_EQUIPAMENTOBSR01(@PathVariable(value = "CD_EQUIPAMENTO") Integer equip)
    {
        Optional<ControladoraEntity> infoAcesso = ControladoraRepo2.findByCD_EQUIPAMENTOBSR01(equip);
        if(infoAcesso.isPresent())
            return new ResponseEntity<ControladoraEntity>(infoAcesso.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "api/controladores/equipamentos/BSR02/{CD_EQUIPAMENTO}", method = RequestMethod.GET)
    public ResponseEntity<ControladoraEntity> getByCD_EQUIPAMENTOBSR02(@PathVariable(value = "CD_EQUIPAMENTO") Integer equip)
    {
        Optional<ControladoraEntity> infoAcesso = ControladoraRepo2.findByCD_EQUIPAMENTOBSR02(equip);
        if(infoAcesso.isPresent())
            return new ResponseEntity<ControladoraEntity>(infoAcesso.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }



    @Autowired
    private GateRepository GateRepo;

    @RequestMapping(value = "api/controladores/gates/{CodGate}", method = RequestMethod.GET)
    public ResponseEntity<GateEntity> getByCodGate(@PathVariable(value = "CodGate") Integer gate)
    {
        Optional<GateEntity> infoAcesso = GateRepo.findByCodGate(gate);
        if(infoAcesso.isPresent())
            return new ResponseEntity<GateEntity>(infoAcesso.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}