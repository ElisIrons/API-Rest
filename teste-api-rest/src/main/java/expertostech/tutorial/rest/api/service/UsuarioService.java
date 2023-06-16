package expertostech.tutorial.rest.api.service;

import expertostech.tutorial.rest.api.Model.UsuarioModel;
import expertostech.tutorial.rest.api.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
        private UsuarioRepository usuarioRepository;

    public void registrarUsuario(UsuarioModel usuario) { usuarioRepository.save(usuario);}
    public List<UsuarioModel> listarTodos() { return usuarioRepository.findAll();}
}
