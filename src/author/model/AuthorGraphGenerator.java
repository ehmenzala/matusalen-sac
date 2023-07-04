package author.model;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;

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

    /* Remove this shoot */
    public void readGraphData() {
        for (String author : authors.keySet()) {
            System.out.println("# " + author);
            System.out.println(authors.get(author));
        }
    }
    
    public void displayGraphOnJPnael(JPanel panel) {
        for (Map.Entry<String, ArrayList<String>> author : authors.entrySet()) {
            String authorName = author.getKey();
            displayAuthorsWithCollaborators(authorName, author.getValue(), panel);
            panel.add(Box.createVerticalStrut(10));
        }
    }
    
    private void displayAuthorsWithCollaborators(String author, ArrayList<String> collaborators, JPanel panel) {
        displayAuthor(author, panel);
        
        for (String collaborator : collaborators) {
            if (authors.containsKey(collaborator)) {
                displayAuthorsWithCollaborators(author, authors.get(collaborator), panel);
            } else {
                displayCollaborator(collaborator, panel);
            }
        }
    }
    
    private void displayAuthor(String authorName, JPanel panel) {
        JLabel authorLabel = new JLabel("• " + authorName);
        authorLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        panel.add(authorLabel);
    }
    
    private void displayCollaborator(String collaborator, JPanel panel) {
        JLabel collaboratorLabel = new JLabel("  - " + collaborator);
        collaboratorLabel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        panel.add(collaboratorLabel);
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
