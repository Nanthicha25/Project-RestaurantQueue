import java.util.ArrayList;
import java.util.List;

import Menu.*;
import Stock.*;
import lib.*;
public class test {
    public static void main(String[] args) {
   //List<shopcart>buy=new ArrayList<>();
   shopcenter shop=new shopcenter();
   Drinks Drinks=new Drinks();
Dessert Dessert=new Dessert();
Maincourse Maincourse=new Maincourse();
//กำหนดหมวดหมู่อาหารกับประเภทอาหาร
shop.SetTypetoMenu("Drinks", Drinks);
shop.SetTypetoMenu("Maincourse", Maincourse);
shop.SetTypetoMenu("Dessert", Dessert);
//สร้างรายการอาหาร
try {
  shop.Createmenu("Drinks","P000","Cha",29);
   shop.Createmenu("Drinks","P001","Cola",29);
 shop.Createmenu("Drinks","P002","Water",29);
   shop.Createmenu("Drinks","P003","Juice",29);
   //สร้างรายการอาหารชื่อซ้ำ
   shop.Createmenu("Drinks","P004","Juice",29);
} catch (Exception e) {
  System.out.println(e.getMessage());
}
//อัพเดตรายการอาหาร
try {
  shop.Createmenu("Drinks","P003","Juice",100);
} catch (Exception e) {
  System.out.println(e.getMessage());
}
//ลบรายการอาหาร
try {
  shop.Deletemenu("P003");
} catch (Exception e) {
  System.out.println(e.getMessage());
}
//แสดงรายการอาหาร
try {
  shop.Showallmenu("Drinks");
} catch (Exception e) {
  System.out.println(e.getMessage());
}
//ล้างรายการอาหาร
try {
  shop.Clearmenu("Drinks");
} catch (Exception e) {
  System.out.println(e.getMessage());
}
//ลบรายการอาหารที่ไม่มีอยู่จริง
try {
  shop.Deletemenu("P003");
} catch (Exception e) {
  System.out.println(e.getMessage());
}
//ล้างรายการอาหารในหมวดหมู่ที่ไม่มีอาหาร
try {
  shop.Clearmenu("Dessert");
} catch (Exception e) {
  System.out.println(e.getMessage());
}
//แสดงรายการอาหารในหมวดหมู่ที่ไม่มีอาหาร
 try {
  shop.Showallmenu("Maincourse");
} catch (Exception e) {
  System.out.println(e.getMessage());
}
//ค้นหารายการอาหารที่มีอยู่ในเมนู
try { shop.Createmenu("Dessert","P000","Sweet",29);
   shop.Createmenu("Dessert","P001","Cake",29);
 shop.Createmenu("Dessert","P002","Chocolate",29);
   shop.Createmenu("Dessert","P003","Cereal",29);

   shop.findById("P000");
  
} catch (Exception e) {
  System.out.println(e.getMessage());
}
//ค้นหารายการอาหารที่ไม่มีอยู่ในเมนู
try {
 shop.findById("P099");
} catch (Exception e) {
  System.out.println(e.getMessage());
}


//กำหนดประเภทอาหารในstock
DessertStock dessertStock=new DessertStock();
DrinksStock drinksStock=new DrinksStock();
MaincourseStock maincourseStock=new MaincourseStock();
shop.SetTypetoStock("Dessert",dessertStock);
shop.SetTypetoStock("Drinks",drinksStock);
shop.SetTypetoStock("Maincourse",maincourseStock);
 //เพิ่มรายการอาหารในstock
 try {
  shop.Addstock("Dessert","P001","Cake");
  shop.Addstock("Dessert","P003","Cereal");
} catch (Exception e) {
  System.out.println(e.getMessage());
}
 //ลบรายการอาหารในstock
 try {
 shop.Deletestock("Cereal");
} catch (Exception e) {
  System.out.println(e.getMessage());
}
 //เพิ่มอาหารในstockซ้ำ
 try {
   shop.Addstock("Dessert","P001","Cake");
} catch (Exception e) {
  System.out.println(e.getMessage());
}
 //เพิ่มรายการอาหารที่ไม่ได้อยู่ในเมนู
 try {
  shop.Addstock("Dessert","P001","Kitkat");
} catch (Exception e) {
  System.out.println(e.getMessage());
}
 //ล้างอาหารในstock
 try {
  shop.Addstock("Dessert","P000","Sweet");
  shop.Addstock("Dessert","P002","Chocolate");

  shop.Clearstock("Dessert");
} catch (Exception e) {
  System.out.println(e.getMessage());
}
 //ล้างอาหารในstockที่ไม่มีอาหาร
 try {
 shop.Clearstock("Maincourse");
} catch (Exception e) {
  System.out.println(e.getMessage());
}
 //ลบอาหารในstockที่ไม่มีอยู่จริง
 try {
 shop.Deletestock("Pancake");
} catch (Exception e) {
  System.out.println(e.getMessage());
}
//แสดงรายการอาหารในstock
try {
  shop.Addstock("Dessert","P000","Sweet");
  shop.Addstock("Dessert","P002","Chocolate");

 shop.Showallstock("Dessert");
} catch (Exception e) {
  System.out.println(e.getMessage());
}
//แสดงรายการอาหารในstockที่ไม่มีอาหาร
try {
 shop.Showallstock("Drinks");
} catch (Exception e) {
  System.out.println(e.getMessage());
}
//ค้นหาอาหารในstock
try {
  shop.findstockbyName("Chocolate");
} catch (Exception e) {
  System.out.println(e.getMessage());
}
//ค้นหาอาหารที่ไม่มีอยู่จริงในstock
try {
 shop.findstockbyName("Bingsu");
} catch (Exception e) {
  System.out.println(e.getMessage());
}
 //เพิ่มอาหารในตะกร้า
 try {
 shop.Addcart("Sweet", 2, null);
} catch (Exception e) {
  System.out.println(e.getMessage());
}
 //ลบอาหารในตะกร้า
 try {
 shop.Deletecart("Sweet", null);
} catch (Exception e) {
  System.out.println(e.getMessage());
}
 //เพิ่มอาหารซ้ำในตะกร้าคอมเม้นเดียวกัน
 try {
  shop.Addcart("Sweet", 2, null);
   shop.Addcart("Sweet", 1, null);
} catch (Exception e) {
  System.out.println(e.getMessage());
}
  //เพิ่มอาหารซ้ำในตะกร้าคอมเม้นต่างกัน
   try {
  
   shop.Addcart("Sweet", 1, "Not sweet");
} catch (Exception e) {
  System.out.println(e.getMessage());
}
  //ล้างอาหารในตะกร้า
  try {
  
   shop.Clearcart();
} catch (Exception e) {
  System.out.println(e.getMessage());
}
  //ล้างอาหารในตะกร้าที่ไม่มีอาหาร
  try {
  
   shop.Clearcart();
} catch (Exception e) {
  System.out.println(e.getMessage());
}
  //ลบอาหารในตะกร้าที่ไม่มีอยู่จริง
  try {
shop.Deletecart("Pancake", null);
} catch (Exception e) {
  System.out.println(e.getMessage());
}
  //เพิ่มอาหารในตะกร้าที่ไม่มีในstock
  try {
shop.Addstock("Maincourse","P009","Salmon");
} catch (Exception e) {
  System.out.println(e.getMessage());
}
  //อัพเดตอาหารในเมนูเช็คในตะกร้าและstock
  try {
 shop.Addcart("Sweet", 2, null);
   shop.Addcart("Sweet", 1, null);
   shop.Createmenu("Dessert", "P000", "Sweet", 30);
} catch (Exception e) {
  System.out.println(e.getMessage());
}
//ลบอาหารในเมนูเช็คในตะกร้าและstock
try {
shop.Deletemenu("P000");
} catch (Exception e) {
  System.out.println(e.getMessage());
}
//ลบอาหารในstockเช็คในตะกร้า
try {
shop.Addcart("Chocolate", 2, null);
shop.Deletestock("Chocolate");
} catch (Exception e) {
  System.out.println(e.getMessage());
}
//ล้างอาหารในเมนูเช็คในตะกร้าและstock
try {
  shop.Addstock("Dessert","P000","Sweet");
  shop.Addstock("Dessert","P002","Chocolate");

shop.Addcart("Chocolate", 2, null);
shop.Deletestock("Chocolate");
} catch (Exception e) {
  System.out.println(e.getMessage());
}
//ล้างอาหารในstockเช็คในตะกร้า
try {
  shop.Addstock("Dessert","P001","Cake");
  shop.Addstock("Dessert","P002","Chocolate");

shop.Addcart("Chocolate", 2, null);
shop.Clearstock("Dessert");
} catch (Exception e) {
  System.out.println(e.getMessage());
}
//เพิ่มคิว
try {
  shop.Addstock("Dessert","P001","Cake");
  shop.Addstock("Dessert","P002","Chocolate");

shop.Addcart("Chocolate", 2, null);
//shop.Addqueue();
shop.Addcart("Chocolate", 2, null);
shop.Addcart("Cake", 2, "Sweet");
//shop.Addqueue();
shop.Addcart("Cake", 10, "No Sweet");
//shop.Addqueue();
} catch (Exception e) {
  System.out.println(e.getMessage());
}
//ลบคิว
try {
 shop.Deletequeue(2);
 shop.Addcart("Cake", 2, "Sweet");
shop.Addcart("Cake", 10, "No Sweet");
//shop.Addqueue();
} catch (Exception e) {
  System.out.println(e.getMessage());
}
//ล้างคิว
try {
  shop.Clearqueue();
  //ล้างคิวที่ว่างอยู่แล้ว
  //shop.Clearqueue();
  //ลบเลขคิวที่ไม่มีอยู่จริง
shop.Deletequeue(2);
} catch (Exception e) {
   System.out.println(e.getMessage());
}
//แสดงอาหารในเมนู
try {
  shop.Showallmenu("Dessert");
} catch (Exception e) {
   System.out.println(e.getMessage());
}
//แสดงอาหารในstock
try {
  shop.Showallstock("Dessert");
} catch (Exception e) {
   System.out.println(e.getMessage());
}
//แสดงคิวทั้งหมด
try {
  shop.Showallqueue();

shop.Addqueue();
shop.Showallqueue();
//ค้นหาqueue

 shop.Addcart("Cake", 2, "Sweet");
shop.Addcart("Cake", 10, "No Sweet");
shop.Addqueue();
 shop.Addcart("Cake", 2, "Sweet");
shop.Addcart("Cake", 10, "No Sweet");
shop.Addqueue();
shop.Findqueue(2);
shop.Deletequeue(1);
shop.Findqueue(0);
shop.Deletequeue(0);
shop.Showallqueue();
} catch (Exception e) {
   System.out.println(e.getMessage());
}
}}

