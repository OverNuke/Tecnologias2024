package ISP;

public interface FileInterface {
    public void rename(String name);
    void changeOwner(String user, String group);
    void changeExtension(String extension);
}
