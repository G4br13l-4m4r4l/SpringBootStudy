package dio.teste_revisao_api.controller;

import dio.teste_revisao_api.model.Mensagem;
import dio.teste_revisao_api.repository.MensagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mensagem")
public class MensagemController {
    @Autowired
    private MensagemRepository mensagemRepository;

    @GetMapping()
    public List<Mensagem> Listar() {
        return mensagemRepository.verMensagens();
    }

    @PostMapping()
    public void Envio(@RequestBody Mensagem mensagem) {

    }

}
