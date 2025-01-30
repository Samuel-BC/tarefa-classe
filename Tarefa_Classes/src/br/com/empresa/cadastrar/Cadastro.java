package br.com.empresa.cadastrar;

    //Classe Plano//
public class Cadastro {

    //Metodo que adiciona os dados do cliente e cadastra o plano//
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setNome("Bruno");
        cliente.setTelefone(98891113);
        cliente.cadastrarPlano("Premium");

    //Imprime os dados no console//
        System.out.println("Nome:" + cliente.getNome());
        System.out.println("Telefone:" + cliente.getTelefone());
        System.out.println("Plano:" + cliente.getPlano());
    }
}
