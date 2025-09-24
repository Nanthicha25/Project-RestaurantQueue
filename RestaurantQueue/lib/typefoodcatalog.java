package lib;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import Menu.*;

public class typefoodcatalog {
private final Hashtable<String, menu> data = new Hashtable<>();
private final Hashtable<String, menu> datastock = new Hashtable<>();
List<food> Allmenu = new ArrayList<>();
List<food> Allstock = new ArrayList<>();

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
    //ลบอาหารในเมนู
    public void deletegoods(food foods) throws goodsNotFoundException {
      String type = foods.gettype();
       menu typefood = data.get(type);

        typefood.deletefood(foods);}
    //ลบอาหารทั้งหมดในเมนู
        public void cleargoods(String namemenu) throws goodsNotFoundException {
       menu typefood = data.get(namemenu);
        Allmenu.clear();
       typefood.clearfood();
        }
    //หาอาหารในเมนูโดยรหัส
    public void findById(String Id,String namemenu) throws goodsNotFoundException, InvalidOperationException {
        menu typemenu=data.get(namemenu);
        if(typemenu==null)
        { throw new InvalidOperationException("Don't have type menu : "+namemenu+" in my Menu");}
        
        if (Id == null || Id.isBlank()||Id.isEmpty()) 
       {throw new goodsNotFoundException("Don't have  food Id :" + Id +" in "+namemenu );}
        food f=typemenu.findById(Id);
        System.out.println(f.getName()+" "+f.getId()+" "+f.getPrice()+" "+f.gettype());
        
       }
    
    
    //แสดงอาหารทั้งหมดในหมวดหมู่อาหาร
    public void  getAllfoods(String allmenu) throws goodsNotFoundException, InvalidOperationException { 
       menu Allmenu=data.get(allmenu);
       if (Allmenu == null) {
            throw new InvalidOperationException("Don't have type menu : "+allmenu+" in my menu");
        }
        List<food>f= Allmenu.getAllfoods();
        
        if(f==null||f.isEmpty())
        {
             throw new goodsNotFoundException("Don't have food in " + allmenu );
        }
         for(food goods:f)
         {
           System.out.println(goods.getName()+" "+goods.getId()+" "+goods.getPrice()+" "+goods.gettype());
         }}
        
    //สำหรับอาหารในstock
     public void addtypestock(String type, menu typestock) {
        // การใช้ .put() ใน Hashtable จะแทนที่ของเก่าโดยอัตโนมัติถ้ามี Key ซ้ำ
        //เก็บข้อมูลชนิดstock คู่กับประเภทอาหารในเมนูอาหาร
        data.put(type, typestock);
    }
    public void addstock(food foods)
    { 
      String typestock=foods.getId();
    }
}
