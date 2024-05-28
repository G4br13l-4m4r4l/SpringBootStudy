package dio.teste_revisao_api.repository;

import dio.teste_revisao_api.handler.BusinessException;
import dio.teste_revisao_api.model.Mensagem;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class MensagemRepository {

    private List<Mensagem> mensagens;

    public void enviarMensagem(Mensagem mensagem) {
        if(Objects.isNull(mensagens)){
            throw new BusinessException("Objetos inválido!");
        }

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
            mensagens.add(new Mensagem("sending mensage","text","text sendind"));
            mensagens.add(new Mensagem("sending mensage2","text2","text sendind2"));
            mensagens.add(new Mensagem("sending mensage3","text3","text sendind3"));
            mensagens.add(new Mensagem("sending mensage4","text4","text sendind4"));
        }
        return mensagens;
    }
}
