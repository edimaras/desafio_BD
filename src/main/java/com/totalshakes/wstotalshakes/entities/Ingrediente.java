package com.totalshakes.wstotalshakes.entities;

import javax.persistence.*;
import java.util.Set;
@Entity
public class Ingrediente {
    @Id
    private Integer id;
    private String nome;

    @OneToMany(mappedBy = "ingrediente")
    private Set<Adicional> adicionais;

    public Ingrediente() {
    }

    public Ingrediente(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Ingrediente(Integer id, String nome, Set<Adicional> adicionais) {
        this.id = id;
        this.nome = nome;
        this.adicionais = adicionais;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
