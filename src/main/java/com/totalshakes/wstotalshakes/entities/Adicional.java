package com.totalshakes.wstotalshakes.entities;

import javax.persistence.*;

@Entity
public class Adicional {

    @Id
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "ingrediente_id", nullable = false)
    private Ingrediente ingrediente;

    public Adicional() {
    }

    public Adicional(Integer id, Ingrediente ingrediente) {
        this.id = id;
        this.ingrediente = ingrediente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }
}
