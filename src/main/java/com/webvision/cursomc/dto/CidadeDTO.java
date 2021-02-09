package com.webvision.cursomc.dto;

import com.webvision.cursomc.domain.Cidade;

import java.util.Objects;

public class CidadeDTO {
    private Integer id;
    private String nome;

    public CidadeDTO() {
    }

    public CidadeDTO(Cidade obj) {
        id = obj.getId();
        nome = obj.getNome();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CidadeDTO cidadeDTO = (CidadeDTO) o;
        return id.equals(cidadeDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
