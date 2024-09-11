package RefacLSP;

public class Maestro extends persona {
      private String materia;

    public Maestro(String nombre, String materia) {
        super(nombre);
        this.materia = materia;
    }

    public String getMateria() { return materia; }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Materia: "+materia);
    }
}
