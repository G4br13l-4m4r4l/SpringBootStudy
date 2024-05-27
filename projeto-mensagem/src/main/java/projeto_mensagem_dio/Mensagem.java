package projeto_mensagem_dio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Mensagem implements CommandLineRunner {

    @Autowired
    private Conteudo content;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Usuário: " + content.getName() + "\nid/host:" + content.getId() + "\nStatus: " + content.getStatus() + "\nDestinatario: " + content.getDestination());
    }
}
