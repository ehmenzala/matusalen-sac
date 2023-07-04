package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class SolicitudFetcher {
    
    private final String FILE_PATH = "./src/db/solicitudes.psv";
    
    public int createNewId() {
        int maxNumber = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
            String line = reader.readLine();
            while (line != null) {
                String[] parts = line.split("\\|");
                int readNumber = Integer.parseInt(parts[0]);
                if (readNumber > maxNumber) {
                    maxNumber = readNumber;
                }
                line = reader.readLine();

            }
            System.out.println("MAX NUMBER: " + maxNumber);
            return maxNumber + 1;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public void createSolicitud(Solicitud solicitud) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH, true))) {
            String solicitudData = getSolicitudDataString(solicitud);
            writer.println(solicitudData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Solicitud> readAllSolicitudes() {
        ArrayList<Solicitud> solicitudes = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Solicitud solicitud = parseSolicitudData(line);
                solicitudes.add(solicitud);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return solicitudes;
    }
    
    private void saveAllSolicitudes(List<Solicitud> solicitudes) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH))) {
            for (Solicitud solicitud : solicitudes) {
                String bookData = getSolicitudDataString(solicitud);
                writer.println(bookData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private String getSolicitudDataString(Solicitud solicitud) {
        return String.format("%d|%s|%s|%s",
                solicitud.getId(), solicitud.getTitulo(), solicitud.getEstado(), solicitud.getDNI());
    }
    
    private Solicitud parseSolicitudData(String solicitudData) {
        String[] parts = solicitudData.split("\\|");
        int id = Integer.parseInt(parts[0]);
        String titulo = parts[1];
        String estado = parts[2];
        String dni = parts[3];

        return new Solicitud(id, titulo, estado, dni);
    }
    
    
}
