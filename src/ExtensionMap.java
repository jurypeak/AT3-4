import java.util.ArrayList;

import java.util.stream.Collectors;

public class ExtensionMap {
    private ArrayList<Pair<String, String>> map;
    private String message ; // message for the user

    // default constructor
    public ExtensionMap() {
        this.map = new ArrayList<>();
        this.message = "";
    }
    // return the message
    public String getMessage() {
        return message;
    }
    // add an entry to the collection
    public int addEntry( String k, String v ){
        map.add( new Pair<>(k, v) );
        message = "Entry added!";
        return getSize();
    }
    // Remove an entry from the collection
    public int removeEntry(String k) {
        if (map.removeIf(pair -> pair.getKey().equals(k))) {
            message = "Entry removed!";
        } else {
            message = "Could not remove entry!";
        }
        return getSize();
    }
    // return the current size of the collection
    public int getSize() {
       return map.size();
    }
    // return the whole map as a String -> see javadoc!
    @Override
    public String toString(){
        String result = map.stream()
                .map(pair -> pair.getKey() + "=" + pair.getValue())
                .collect(Collectors.joining(", "));

        return result;
    }
    // Return a map entry
    public String getEntry(String key) {
        for (Pair<String, String> p : map) {
            if (p.getKey().equals(key)) {
                return p.getValue();
            }
        }
        message = "Key not found!"; // Only set message if key is not found
        return message;
    }
} // end of class ExtensionMap
