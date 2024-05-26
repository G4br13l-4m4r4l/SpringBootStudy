package com.mensager.enviar_email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Cadastro implements CommandLineRunner {
    @Value("${name: NoReply}")
    private String name;
    @Value("${email}")
    private String email;
    @Value("${numeros}")
    private List<Long> ids;
    @Autowired
    private EnviarEmail enviarEmail;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Nome: " + name);
        System.out.println("Email: " + email);
        System.out.println("IDs: " + ids);
        System.out.println("Mensagem: Cadastro realizado com sucesso!");

        System.out.println(enviarEmail.Enviando(email));
    }
}
