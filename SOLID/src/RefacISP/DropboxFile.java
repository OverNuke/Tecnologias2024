package RefacISP;

public class DropboxFile implements SuppportsRenaming {
    private String name;
    private  String ownerUsername = "";
    private  String ownerGroupName = "";

    public DropboxFile(String name,String ownerUsername,String ownerGroupName) {
        this.name = name;
        this.ownerGroupName = ownerGroupName;
        this.ownerGroupName = ownerGroupName;
    }

    @Override
    public void rename(String name) {
        this.name = name;
    }
}
