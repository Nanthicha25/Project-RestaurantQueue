/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lib;
import java.io.*;
import java.util.*;
/**
 *
 * @author ACER
 */
public class FileService {
    private static final String FILE_PATH = "MenuList.txt";

    public static List<Food> loadFoods() throws InvalidOperationException {
        List<Food> foods = new ArrayList<>();
        File file = new File(FILE_PATH);
        
        if (!file.exists()) {
            try { 
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    String type = parts[0];
                    String Name = parts[1];
                    String Id = parts[2];
                    double price = Double.parseDouble(parts[3]);
                    String imagePath = parts[4];
                    foods.add(new Food(type, Id, Name, price, imagePath));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return foods;
    }

    public static void saveFood(Food food) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            bw.write(food.gettype() + "," + food.getName() + "," + food.getId() + "," 
                     + food.getPrice() + ";" + food.getImagePath());
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error saving food: " + e.getMessage());
        }
    }
}
