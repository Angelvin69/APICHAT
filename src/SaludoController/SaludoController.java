package SaludoController;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;


@Controller

public class SaludoController {
	@MessageMapping("HOLA")
	@SendTo ("SALUDO")
	public saludo SALUDOS(saludo message) throws Exception {
		Thread.sleep(1000);
		return new saludo("HOLA");
	}

}
