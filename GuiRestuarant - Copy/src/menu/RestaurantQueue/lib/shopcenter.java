package lib;

import java.util.ArrayList;
import java.util.List;
import Menu.*;
import Stock.stock;
import java.io.*;

//คลาสกลางสำหรับเราใช้งาน 
public class shopcenter {
    food foods;
    typefoodcatalog typefood = new typefoodcatalog();
    Drinks Drinks = new Drinks();
    Dessert Dessert = new Dessert();
    Maincourse Maincourse = new Maincourse();
    calprice cal = new calprice();
    List<shopcart>buy = new ArrayList<>(); //สำหรับตะกร้าอาหาร
    List<food>allmenu = new ArrayList<>(); //สำหรับเก็บเมนูอาหารทั้งหมดที่สร้าง
    
    
    public shopcenter() {
      this.typefood = new typefoodcatalog();
      this.allmenu = new ArrayList<>();
          
      // นำ Menu Catalog ที่สร้างแล้วไปใส่ใน typefoodcatalog
      this.typefood.addtypefood("Maincourse", Maincourse);
      this.typefood.addtypefood("Dessert", Dessert);
      this.typefood.addtypefood("Drinks", Drinks);
    }
      
    public void saveMenuDataToText() {
      // ใช้ Pipe (|) เป็นตัวแบ่งข้อมูล
      final String DELIMITER = "|"; 
      final String FILENAME = "menu_data.csv";
        
      try (PrintWriter pw = new PrintWriter(new FileWriter(FILENAME))) {
        for (lib.food item : this.allmenu) {
          // รูปแบบ: Type|ID|Name|Price|ImagePath
          String line = item.gettype() + DELIMITER +
                        item.getId() + DELIMITER +
                        item.getName() + DELIMITER +
                        item.getPrice() + DELIMITER +
                        item.getImagePath();
                
          pw.println(line);
        }
          System.out.println("Menu data saved to CSV successfully.");
            
      } catch (IOException e) {
          System.err.println("Error saving menu data to CSV: " + e.getMessage());
      }

    }

    // โหลดข้อมูลเมนูจากไฟล์ข้อความ (.csv)
    public void loadMenuDataFromText() {
      // ต้องใช้ \\| เพื่อ escape อักขระพิเศษ | ใน Regular Expression
      final String DELIMITER = "\\|"; 
      final String FILENAME = "menu_data.csv";

      // เคลียร์ข้อมูลในหน่วยความจำก่อนโหลดใหม่
      this.allmenu.clear(); 
        
      try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
        String line;
        while ((line = br.readLine()) != null) {
          String[] parts = line.split(DELIMITER);
                
          if (parts.length == 5) { 
            try {
              String type = parts[0];
              String id = parts[1];
              String name = parts[2];
              // แปลง String กลับเป็น double
              double price = Double.parseDouble(parts[3]); 
              String imagePath = parts[4];
                        
              // เรียก Createmenu เพื่อสร้าง food object และเพิ่มเข้าสู่ Catalog อีกครั้ง
              this.Createmenu(type, id, name, price, imagePath); 
                        
            } catch (NumberFormatException e) {
              System.err.println("Skipping invalid price format in CSV: " + line);
            }
          }
        }
          System.out.println("Menu data loaded from CSV successfully.");
            
      } 
      catch (java.io.FileNotFoundException e) {
        System.out.println("Menu data file (CSV) not found. Starting with empty menu.");
      } 
      catch (IOException | InvalidOperationException e) {
        System.err.println("Error reading menu data from CSV: " + e.getMessage());
      }
    }

    public List<food> getAllmenu() {
      return allmenu;
    }

    public void Createmenu(String type,String Id, String Name, double price, String imagePath) throws InvalidOperationException { 
        if(Id==null||Id.isBlank()||Id.isEmpty()) {
            throw new InvalidOperationException("Invalid Id");
        }
        if(price<0) {
          throw new InvalidOperationException("Price must more than 0 Baht");
        }
      
        food newFood;
        
        if (type.equals("Dessert") || type.equals("Drinks") || type.equals("Maincourse")) {
          newFood = new food(type, Id, Name, price, imagePath);
        }
        else {
          throw new InvalidOperationException("Doesn't have this type :\" " +type+ " \" in menu");
        }
        
        foods = newFood;
        typefood.addgoods(newFood);
        allmenu.add(newFood);
    }
    public void SetTypetoMenu(String type,menu namemenu)
    {
      typefood.addtypefood(type,namemenu);
    }
    
    public void Deletemenu(String id)throws InvalidOperationException, goodsNotFoundException
    { food deletemenu;
      int i=0;
      boolean check=false;
      for(food f:allmenu)
      {
        if(f.getId().equals(id))
        {
            deletemenu=f; allmenu.remove(f);
            typefood.deletegoods(deletemenu); check=true; break;} i++;}
            if(check)
            { allmenu.remove(i);}
            else
            {
              throw new goodsNotFoundException("Don't have food Id : "+id +" in Menu");
            }}
    public void Clearmenu(String namemenu)throws InvalidOperationException, goodsNotFoundException
    {
      if(namemenu==null||namemenu.isEmpty()||namemenu.isBlank())
      {throw new InvalidOperationException("Don't have "+namemenu +"in Menu");}
      else{typefood.cleargoods(namemenu);}
      
    }
    public void findById(String Id) throws goodsNotFoundException, InvalidOperationException
    { boolean check=true;
      for(food f:allmenu){
      if(f.getId().equals(Id))
      { check=false;
        String namemenu=f.gettype();
        typefood.findById(Id,namemenu);
      }}
      if(check)
      {throw new InvalidOperationException("Don't have food Id :" + Id +" in Menu");}
    
        }
  
    public void Showallmenu(String namemenu) throws goodsNotFoundException, InvalidOperationException
    {   typefood.getAllfoods(namemenu);  }

    //สำหรับจัดการstock
    //กำหนดประเภทอาหารกับชื่อstock
    public void SetTypetoStock(String type,stock namestock)
    {
      typefood.addtypestock(type,namestock);
    }

    public void Addstock(String type,String Id, String Name, double price)throws InvalidOperationException
    {food foods;
      if(Id==null||Id.isBlank()||Id.isEmpty())
      {throw new InvalidOperationException("Invalid Id");}
      if(price<0)
      {throw new InvalidOperationException("Price must more than 0 Baht");}
      if(Name==null||Name.isBlank()||Name.isEmpty())
      {throw new InvalidOperationException("Invalid Name");}

      if(type.equals("Dessert")||type.equals("Drinks")||type.equals("Maincourse"))
      {for(food f:allmenu)
      {
        if(f.getName().equals(Name)&&f.getId().equals(Id))
        { foods=f; 
          typefood.addstock(foods); break;
        }
      }}else {throw new InvalidOperationException("Don't have this type : \""+type+"\" in menu");}}

      
    
    
    


    //เมธอดเพิ่มอาหารเข้าตะกร้า
  /*  public void Addmenu(String Id, int quantity,String comment) throws InvalidOperationException 
    { if(quantity<=0)
      {
        throw new InvalidOperationException("Quantity must greater than 0");
      }
      food buyFood=null;
      shopcart shopFood=null;
      boolean checkallmenu=false;
      boolean check=false;
    // if(comment == null || comment.isBlank()) comment = "No comment";
      int i=0;
      
      for(food f:allmenu)
      {
        if(f.getId().equals(Id))
        {  
          buyFood=f;
          checkallmenu=true;
        }}
      
        //กรณีอาหารที่เพิ่มซ้ำกับในตะกร้าที่มีอยู่
      for(shopcart f:buy)
      {  //ถ้าอาหารอย่างเดียวกันแต่คอมเม้นต่างกันจะแยกกันในบิล
        if(f.getFoods().getId().equals(Id)&&!(f.getcomment().equals(comment)))
        {  
          shopFood=f; check=false; checkallmenu=true;break;
        } 
        if(f.getFoods().getId().equals(Id)&&f.getcomment().equals(comment))//ถ้าอาหารอย่างเดียวกันคอมเม้นเดียวกันจะรวมกันในบิล
        {  
          shopFood=f; check=true; checkallmenu=false;break;
        }i++;}

        if(check)
        {shopFood.increaseQuantity(quantity);
        buy.set(i, new shopcart(buyFood, shopFood.getQuantity(), comment));
        }
      if(checkallmenu)
      {shopcart shop=new shopcart(buyFood, quantity, comment);
      buy.add(shop);}
      if(checkallmenu==false && check==false)
      {throw new InvalidOperationException("Not found food in menu");}
    }

      public double Calprice()
      { double total=0;
        for(shopcart shop:buy)
        {
        total+=cal.normalclient(shop);
        }
        return total;
      }*/
}
