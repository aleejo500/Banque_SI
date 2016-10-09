package org.aleejo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource("spring-beans.xml") //2eme methode
public class BanqueSi2Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BanqueSi2Application.class, args);
	}
}
