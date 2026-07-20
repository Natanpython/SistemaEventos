package com.SistemaEvento.SistemaEvento.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descricao;

    @OneToMany(mappedBy = "categoria")
    private List<Atividade> atividades = new ArrayList<>();


    public Categoria(){}

    public Categoria(Integer id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId(){
        return this.id;
    }
    public String getDescricao(){
        return this.descricao;
    }

    public void setId(Integer id){
        this.id = id;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Categoria categoria = (Categoria) o;
        return Objects.equals(id, categoria.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
