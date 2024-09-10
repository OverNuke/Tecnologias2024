package ISP;

public class DropboxFile implements FileInterface {
    private String name;
    private String ownerUsername;
    private String ownerGroupName;

    public DropboxFile(String name, String ownerUsername, String ownerGroupName) {
        this.name = name;
        this.ownerUsername = ownerUsername;
        this.ownerGroupName = ownerGroupName;
    }

    @Override
    public void changeOwner(String user, String group) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void rename(String name) {
        this.name = name;
    }

    @Override
    public void changeExtension(String extension) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
