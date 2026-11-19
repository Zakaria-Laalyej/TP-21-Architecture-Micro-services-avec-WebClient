package com.example.car;

import com.example.car.entities.Car;
import com.example.car.repositories.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceCarApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCarApplication.class, args);
        System.out.println("=================================================");
        System.out.println(" SERVICE-CAR TP21 demarre sur http://localhost:8082");
        System.out.println("=================================================");
    }

    @Bean
    CommandLineRunner seedCars(CarRepository carRepository) {
        return args -> {
            if (carRepository.count() == 0) {
                carRepository.save(new Car(null, "Toyota", "Yaris", 1L));
                carRepository.save(new Car(null, "Dacia", "Sandero", 2L));
                System.out.println("Voitures initiales inserees pour TP 21 !");
            }
        };
    }
}
