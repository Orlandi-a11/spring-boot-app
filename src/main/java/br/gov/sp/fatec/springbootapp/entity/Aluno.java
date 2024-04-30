package br.gov.sp.fatec.springbootapp.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alu_aluno")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alu_id")
    private Long id;

    @Column(name = "alu_nome_completo")
    private String nomeCompleto;

    @Column(name = "alu_email_institucional")
    private String emailInstitucional;

    @Column(name = "alu_data_matricula")
    private LocalDateTime dataMatricula;

    @Column(name = "alu_indice")
    private Float indice;

    // Constructors, getters, and setters
    public Aluno() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmailInstitucional() {
        return emailInstitucional;
    }

    public void setEmailInstitucional(String emailInstitucional) {
        this.emailInstitucional = emailInstitucional;
    }

    public LocalDateTime getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDateTime dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Float getIndice() {
        return indice;
    }

    public void setIndice(Float indice) {
        this.indice = indice;
    }

    
}
