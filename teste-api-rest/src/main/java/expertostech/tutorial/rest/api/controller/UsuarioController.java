package expertostech.tutorial.rest.api.controller;
import expertostech.tutorial.rest.api.Model.UsuarioModel;
import expertostech.tutorial.rest.api.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping(path = "/api/usuario/salvar")
    public ResponseEntity<UsuarioModel> registrarUsuario(@RequestBody UsuarioModel registroUsuario) {
        usuarioService.registrarUsuario(registroUsuario);
        return ResponseEntity.badRequest().body(registroUsuario);
    }

    @GetMapping(path = "/api/usuarios")
    public ResponseEntity<List<UsuarioModel>> obterListaUsuario() {
        return ResponseEntity.ok().body(usuarioService.listarTodos());
    }


}

