import br.com.alura.testes.listadepessoas.Classes.Pessoas;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //Inserindo pessoa 1:
        Pessoas pessoa = new Pessoas();
        pessoa.setNome("Elio Moratori");
        pessoa.setIdade(26);

        //Inserindo pessoa 2:
        Pessoas outraPessoa = new Pessoas();
        outraPessoa.setNome("Nicolle Duque");
        outraPessoa.setIdade(25);

        // Inserindo pessoa 3:
        Pessoas maisPessoa = new Pessoas();
        maisPessoa.setNome("Ramon Moratori");
        maisPessoa.setIdade(23);

        //Criando um ArrayList para Armazenar as pessoas:
        ArrayList<Pessoas> listaPessoas = new ArrayList<>();

        // Inserindo pessoas na lista:
        listaPessoas.add(pessoa);
        listaPessoas.add(outraPessoa);
        listaPessoas.add(maisPessoa);

        // Retornando quantidade de pessoas na lista:
        System.out.println("Pessoas na lista: " + listaPessoas.size());
        System.out.println(listaPessoas);
        System.out.println("Primeiro nome da Lista: " + listaPessoas.get(0));
    }
}
