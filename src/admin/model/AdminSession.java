package admin.model;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class AdminSession {
    
    private Admin admin;
    private String email;
    private String password;

    public AdminSession(Admin admin, String email, String password) {
        this.admin = admin;
        this.email = email;
        this.password = encryptWithSHA256(password);
    }
    
    public Admin getAdmin() {
        return admin;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    private static String encryptWithSHA256 (String toEncrypt) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedHash = digest.digest(toEncrypt.getBytes(StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder();
            
            for (byte b : encodedHash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            String encryptedString = hexString.toString();
            return encryptedString;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
