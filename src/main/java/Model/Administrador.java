package Model;

public class Administrador extends Usuario {
    private String Area;

    public Administrador(String nombre, String email, int id, String area) {
        super(nombre, email, id);
        Area = area;
    }

    public void mirarFAQ (){
        System.out.println("Miro quejas");
    }

    public void verCreditoClientes(){
        System.out.println("Miro los creditos");
    }

    public void cambiarMenu(){

    }
    public void mirarRegistros(){

    }
}
