package pe.edu.upeu.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Getter
@lombok.Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private int idusuario;
    private String username;
    private String password;
    private String fecha; 
    private String estado;
    private int idpersona;
    private int idrol;

    public Usuario(int idusuario, String username, String password, int idpersona, int idrol, String fecha, String estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
