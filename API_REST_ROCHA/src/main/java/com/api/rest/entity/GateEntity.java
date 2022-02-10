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
    Integer Sessao_Gate;

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

    public Integer getSessao_Gate() {
        return Sessao_Gate;
    }

    public void setSessao_Gate(Integer Sessao_Gate) {
        this.Sessao_Gate = Sessao_Gate;
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