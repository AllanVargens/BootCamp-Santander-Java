package com.mockito.exemplos;

public class Email {
    private String enderecoEmail;
    private String mensagem;

    public Email(String enderecoEmail, String mensagem) {
        this.enderecoEmail = enderecoEmail;
        this.mensagem = mensagem;
    }

    public String getEnderecoEmail() {
        return enderecoEmail;
    }

    public String getMensagem() {
        return mensagem;
    }

}
