/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package rentalApk;

import java.util.HashMap;

public class Admin {
    // Simulasi database admin menggunakan HashMap
    private HashMap<String, String> adminDatabase;

    // Konstruktor untuk inisialisasi database admin
    public Admin() {
        adminDatabase = new HashMap<>();
        // Tambahkan admin default (username, password)
        adminDatabase.put("admin", "12345");
 
    }

    // Method untuk memvalidasi login admin
    public boolean login(String username, String password) {
        return adminDatabase.containsKey(username) && adminDatabase.get(username).equals(password);
    }

    // Tambahkan method untuk menambahkan admin baru jika diperlukan
    public void addAdmin(String username, String password) {
        adminDatabase.put(username, password);
    }
}

