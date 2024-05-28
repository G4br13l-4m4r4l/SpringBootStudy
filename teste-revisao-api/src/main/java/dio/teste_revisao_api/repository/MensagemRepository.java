package dio.teste_revisao_api.repository;

import dio.teste_revisao_api.model.Mensagem;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class MensagemRepository {

    private List<Mensagem> mensagens;

    public void enviarMensagem(Mensagem mensagem) {
        mensagens.add(mensagem);
        System.out.println("Mensagem enviada com sucesso!");
    }

    public void apagarMensagem(String titulo) {
        for(Mensagem m : mensagens) {
            if(m.getTitulo().equals(titulo)) {
                mensagens.remove(m);
            }
        }
        System.out.println("Mensagem removida com sucesso!");
    }
    public void buscarMensagem(String titulo) {
        for(Mensagem m : mensagens) {
            if(m.getTitulo().equals(titulo)) {
                System.out.println("Mensagem encontrada: "+m);
            }
        }
    }

    public List<Mensagem> verMensagens() {
        if(Objects.isNull(mensagens)) {
            mensagens = new ArrayList<>();
            mensagens.add(new Mensagem());
        }
        return mensagens;
    }
}
