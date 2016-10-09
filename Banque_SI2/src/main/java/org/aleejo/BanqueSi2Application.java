package org.aleejo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BanqueSi2Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BanqueSi2Application.class, args);
	}
}
