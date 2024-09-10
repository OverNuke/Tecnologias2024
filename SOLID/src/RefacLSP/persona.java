package RefacLSP;

public class persona {
    private String nombre;

    public persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

     public void mostrarInfo() {
        System.out.println("Tu nombre es " + this.nombre);
    }
}
