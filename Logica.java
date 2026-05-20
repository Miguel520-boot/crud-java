import java.util.*;
public class Logica {
    ArrayList<Persona> usuarios = new ArrayList<>();
    
    public void agregarUsuario(int id, String nombre, String correo){
        usuarios.add(new Persona(id, nombre, correo));
    }
    public void listarUsuarios(){
        for(Persona p: usuarios){
            System.out.println(p.getId()+" | "+p.getNombre()+" | "+p.getCorreo());
        }
        
    }




}