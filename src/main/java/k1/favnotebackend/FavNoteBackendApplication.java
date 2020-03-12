package k1.favnotebackend;

import k1.favnotebackend.model.*;
import k1.favnotebackend.repositories.ItemRepository;
import k1.favnotebackend.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Date;

@SpringBootApplication
public class FavNoteBackendApplication {

    public static void main(String[] args) {
     ConfigurableApplicationContext ctx = SpringApplication.run(FavNoteBackendApplication.class, args);
    }

}
