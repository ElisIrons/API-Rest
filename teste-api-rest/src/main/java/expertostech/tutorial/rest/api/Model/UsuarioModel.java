package expertostech.tutorial.rest.api.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "public.usuario")
@Table(name = "public_usuario")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer codigo;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Login")
    private String login;

    @Column(name = "Senha")
    private String senha;

}



