package daw.t2.sanca.t2_service_inventario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class T2ServiceInventarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(T2ServiceInventarioApplication.class, args);
	}

}
