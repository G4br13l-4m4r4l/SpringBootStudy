package dio.inserir_dados_jpa.repository;


import dio.inserir_dados_jpa.model.User;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
