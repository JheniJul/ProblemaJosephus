/*Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template*/
package josephus;

/*@author sonha */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Josephus {
    public static void main(String[] args) {
        // Criar uma lista de pessoas 
        List<Pessoa> listaPessoas = new ArrayList<>();

        // Preenchimento manual
        listaPessoas.add(new Pessoa("Aline", "123-456", "Rua A", "111.222.333-44", 1));
        listaPessoas.add(new Pessoa("Bianca", "456-789", "Rua B", "222.333.444-55", 2));
        listaPessoas.add(new Pessoa("Carlos", "789-012", "Rua C", "333.444.555-66", 3));
        listaPessoas.add(new Pessoa("Davi", "012-345", "Rua D", "444.555.666-77", 4));
        listaPessoas.add(new Pessoa("Eva", "345-678", "Rua E", "555.666.777-88", 5));
        listaPessoas.add(new Pessoa("Fabio", "678-901", "Rua F", "666.777.888-99", 6));
        listaPessoas.add(new Pessoa("Gabriela", "901-234", "Rua G", "777.888.999-00", 7));
        listaPessoas.add(new Pessoa("Henrique", "234-567", "Rua H", "888.999.000-11", 8));
        listaPessoas.add(new Pessoa("Ingrid", "567-890", "Rua I", "999.000.111-22", 9));
        listaPessoas.add(new Pessoa("Jaqueline", "890-123", "Rua J", "000.111.222-33", 10));
        listaPessoas.add(new Pessoa("Kaellen", "123-456", "Rua K", "111.222.333-44", 11));
        listaPessoas.add(new Pessoa("Lucas", "456-789", "Rua L", "222.333.444-55", 12));
        listaPessoas.add(new Pessoa("Maria", "789-012", "Rua M", "333.444.555-66", 13));
        listaPessoas.add(new Pessoa("Noah", "012-345", "Rua N", "444.555.666-77", 14));
        listaPessoas.add(new Pessoa("Olinda", "345-678", "Rua O", "555.666.777-88", 15));
        listaPessoas.add(new Pessoa("Paula", "678-901", "Rua P", "666.777.888-99", 16));
        listaPessoas.add(new Pessoa("Quatrina", "901-234", "Rua Q", "777.888.999-00", 17));
        listaPessoas.add(new Pessoa("Ruan", "234-567", "Rua R", "888.999.000-11", 18));
        listaPessoas.add(new Pessoa("Sara", "567-890", "Rua S", "999.000.111-22", 19));
        listaPessoas.add(new Pessoa("Tomas", "890-123", "Rua T", "000.111.222-33", 20));


        // Simulação do Problema de Josephus
        int index = 0;
        while (listaPessoas.size() > 1) {
            int pulos = gerarNumeroAleatorio(1, listaPessoas.size());
            System.out.println("Pulos: " + pulos);

            // Calcula o índice da pessoa a ser removida
            index = (index + pulos) % listaPessoas.size();

            // Remove a pessoa
            System.out.println("Eliminando pessoa: " + listaPessoas.get(index).getId());
            listaPessoas.remove(index);
        }

        // Imprimir a pessoa sobrevivente
        System.out.println("------------");
        System.out.println("\nA ultima pessoa eh: " + listaPessoas.get(0).getId());
            
            Pessoa sobrevivente = listaPessoas.get(0);
            System.out.println("\nNome: " + sobrevivente.getNome());
            System.out.println("Telefone: " + sobrevivente.getTelefone());
            System.out.println("Endereco: " + sobrevivente.getEndereco());
            System.out.println("CPF: " + sobrevivente.getCpf());
            System.out.println("\n---------"); 
    }

    private static int gerarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max) + min;
    }
}
