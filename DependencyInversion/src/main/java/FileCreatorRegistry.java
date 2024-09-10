import java.util.HashMap;
import java.util.Map;

public class FileCreatorRegistry {
    private final Map<Integer, FileCreator> CREATORS = new HashMap<>();
    private final Map<Integer, String> CREATOR_TYPE = new HashMap<>();

    public void registerCreators(int option, FileCreator creator, String type) {
        CREATORS.put(option, creator);
        CREATOR_TYPE.put(option, type);
    }

    public FileCreator getCreator(int option) {
        return CREATORS.get(option);
    }

    public String showOptions() {
        String options = "";

        for (Integer option : CREATOR_TYPE.keySet()) {
            options += option + "-" + CREATOR_TYPE.get(option) + "\t";
        }
        return options;
    }


}
