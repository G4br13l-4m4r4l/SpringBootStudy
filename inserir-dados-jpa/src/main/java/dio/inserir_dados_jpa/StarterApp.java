package dio.inserir_dados_jpa;

import dio.inserir_dados_jpa.model.User;
import dio.inserir_dados_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StarterApp implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("ADM");


        userRepository.save(user);

        for(User u: userRepository.findAll()){
            System.out.println(u);
        }
    }
}
