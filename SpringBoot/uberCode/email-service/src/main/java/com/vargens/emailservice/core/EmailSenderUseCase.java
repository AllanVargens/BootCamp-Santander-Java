package com.vargens.emailservice.core;

//casos de uso e logica de negocios, é agnostico a implementacao/infra

public interface EmailSenderUseCase {
    void sendEmail(String to, String subject, String body);
}
