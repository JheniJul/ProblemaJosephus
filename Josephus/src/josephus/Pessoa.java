/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package josephus;

/* @author sonha */

class Pessoa {
    private String nome;
    private String telefone;
    private String endereco;
    private String cpf;
    int id;

    public Pessoa(String nome, String telefone, String endereco, String cpf, int id) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
        this.id = id;
    }

    // Métodos para retornar atributos para impressão
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public int getId() {
        return id;
    }
}
