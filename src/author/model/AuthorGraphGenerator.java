package author.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AuthorGraphGenerator {

    private final Map<String, ArrayList<String>> authors;
    private final String FILE_PATH = "./src/db/autores.psv";

    public AuthorGraphGenerator() {
        this.authors = new HashMap<>();
        fillGraphData();
    }
    
    public void addAuthor(String authorName, ArrayList<String> collabs) {
        authors.put(authorName, collabs);
    }

    public void readGraphData() {
        for (String author : authors.keySet()) {
            System.out.println("# " + author);
            System.out.println(authors.get(author));
        }
    }

    private void fillGraphData() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            boolean isFirstAuthor = true;
            String authorKey = "";
            ArrayList<String> collaborators = new ArrayList<>();

            while ((line = reader.readLine()) != null) {

                if (line.equals("")) {
                    isFirstAuthor = true; // Reset isFirstAuthor
                    authors.put(authorKey, collaborators); // Add new element to authors map
                    collaborators = new ArrayList<>(); // Create a new instance for collaborators
                    continue;
                }
                
                if (isFirstAuthor) {
                    authorKey = line;
                    isFirstAuthor = false;
                } else {
                    collaborators.add(line);
                }
            }
        } catch (Exception e) {}
    }
}
