package mvcatv.models;

public class Receita {
    private String nome;
    private String tipo;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setTipo(String tipo){
        this.tipo =  tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public Receita(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
}
