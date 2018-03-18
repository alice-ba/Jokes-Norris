package com.jokes.chuck;

import com.jokes.chuck.controllers.JokesController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.ui.Model;

@SpringBootApplication
public class ChuckApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(ChuckApplication.class, args);
			}

}