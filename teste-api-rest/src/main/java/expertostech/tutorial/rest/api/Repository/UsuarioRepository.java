package expertostech.tutorial.rest.api.Repository;

import expertostech.tutorial.rest.api.Model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel,Integer> {
    static Object listarTodos() {
        return null;
    }
}
