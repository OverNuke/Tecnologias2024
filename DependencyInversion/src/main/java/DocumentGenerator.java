public class DocumentGenerator {
    private InputReader inputReader;
    private FileCreatorRegistry registry;

    public DocumentGenerator(InputReader inputReader, FileCreatorRegistry registry) {
        this.inputReader = inputReader;
        this.registry = registry;
    }

    public void generateDocument() {
        String content = inputReader.readInput("Ingresa el contenido de tu archivo: ");

        String fileName = inputReader.readInput("Ingresa el nombre de archivo: ");

        String fileType = inputReader.readInput("Ingresa el tipo de archivo: "+ registry.showOptions());

        int choice = Integer.parseInt(fileType);

        FileCreator fileCreator = registry.getCreator(choice);

        System.out.println("Archivo generado exitosamente");
    }
}
