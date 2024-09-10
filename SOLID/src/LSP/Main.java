package LSP;

public class Main {
    public static void realizarActividades (Persona persona) {
        persona.realizarExamen();
    }

    public static void main(String[] args) {
        Persona alumno = new Alumno("John",8);
        Persona maestro = new Maestro("JVergara", "Introducción a la programación");

        realizarActividades(alumno);
        realizarActividades(maestro);
    }
}
