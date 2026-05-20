import java.util.*;
public class Logica {
    ArrayList<Persona> usuarios = new ArrayList<>();
    
    public void agregarUsuario(int id, String nombre, String correo){
        usuarios.add(new Persona(id, nombre, correo));
    }
    public void listarUsuarios(){
        for(Persona p: usuarios){
            System.out.println("ID: "+p.getId()+" | Nombre: "+p.getNombre()+" | Correo: "+p.getCorreo());
        }
        
    }

    public String buscarUsuario(int id){
        for(Persona p: usuarios){
            if(id == p.getId()){
                return "ID: "+p.getId()+" | Nombre: "+p.getNombre()+" | Correo: "+p.getCorreo();
            }
        }
        return "usuario no encontrado";
    }




}