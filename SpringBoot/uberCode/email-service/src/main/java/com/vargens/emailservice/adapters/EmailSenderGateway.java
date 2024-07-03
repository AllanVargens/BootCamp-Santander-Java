package com.vargens.emailservice.adapters;

//contrato para que a aplicação intereja com serviços de fora
public interface EmailSenderGateway {
    void sendEmail(String to, String subject, String body);
}
