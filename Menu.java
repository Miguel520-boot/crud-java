import java.util.*;
public class Menu {

    Scanner sc = new Scanner(System.in);
    Random rd = new Random();


    public void mostrarMenu(){
        Logica lg = new Logica();
        int op;
        boolean salir = true;
      do{
        System.out.println("Agregar Usuario.........[1]");
        System.out.println("Listar Usuarios.........[2]");
        System.out.println("Buscar usuario..........[3]");
        System.out.println("Actualizar usuario......[4]");
        System.out.println("Eliminar usuario........[5]");
        System.out.println("Salir del sistema.......[6]");
        System.out.print("Ingrese la opcion que desee: ");
        op = sc.nextInt();

        switch (op) {
            case 1 -> registroUsuario(lg);
            case 2 -> lg.listarUsuarios();
            case 3 -> buscadorUsuario(lg);
            case 4 -> System.out.println();
            case 5 -> System.out.println();
            case 6 -> salir = false;
        
            default -> System.out.println("Opcion invalida no se encuentra en el menu :(");
        }
      }while((op > 6 || op <= 0) || salir);  
    }

   public void registroUsuario(Logica lg){
    int id = rd.nextInt(80)+10;

    sc.nextLine();
    System.out.print("Ingrese el nombre: ");
    String nombre = sc.nextLine();

    System.out.print("Ingrese su correo electronico: ");
    String correo = sc.nextLine();

    lg.agregarUsuario(id, nombre, correo);
    System.out.println("Usuario registrado exitosamente :)");
    
   }

   public void buscadorUsuario(Logica lg){
    System.out.print("Ingrese el ID del usuario: ");
    int id =sc.nextInt();
    String usuarioEncontrado = lg.buscarUsuario(id);
    System.out.println(usuarioEncontrado);
   }
}
