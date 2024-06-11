package com.mockito.exemplos;

import java.util.UUID;

public class Mensagem {
    private String mensagem;
    private String id;

    public Mensagem(String mensagem) {
        this.id = UUID.randomUUID().toString();
        this.mensagem = mensagem;
    }

    public String getId() {
        return id;
    }

    public String getMensagem() {
        return mensagem;
    }
}
