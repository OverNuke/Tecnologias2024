package LSP;

public class Persona {
    // Atributo privado
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Métodos públicos para acceder al atributo
    public String getNombre() {
        return nombre;
    }

    public void mostrarInfo() {
        System.out.println("Tu nombre es " + this.nombre);
    }


    public void realizarExamen () {

    }
}
