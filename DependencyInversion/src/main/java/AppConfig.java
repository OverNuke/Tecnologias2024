public class AppConfig {
    public static DocumentGenerator generateDocumentGenerator() {

        FileCreatorRegistry registry = new FileCreatorRegistry();
        registry.registerCreators(1, new TxtFileCreator(), new TxtFileCreator().getType());
        registry.registerCreators(2,new DocxFileCreator(), new DocxFileCreator().getType());

        InputReader inputReader = new ConsoleReaderInput();
        return new DocumentGenerator(inputReader, registry);
    }
}
