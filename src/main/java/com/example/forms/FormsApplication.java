package com.example.forms;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.forms.repositories.FormRepository;
import com.example.forms.model.Form;
import com.example.forms.repositories.UserRepository;
import com.example.forms.model.User;

@SpringBootApplication
public class FormsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormsApplication.class, args);
	}

	@Bean
	CommandLineRunner Form(FormRepository formRepository){
		return args ->{
			 // потом содавать через этот пример use
			Form form = new Form(1,"Book", 1, "Description book","Content book",LocalDateTime.now());
			formRepository.create(form);
		};
	}

	@Bean
	CommandLineRunner User(UserRepository userRepository){
		return args ->{
			 // потом содавать через этот пример use
			User userKostya = new User(1,"Kostya", "password1", "kostya@mail.ru",1);
			userRepository.create(userKostya);
			User userSasha = new User(2,"Sasha", "password2", "sasha@mail.ru",2);
			userRepository.create(userSasha);
		};
	}

}