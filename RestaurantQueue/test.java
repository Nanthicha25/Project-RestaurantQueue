import java.util.ArrayList;
import java.util.List;

import Menu.*;
import lib.*;
public class test {
    public static void main(String[] args) {
   List<shopcart>buy=new ArrayList<>();
   shopcenter shop=new shopcenter();
   Drinks Drinks=new Drinks();
   //กำหนดหมวดหมู่อาหารกับประเภทอาหาร
Dessert Dessert=new Dessert();
Maincourse Maincourse=new Maincourse();
shop.SetTypetoMenu("Drinks", Drinks);
shop.SetTypetoMenu("Maincourse", Maincourse);
shop.SetTypetoMenu("Dessert", Dessert);
//สร้างรายการอาหาร และ เพิ่มอาหารลงเมนูอาหารแต่ละหมวดหมู่อัตโนมัติ
   try {
    shop.Createmenu("Drinks","P001" , "Chanom", 40);
    shop.Createmenu("Drinks","P002" , "Coffee", 40);
   shop.Createmenu("Drinks","P003" , "Milk", 40);
   shop.Createmenu("Drinks","P004" , "Water", 40);
   shop.Createmenu("Drinks","P005" , "Juice", 40);
  } catch (InvalidOperationException e) {
    System.out.println(e);
  }
  //แสดงรายการอาหารทั้งหมดในหมวดหมู่อาหารที่ส่งชื่อไป ถ้าไม่พบจะแสดงผลว่าไม่มีอาหารในหมวดหมู่นี้และถ้าชื่ออาหารไม่ตรงหมวดหมู่ที่มีอยู่จะแสดงผลว่าไม่มีชื่อหมวดหมู่อาหารนี้ในเมนู
  try {
    shop.Showallmenu("Drinks");
} catch (Exception e) {
    System.out.println(e.getMessage());
}

try {
    shop.Showallmenu("Dessert");
} catch (Exception e) {
    System.out.println(e.getMessage());
}

try {
    shop.Showallmenu("abc");
} catch (Exception e) {
    System.out.println(e.getMessage());
}
//ค้นหารายการอาหารจากรหัสอาหารและชื่อหมวดหมู่อาหารที่ต้องการค้นหา
try {
  shop.findById("P002", "Drinks");
} catch (Exception e) {
   System.out.println(e.getMessage());
}
//จำลองลบอาหารและค้นหารายการอาหารที่ถูกลบ
try {
  shop.Deletemenu("P001");
  shop.findById("P001", "Drinks");
} catch (Exception e) {
  System.out.println(e.getMessage());
}
//เพิ่มรายการอาหารซ้ำ
try {
shop.Createmenu("Drinks","P002" , "Chanom", 40);
} catch (Exception e) {
   System.out.println(e.getMessage());
}
try {
  shop.Showallmenu("Drinks");
} catch (Exception e) {
  System.out.println(e.getMessage());
} 
//ลบรายการอาหารทั้งหมดในหมวดหมู่ที่ส่งชื่อไป
try {
  //shop.Clearmenu("Drinks");
} catch (Exception e) {
  System.out.println(e.getMessage());
}
//เพิ่มรายการอาหารที่ชื่อซ้ำแต่รหัสไม่ซ้ำ
try {
 shop.Createmenu("Drinks","P009" , "Juice", 40);
} catch (Exception e) {
  System.out.println(e.getMessage());
}
//ลบรายการอาหารที่ไม่มีอยู่ในหมวดหมู่อาหาร
try {
  shop.Deletemenu("P008");
} 
catch(Exception e) {
  System.out.println(e.getMessage());
}
//ลบรายการอาหารทั้งหมดในหมวดหมู่อาหารที่ไม่มีรายการอาหาร

  try {
    shop.Clearmenu("Dessert");
  } catch (Exception e) {
    System.out.println(e.getMessage());
  }
  //แสดงรายกาารอาหารในหมวดหมู่อาหารที่ไม่มีอาหารใดๆ
  try {
    shop.Showallmenu("Maincourse");
  } catch (Exception e) {
    System.out.println(e.getMessage());
  } 
  //เพิ่มอาหารในตะกร้าและเพิ่มอาหารซ้ำ
  try {
    shop.Addmenu( "P004", 3,"Mineral water");
    shop.Addmenu("P004", 1,"Mineral water");
    shop.Addmenu("P004", 1,"boil water");
    shop.Addmenu("P011", 1,"no comment");
    //shop.Addmenu("P004", 1,"");
    shop.Calprice();
  } catch (Exception e) {
    System.out.println(e.getMessage());
  }
    
    }
}
