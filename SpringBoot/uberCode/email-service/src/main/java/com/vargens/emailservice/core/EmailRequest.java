package com.vargens.emailservice.core;

public record EmailRequest(String to, String subject, String body) {

}
