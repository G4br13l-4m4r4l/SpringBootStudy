package dio.teste_revisao_api.model;


public class Mensagem {
    private String titulo;
    private String descricao;
    private String corpo;

    @Override
    public String toString() {
        return "Mensagem{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", corpo='" + corpo + '\'' +
                '}';
    }

    public Mensagem(String titulo, String descricao, String corpo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.corpo = corpo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }
}
