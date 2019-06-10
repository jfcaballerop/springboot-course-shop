package com.logesta.store.example.storeapplication;

import java.util.Arrays;
import java.util.List;

import com.logesta.store.example.storeapplication.model.producto;
import com.logesta.store.example.storeapplication.model.usuario;
import com.logesta.store.example.storeapplication.repository.ProductoRepository;
import com.logesta.store.example.storeapplication.repository.UsuarioRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}
	@Bean
	public CommandLineRunner initData(UsuarioRepository usuarioRepo, ProductoRepository productoRepo) {
		return args -> {

			usuario user = new usuario("Luis Miguel", "López Magaña", null, null, "luismi.lopez@openwebinars.net",
					"luismi");
			user = usuarioRepo.save(user);

			usuario user2 = new usuario("Antonio", "García Martín", null, null, "antonio.garcia@openwebinars.net",
					"antonio");
			user2 = usuarioRepo.save(user2);

			
			List<producto> listado = Arrays.asList(new producto("Bicicleta de montaña", 100.0f,
					"https://www.decathlon.es/media/835/8350582/big_23c25284-2810-415d-8bcc-e6bebdb536fc.jpg", user),
					new producto("Golf GTI Serie 2", 2500.0f,
							"https://www.minicar.es/large/Volkswagen-Golf-GTi-G60-Serie-II-%281990%29-Norev-1%3A18-i22889.jpg",
							user),
					new producto("Raqueta de tenis", 10.5f, "https://imgredirect.milanuncios.com/fg/2311/04/tenis/Raqueta-tenis-de-segunda-mano-en-Madrid-231104755_1.jpg?VersionId=T9dPhTf.3ZWiAFjnB7CvGKsvbdfPLHht", usuario),
					new producto("Xbox One X", 425.0f, "https://images.vibbo.com/635x476/860/86038583196.jpg", user2),
					new producto("Trípode flexible", 10.0f, "https://images.vibbo.com/635x476/860/86074256163.jpg", user2),
					new producto("Iphone 7 128 GB", 350.0f, "https://store.storeimages.cdn-apple.com/4667/as-images.apple.com/is/image/AppleInc/aos/published/images/i/ph/iphone7/rosegold/iphone7-rosegold-select-2016?wid=470&hei=556&fmt=jpeg&qlt=95&op_usm=0.5,0.5&.v=1472430205982", usuario2));
			
			listado.forEach(productoServicio::insertar);
			

		};
}
}
