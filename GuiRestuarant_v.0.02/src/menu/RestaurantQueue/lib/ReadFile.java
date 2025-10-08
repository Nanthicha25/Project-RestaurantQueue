/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.ReadFile to edit this template
 */
package menu.RestaurantQueue.lib;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import lib.food;
/**
 *
 * @author TRinn0015
 */
public class ReadFile {
 
    public static List<food> readMenuItems(String filename) {
        List<food> menuList = new ArrayList<>();
        String line;
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                
                if (data.length >= 5) {
                    try {
                        String type = data[0].trim();
                        String id = data[1].trim();
                        String name = data[2].trim();
                        double price = Double.parseDouble(data[3].trim());
                        String imagePath = data[4].trim();
                        food item = new food(type, id, name, price, imagePath);
                        menuList.add(item);
                    } catch (NumberFormatException e) {
                        System.err.println("WARNING: Skipping line. Invalid price format in line: " + line);
                    } catch (RuntimeException e) { 
                        System.err.println("WARNING: Skipping line. Data validation failed (checkRep) in line: " + line + ". Error: " + e.getMessage());
                    } catch (Exception e) { 
                        System.err.println("SEVERE ERROR: Could not process food data line: " + line);
                        e.printStackTrace();
                    }
                } else {
                    System.err.println("WARNING: Skipping line. Incomplete data (less than 5 fields) in line: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("SEVERE ERROR: Could not read file " + filename + ". Ensure the file exists and is accessible.");
            e.printStackTrace();
        }

        return menuList;
    }
}

