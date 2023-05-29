package admin.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class AdminSessionFetcher {
    
    private final String FILE_PATH = "./src/db/admin-sessions.psv";

    public void createSession(AdminSession session) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH, true))) {
            String sessionData = getSessionDataString(session);
            writer.println(sessionData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public boolean exists(AdminSession toValidateSession) {
        ArrayList<ArrayList<String>> allSessions = readAllSessions();
        
        String toValidateName = toValidateSession.getAdmin().getName();
        String toValidateEmail = toValidateSession.getEmail();
        String toValidatePassword = toValidateSession.getPassword();
        
        for (ArrayList<String> sessionData : allSessions) {
            String adminName = sessionData.get(0);
            String email = sessionData.get(1);
            String pass = sessionData.get(2);

            if (adminName.equals(toValidateName)
                && email.equalsIgnoreCase(toValidateEmail)
                && pass.equals(toValidatePassword)) {
                return true;
            }
        }
        
        return false;
    }
    
    // Devuelve un arreglo de arreglos, cuyos elementos tienen todos los atributos de los admins.
    private ArrayList<ArrayList<String>> readAllSessions() {
        ArrayList<ArrayList<String>> sessions = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                ArrayList<String> sessionData = parseAdminSessionData(line);
                sessions.add(sessionData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sessions;
    }
    
    private String getSessionDataString(AdminSession session) {
        return String.format("%s|%s|%s",
                session.getAdmin().getName(), session.getEmail(),
                session.getPassword());
    }
    
    // Devuelve un arreglo con todos los elementos de la sesión de un administrador.
    private ArrayList<String> parseAdminSessionData(String adminSessionData) {
        String[] parts = adminSessionData.split("\\|");
        String name = parts[0];
        String email = parts[1];
        String pasword = parts[2];
        return new ArrayList(Arrays.asList(name, email, pasword));
    }
}
