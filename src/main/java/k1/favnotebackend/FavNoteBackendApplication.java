package k1.favnotebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FavNoteBackendApplication {

    public static void main(String[] args) {
     ConfigurableApplicationContext ctx = SpringApplication.run(FavNoteBackendApplication.class, args);
    }

}
