/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.StockItem to edit this template
 */
package menu.RestaurantQueue.lib;
import lib.food; 
/**
 *
 * @author TRinn0015
 */
public class StockItem {
    private final food menuItem; 
    private int quantity;       

    public StockItem(food menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    // --- Getters ---
    public food getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }
    public void addQuantity(int amount) {
        if (this.quantity + amount < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        this.quantity += amount;
    }
    
    // (ทางเลือก: ถ้าต้องการตั้งค่าใหม่ทั้งหมด)
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
