package br.com.empresa.cadastrar;

    //Classe Cliente//
public class Cliente {

    // Propriedades da classe nome, telefone, plano//
    String nome;
    int telefone;
    String plano;

    //Metodos da classe getter and setter//
    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    //Metodo que adicionoa um plano para o cliente//
    public void cadastrarPlano(String plano) {

        setPlano(plano);
    }
}