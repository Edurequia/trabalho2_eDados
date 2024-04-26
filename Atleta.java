package Principal;

import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Atleta {

    private String fone; //chave primária
    private String nome;
    private String apelido;
    private String dataNascimento;
    int pontuacaoAcumulada;

    Scanner teclado = new Scanner(System.in);
    HashSet<Atleta> atletas = new HashSet<>();

    public Atleta(){
    }

    public Atleta(String fone, String nome, String apelido, String dataNascimento, int pontuacaoAcumulada) {
        this.fone = fone;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.pontuacaoAcumulada = pontuacaoAcumulada;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getPontuacaoAcumulada() {
        return pontuacaoAcumulada;
    }

    public void setPontuacaoAcumulada(int pontuacaoAcumulada) {
        this.pontuacaoAcumulada = pontuacaoAcumulada;
    }

    public void listarAtletas() {
        if (!atletas.isEmpty()) {
            System.out.println("----- Lista atletas -----");
            atletas.forEach(a -> System.out.println(a.getNome()));
        } else {
            System.out.println("A lista atletas está vazia!");
        }
    }

    public void cadastrarAtleta() {
        System.out.println("----- Cadastro de atleta -----");
        System.out.print("Fone: ");
        fone = teclado.nextLine();
        System.out.print("Nome: ");
        nome = teclado.next();
        System.out.print("Apelido: ");
        apelido = teclado.next();
        System.out.print("Data de nascimento: ");
        dataNascimento = teclado.next();
        System.out.print("Pontuação: ");
        pontuacaoAcumulada = teclado.nextInt();

        atletas.add(new Atleta(fone, nome, apelido, dataNascimento, pontuacaoAcumulada));
    }

    public String buscarAtleta(String nome) {
        return this.nome;
    }

    public void removerAtleta(String nome) {
        atletas.remove(nome);
    }

//    public void salvarAtletasCSV() {
//        try (PrintWriter writer = new PrintWriter(new FileWriter("atletas.csv"))) {
//            for (Atleta a : atletas) {
//                writer.println(String.join(",", a.fone, a.nome, a.apelido, a.dataNascimento, String.valueOf(a.pontuacaoAcumulada)));
//            }
//            System.out.println("Dados dos atletas salvos em 'atletas.csv'.");
//        } catch (IOException e) {
//            System.out.println("Erro ao salvar os dados dos atletas: " + e.getMessage());
//        }
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Atleta)) return false;
        Atleta atleta = (Atleta) o;
        return Objects.equals(fone, atleta.fone);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(fone);
    }

    @Override
    public String toString() {
        return "fone: '" + fone + '\'' + ", nome: '" + nome + '\'' + ", apelido: '" + apelido + '\'' + ", dataNascimento:'" + dataNascimento + '\'' +
                ", pontuacaoAcumulada: " + pontuacaoAcumulada;
    }
}
