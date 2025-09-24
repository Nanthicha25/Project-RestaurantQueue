package lib;

import java.util.ArrayList;
import java.util.List;

import Menu.*;
import Stock.stock;

//คลาสกลางสำหรับเราใช้งาน 
public class shopcenter {
    food foods;
    typefoodcatalog typefood=new typefoodcatalog();
    Drinks Drinks=new Drinks();
    Dessert Dessert=new Dessert();
    Maincourse Maincourse=new Maincourse();
    calprice cal=new calprice();
    List<shopcart>buy=new ArrayList<>(); //สำหรับตะกร้าอาหาร
    List<food>allmenu=new ArrayList<>(); //สำหรับเก็บเมนูอาหารทั้งหมดที่สร้าง

  public void Createmenu(String type,String Id, String Name, double price) throws InvalidOperationException
  { if(Id==null||Id.isBlank()||Id.isEmpty())
    {throw new InvalidOperationException("Invalid Id");}
    if(price<0)
    {throw new InvalidOperationException("Price must more than 0 Baht");}
    if(type.equals("Dessert")||type.equals("Drinks")||type.equals("Maincourse"))
     {foods=new food(type, Id, Name, price);
    allmenu.add(foods);
    typefood.addgoods(foods);}
    else {throw new InvalidOperationException("Don't have this type :\""+type+"\" in menu");}

    
    
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
