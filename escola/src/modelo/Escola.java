/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.time.LocalDate;
/**
 *
 * @author Administrador
 */
public class Escola {
    private Integer nr_alunos;
    private Integer nr_funicionarios;
    private String nome;
    private Integer codigo;
    private Double area;
    private LocalDate abertura;

    public Integer getNr_funicionarios() {
        return nr_funicionarios;
    }

    public void setNr_funicionarios(Integer nr_funicionarios) {
        this.nr_funicionarios = nr_funicionarios;
    }

    
    

    public LocalDate getAbertura() {
        return abertura;
    }

    public void setAbertura(LocalDate abertura) {
        this.abertura = abertura;
    }

    @Override
    public String toString() {
        return nome;
    }


    public Integer getNr_alunos() {
        return nr_alunos;
    }

    public void setNr_alunos(Integer nr_alunos) {
        this.nr_alunos = nr_alunos;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
    
}
