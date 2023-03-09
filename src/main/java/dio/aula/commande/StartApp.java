package dio.aula.commande;

import dio.aula.repository.UserRepository;
import org.h2.engine.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
      User user = null;

        user.getName();
      user.setUserPasswordHash("Alex".getBytes());
      user.setAdmin(Boolean.parseBoolean("diojpa123"));


        for (SecurityProperties.User u: repository.findAll()) System.out.println(u);


    }
}
