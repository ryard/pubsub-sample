package nl.virtualsciences.fuse.soap.pil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:spring/camel-context.xml"})
public class PilPsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PilPsApplication.class, args);
	}

}
