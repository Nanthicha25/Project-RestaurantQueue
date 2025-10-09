package lib;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;


import Menu.*;
import Stock.stock;

public class typefoodcatalog {
private final Hashtable<String, menu> data = new Hashtable<>();
private final Hashtable<String, stock> datastock = new Hashtable<>();
Datafilemenu datafilemenu=new Datafilemenu();
Datafilestock datafilestock=new Datafilestock();
Datafilecart buy=new Datafilecart();

List<String> Allstock = new ArrayList<>();

    public void addtypefood(String type, menu typefood) {
        // การใช้ .put() ใน Hashtable จะแทนที่ของเก่าโดยอัตโนมัติถ้ามี Key ซ้ำ
        //เก็บข้อมูลชนิดอาหาร คู่กับประเภทอาหารในเมนูอาหาร
        data.put(type, typefood);
    }

    //เพิ่มอาหารในเมนู
    public void addgoods(food foods) throws InvalidOperationException {
     String type = foods.gettype();
       menu typefood = data.get(type);

        typefood.addfood(foods);}


          public void managepromotion(food foods) throws InvalidOperationException {
        datafilemenu.managepromotion(foods.gettype(),foods);

        }  
    //ลบอาหารในเมนู
    public void deletegoods(String Id) throws goodsNotFoundException {
     
      datafilemenu.delete(Id);}
    //ลบอาหารทั้งหมดในเมนู
        public void cleargoods(String namemenu) throws goodsNotFoundException {
       menu typefood = data.get(namemenu);
        
       typefood.clearfood();
        }
    //หาอาหารในเมนูโดยรหัส
    public void findById(String Id) throws goodsNotFoundException, InvalidOperationException {
        
        if (Id == null || Id.isBlank()||Id.isEmpty()) 
       {throw new goodsNotFoundException("Invalid Id");}
        List<String>text=datafilemenu.findbyId(Id);
        for(String t:text)
       { System.out.println(t);}
        
       }
    
    
    //แสดงอาหารทั้งหมดในหมวดหมู่อาหาร
    public void  getAllfoods(String namemenu) throws goodsNotFoundException, InvalidOperationException { 
       menu Namemenu=data.get(namemenu);
       if (Namemenu == null) {
            throw new InvalidOperationException("Don't have type menu : "+namemenu+" in my menu");
        }
        List<String>f= Namemenu.getAllfoods();
        
         for(String goods:f)
         {
           System.out.println(goods);
         }}
        
    //สำหรับอาหารในstock
     public void addtypestock(String type, stock typestock) {
        // การใช้ .put() ใน Hashtable จะแทนที่ของเก่าโดยอัตโนมัติถ้ามี Key ซ้ำ
        //เก็บข้อมูลชนิดstock คู่กับประเภทอาหารในเมนูอาหาร
        datastock.put(type, typestock);
    }
    public void addstock(String namestock,String namefood, String id) throws InvalidOperationException 
    {
      stock typeStock=datastock.get(namestock);
      if(typeStock==null)
      {
        throw new InvalidOperationException("Don't have type menu : "+namestock+" in my menu");
      }else { 
        typeStock.addfoodstock(namefood,id);}
    }
    public void deletestock(String namefood) throws InvalidOperationException, goodsNotFoundException
    { 
      datafilestock.delete(namefood);}

      public void clearstock(String namemenu) throws goodsNotFoundException, InvalidOperationException
      {
        stock typesStock=datastock.get(namemenu); 
        if(typesStock==null)
      {
        throw new InvalidOperationException("Don't have type menu in my menu");
      }else {typesStock.clearfoodstock(); Allstock.clear();}
      }
      public void getAllstock(String namestock) throws InvalidOperationException, goodsNotFoundException
      {
        stock Namestock=datastock.get(namestock);
        if(Namestock==null)
        {throw new InvalidOperationException("Don't have type menu : "+namestock+" in my menu");
        }
        List <String> stock=Namestock.getAllfoodsstock();
         for(String goods:stock)
         {
           System.out.println(goods);
         }}

         public void findstockbyName(String namefood) throws goodsNotFoundException, InvalidOperationException {
        
        List<String> text=datafilestock.findbyname(namefood);
       for(String t:text)
       { System.out.println(t);}
        }
       
       
        
      }
    
