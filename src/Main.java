//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ExtensionMap em = new ExtensionMap();
        System.out.println(em); // map empty
        System.out.println("--------------------------------------------------");
        mapAddRemoveTest(em); // add/remove some k-v pairs
        System.out.println("--------------------------------------------------");
        System.out.println("Entries: " + "{"+em+"}"); // test the getMap() method
        System.out.println("--------------------------------------------------");
        mapKVexistsTest(em); // does the map contain defined keys?
        System.out.println("--------------------------------------------------");

    }

    // add and remove k,v pairs from the map
    // "user-friendly messages"
    public static void mapAddRemoveTest(ExtensionMap e) {
        e.addEntry(".txt", "Notepad++");
        System.out.println(e.getMessage());
        e.addEntry(".html", "Mozilla Firefox");
        System.out.println(e.getMessage());
        e.addEntry(".png", "Paint");
        System.out.println(e.getMessage());
        e.addEntry(".pdf", "Adobe Acrobat Reader");
        System.out.println(e.getMessage());

        e.removeEntry(".png");
        System.out.println(e.getMessage());
        e.removeEntry(".cpp");
        System.out.println(e.getMessage());
    }

    // print the map's contents to the console
    public static void mapPrintTest(ExtensionMap e) {
        System.out.println("Entries: " + e.toString());
    }

    // test whether certain keys exist in the map
    public static void mapKVexistsTest(ExtensionMap e) {
        String[] testKeys = {".docx", ".html", ".txt", ".cpp"};

        for (String s : testKeys)
            System.out.println(s.concat(" -> ").concat(e.getEntry(s)));

    }
}