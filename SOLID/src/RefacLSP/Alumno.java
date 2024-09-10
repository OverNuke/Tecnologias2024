package RefacLSP;

public class Alumno extends persona implements Actividad {
    private int calificacion;

    public Alumno(String nombre, int calificacion) {
        super(nombre);
        this.calificacion = calificacion;
    }

    public int getCalificacion() {
        return calificacion;
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); 
        System.out.println("Calificación: " + this.calificacion);
    }

    @Override
    public void realizarExamen() {
        System.out.println(getNombre()+" esta realizando un examen.");
    }
}
