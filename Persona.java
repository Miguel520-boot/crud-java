public class Persona {
    private String nombre;
    private int id_usuario;
    private String correo_usuario;

    public Persona(int id, String nombre, String correo){
        this.id_usuario = id;
        this.nombre = nombre;
        this.correo_usuario = correo;
    }

    public String getNombre(){
        return nombre;
    }

    public int getId(){
        return id_usuario;
    }

    public String getCorreo(){
        return correo_usuario;
    }

    public String setNombre(String nombre){
        this.nombre = nombre;
        return nombre;
    }

    public String setCorreo(String correo){
        this.correo_usuario = correo;
        return correo;
    }
}
