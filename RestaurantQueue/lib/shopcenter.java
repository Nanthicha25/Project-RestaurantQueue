package lib;

import java.util.ArrayList;
import java.util.List;
import Menu.*;
import Stock.stock;

//คลาสกลางสำหรับเราใช้งาน 
public class shopcenter {
    food foods;
    ManageQueue manageQueue=new ManageQueue();
    typefoodcatalog typefood=new typefoodcatalog();
    Drinks Drinks=new Drinks();
    Dessert Dessert=new Dessert();
    Maincourse Maincourse=new Maincourse();
    calprice cal=new calprice();
    shopcart buyfood;
      
   
 public void Createmenu(String type,String Id, String Name, double price) throws InvalidOperationException
  { 
    if(Id==null||Id.isBlank()||Id.isEmpty())
    {throw new InvalidOperationException("Invalid Id");}
    if(price<0)
    {throw new InvalidOperationException("Price must more than 0 Baht");}
    if(type.equals("Dessert")||type.equals("Drinks")||type.equals("Maincourse"))
     {foods=new food(type, Id, Name, price);
     typefood.addgoods(foods); 
    }
    else {throw new InvalidOperationException("Don't have this type :\""+type+"\" in menu");}
    
  }
   public void Updatepromotion(String type,String Id, String Name, double price) throws InvalidOperationException
  { 
    if(Id==null||Id.isBlank()||Id.isEmpty())
    {throw new InvalidOperationException("Invalid Id");}
    if(price<0)
    {throw new InvalidOperationException("Price must more than 0 Baht");}
    if(type.equals("Dessert")||type.equals("Drinks")||type.equals("Maincourse"))
     {foods=new food(type, Id, Name, price);
     typefood.managepromotion(foods); 
    }
    else {throw new InvalidOperationException("Don't have this type :\""+type+"\" in menu");}
    
  } 

  public void SetTypetoMenu(String type,menu namemenu)
  {
    typefood.addtypefood(type,namemenu);
  }
   
  public void Deletemenu(String id)throws goodsNotFoundException
  {  typefood.deletegoods(id);
 }
           

  public void Clearmenu(String namemenu)throws InvalidOperationException, goodsNotFoundException
  {
    if(namemenu==null||namemenu.isEmpty()||namemenu.isBlank())
    {throw new InvalidOperationException("Don't have "+namemenu +"in Menu");}
    else{typefood.cleargoods(namemenu); }
    
  }
  public void findById(String Id) throws goodsNotFoundException, InvalidOperationException
  { typefood.findById(Id);}
      
      
  public void Showallmenu(String namemenu) throws goodsNotFoundException, InvalidOperationException
  {   typefood.getAllfoods(namemenu);  }

  //สำหรับจัดการstock
  //กำหนดประเภทอาหารกับชื่อstock
  public void SetTypetoStock(String type,stock namestock)
  {
    typefood.addtypestock(type,namestock);
  }

  public void Addstock(String type,String Id, String Name)throws InvalidOperationException
  { 
    boolean foundInMenu = false; // Flag สำหรับตรวจสอบ
    if (Id == null || Id.isBlank() || Id.isEmpty()) {
        throw new InvalidOperationException("Invalid Id");
    }
    if (Name == null || Name.isBlank() || Name.isEmpty()) {
        throw new InvalidOperationException("Invalid Name");
    }

    if (type.equals("Dessert") || type.equals("Drinks") || type.equals("Maincourse")) {
      { foundInMenu = true; }
                
        if (foundInMenu) {
            typefood.addstock(type,Name,Id); // ถ้าเจอ ก็เรียก addstock
        } 

    } else {
        throw new InvalidOperationException("Don't have this type : \"" + type + "\" in menu");
    }
}
public void Deletestock(String namefood) throws InvalidOperationException,goodsNotFoundException
{typefood.deletestock(namefood); }

public void Clearstock(String namestock) throws goodsNotFoundException, InvalidOperationException
{
  typefood.clearstock(namestock);
}
public void Showallstock(String namestock) throws InvalidOperationException, goodsNotFoundException
{
  typefood.getAllstock(namestock);
}

public void findstockbyName(String namefood) throws goodsNotFoundException, InvalidOperationException
  { 
     typefood.findstockbyName(namefood);
    
  
  }
    
  
 //เมธอดเพิ่มอาหารเข้าตะกร้า
   public void Addcart(String namefood, int quantity,String comment) throws InvalidOperationException 
  {
    boolean check=true;
    if(quantity<=0)
    {
      throw new InvalidOperationException("Quantity must greater than 0");
    }
  if(namefood==null||namefood.isEmpty()||namefood.isBlank())
  {
    throw new InvalidOperationException("Invalid namefood");
  }
  if(comment==null||comment.isBlank()||comment.isEmpty())
  {
    comment="No comment";
  }
   

      buyfood=new shopcart(namefood, quantity, comment);}

      public void Deletecart(String namefood,String comment) throws goodsNotFoundException
      { boolean check=false;
        if(comment==null||comment.isBlank()||comment.isEmpty())
       {
       comment="No comment";
       }
       
      buyfood.deletecart(namefood,comment);
          
      }
        public void Changequantitycart(String namefood,int quantity,String comment) throws goodsNotFoundException, InvalidOperationException
      { 
        if(comment==null||comment.isBlank()||comment.isEmpty())
       {
       comment="No comment";
       }
       if (quantity<= 0 ) {
            throw new InvalidOperationException("Invalid quantity");
        }
        if(namefood==null||namefood.isEmpty()||namefood.isBlank())
  {
    throw new InvalidOperationException("Invalid namefood");
  }
      buyfood.Setquantity(namefood, quantity, comment);
          
      }

public void Clearcart() throws InvalidOperationException
{buyfood.clearcart(); 
}

    public void Calprice()
   { cal.Calprice();}
    
   public void Addqueue()
  {manageQueue.addQueue();}
      
  public void Deletequeue(int queue)
  {manageQueue.deleteQueue(queue);}
     
  public void Clearqueue()
  {
    manageQueue.clearQueue();
  }
  public void Findqueue(int queue)  
  {
   List<String>findqueue=manageQueue.findQueue(queue);
   if(!findqueue.isEmpty())
   { for(String f:findqueue)
    {
      System.out.println(f);
    }}
  }
  public void Showallqueue()
  {List<String>allqueue=manageQueue.showQueue();
    for(String f:allqueue)
    {
      System.out.println(f);
    }

  }
}
