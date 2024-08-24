package unidade1.exercicio2.produto;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private List<Estrelas> estrelas;

    public Produto(String nome) {
        this.nome = nome;
        this.estrelas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAvaliacao(Estrelas avaliacao) {
        if (avaliacao.getNota() <= 5) {
            estrelas.add(avaliacao);
        }
    }

    public void mostrarAvaliacoes() {
        System.out.println("Produto: " + nome);
        for (Estrelas avaliacao : estrelas) {
            System.out.println(avaliacao);
        }
    }

    public class Estrelas {
        private int nota;
        private String comentario;

        public Estrelas(int nota, String comentario) {
            this.nota = nota;
            this.comentario = comentario;
        }

        public int getNota() {
            return nota;
        }

        public void setNota(int nota) {
            this.nota = nota;
        }

        public String getComentario() {
            return comentario;
        }

        public void setComentario(String comentario) {
            this.comentario = comentario;
        }

        @Override
        public String toString() {
            return "Avaliacao [nota=" + nota + ", comentario=" + comentario + "]";
        }
    }

}