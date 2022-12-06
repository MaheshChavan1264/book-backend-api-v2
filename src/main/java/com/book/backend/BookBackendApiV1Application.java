package com.book.backend;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class BookBackendApiV1Application {
    public static void main(String[] args) {
        SpringApplication.run(BookBackendApiV1Application.class, args);
    }
    @Bean
    public ModelMapper modelmapper() {
        return new ModelMapper();
    }
}
