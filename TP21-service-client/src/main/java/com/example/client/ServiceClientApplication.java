package com.example.client;

import com.example.client.entities.Client;
import com.example.client.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceClientApplication.class, args);
        System.out.println("=================================================");
        System.out.println(" SERVICE-CLIENT TP21 demarre sur http://localhost:8081");
        System.out.println("=================================================");
    }

    @Bean
    CommandLineRunner seedClients(ClientRepository clientRepository) {
        return args -> {
            if (clientRepository.count() == 0) {
                clientRepository.save(new Client(null, "Salma", 23f));
                clientRepository.save(new Client(null, "Nabil", 23f));
                System.out.println("Clients initiaux inseres pour TP 21 !");
            }
        };
    }
}
