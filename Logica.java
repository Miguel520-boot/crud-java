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

    public void actualizarUser(int id, int op, String nuevoNombre, String nuevoCorreo){
        for(Persona p: usuarios){
            if(id == p.getId() && op == 1){
                p.setNombre(nuevoNombre);
            }else if(id == p.getId() && op == 2){
                p.setCorreo(nuevoCorreo);
            }
        }
        System.out.println("datos actualizados");
    }

}