package br.com.alura.testes.listadepessoas.Classes;

public class Pessoas {
    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "(" + idade + " anos)";
    }
}
