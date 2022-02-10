package com.api.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "view_consultaSituacaoGateGexpo")
public class GateEntity {

    @Id
    @Column(name = "Codigo")
    Integer codigo;

    @Column(name = "cpfmotorista")
    String CPFMotorista;

    @Column(name = "nomemotorista")
    String NomeMotorista;

    @Column(name = "Gate_Cod")
    String CodGate;

    @Column(name = "Situacao")
    String CodSituacaoGate;

    @Column(name = "Descricao")
    String Descricao;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCPFMotorista() {
        return CPFMotorista;
    }

    public void setCPFMotorista(String cPFMotorista) {
        CPFMotorista = cPFMotorista;
    }

    public String getNomeMotorista() {
        return NomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        NomeMotorista = nomeMotorista;
    }

    public String getCodGate() {
        return CodGate;
    }

    public void setCodGate(String codGate) {
        CodGate = codGate;
    }

    public String getCodSituacaoGate() {
        return CodSituacaoGate;
    }

    public void setCodSituacaoGate(String codSituacaoGate) {
        CodSituacaoGate = codSituacaoGate;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }


    

}