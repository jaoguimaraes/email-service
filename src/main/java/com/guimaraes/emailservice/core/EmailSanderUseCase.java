package com.guimaraes.emailservice.core;

public interface EmailSanderUseCase {
    void sendEmail(String to, String subject, String body);
}
