package com.thiagsilvadev.picpaysimplificado.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.thiagsilvadev.picpaysimplificado.domain.user.User;
import com.thiagsilvadev.picpaysimplificado.dtos.NotificationDTO;

@Service
public class NotificationService {
    @Autowired
    private RestTemplate restTemplate;

    public void sendNotification(User user, String message) throws Exception {
        String email = user.getEmail();
        NotificationDTO notificationRequest = new NotificationDTO(email, message);

        // ResponseEntity<String> notificationResponse = restTemplate.postForEntity("https://util.devi.tools/api/v1/notify",
        //         notificationRequest, String.class);
        // if (notificationResponse.getStatusCode() != HttpStatus.OK) {
        //     System.out.println("Erro ao enviar notificação");
        //     throw new Exception("Erro ao enviar notificação");
        // }

        System.out.println("Notificação enviada");
    }
}
