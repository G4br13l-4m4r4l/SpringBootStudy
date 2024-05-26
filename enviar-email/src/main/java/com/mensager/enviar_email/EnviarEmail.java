package com.mensager.enviar_email;


import org.springframework.stereotype.Component;

@Component
public class EnviarEmail {
    protected String Enviando(String email){
        return "Email enviado para o seguinte destinarario: "+email;
    }
}
