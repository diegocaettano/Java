package com.api.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOG_ACESSO2")
public class ControladoraEntity {

    @Id
    @Column(name = "CD_LOG_ACESSO")
    Integer CD_LOG_ACESSO;

    @Column(name = "DT_REQUISICAO")
    String Data_de_requisicao;

    @Column(name = "NM_PESSOA")
    String Nome;

    @Column(name = "NU_CREDENCIAL")
    Long Credencial;

    @Column(name = "CD_EQUIPAMENTO")
    Integer codigo_Equipamento;

    @Column(name = "DS_EQUIPAMENTO")
    String descricao_Equipamento;

    @Column(name = "TP_EVENTO")
    String evento;

    public Integer getCD_LOG_ACESSO() {
        return CD_LOG_ACESSO;
    }

    public void setCD_LOG_ACESSO(Integer cD_LOG_ACESSO) {
        CD_LOG_ACESSO = cD_LOG_ACESSO;
    }

    public String getData_de_requisicao() {
        return Data_de_requisicao;
    }

    public void setData_de_requisicao(String data_de_requisicao) {
        Data_de_requisicao = data_de_requisicao;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Long getCredencial() {
        return Credencial;
    }

    public void setCredencial(Long credencial) {
        Credencial = credencial;
    }

    public Integer getCodigo_Equipamento() {
        return codigo_Equipamento;
    }

    public void setCodigo_Equipamento(Integer codigo_Equipamento) {
        this.codigo_Equipamento = codigo_Equipamento;
    }

    public String getDescricao_Equipamento() {
        return descricao_Equipamento;
    }

    public void setDescricao_Equipamento(String descricao_Equipamento) {
        this.descricao_Equipamento = descricao_Equipamento;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    
}