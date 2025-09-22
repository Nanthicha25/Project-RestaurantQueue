package lib;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Datafilemenu {
    List<String> check = new ArrayList<>();
    String s;
    File f1;
    FileWriter f2;
    BufferedWriter f3;

    File R1;
    FileReader R2;
    BufferedReader R3;
  
    public void write(String namemenu,food foods){
    try{ 
          R1=new File(namemenu);
          R2=new FileReader(R1);
          R3=new BufferedReader(R2);
          
        boolean write=true ;
        //อ่านข้อมูลเก่า
        while ((s = R3.readLine()) != null) {
                        check.add(s);}
        //เช็คว่าไอดีในข้อมูลเก่าตรงกับช้อมูลใหม่มั้ย ถ้าตรงจะอัพเดทเป็นข้อมูลใหม่
        for (int i = 0; i < check.size(); i++) {  
          String id[]=check.get(i).split(",");   //แบ่งอาร์เรย์ตาม ","
            if(id[1].equals(foods.getId()))
    {  
         write=false;  
         check.set(i,foods.getName()+","+foods.getId()+","+foods.getPrice()+","+foods.gettype());
        
    }}

       //ถ้าไอดีไม่ซ้ำจะ add ปกติ
        if(write){
            check.add(foods.getName()+","+foods.getId()+","+foods.getPrice()+","+foods.gettype());
           
        }
        f1=new File(namemenu);
          f2=new FileWriter(f1);
          f3=new BufferedWriter(f2);

         for (String l : check) {
                f3.write(l);
                f3.newLine();
            }
    
    }catch(Exception e)
    {
       System.out.println(e);
    }finally{
    try {   check.clear();
         f3.close(); f2.close(); 
         R3.close(); R2.close();
    } catch (Exception e) {
        System.out.println(e);
    }}
    
   

}
     public void delete(String namemenu,food foods)
     {try {
          R1=new File(namemenu);
          R2=new FileReader(R1);
          R3=new BufferedReader(R2);
        
          //อ่านข้อมูลเก่า
        while ((s = R3.readLine()) != null) {
                        check.add(s);}
                        
          for (int i = 0; i < check.size(); i++) {  
          String delete[]=check.get(i).split(",");   //แบ่งอาร์เรย์ตาม ","
            if(delete[0].equals(foods.getName())||delete[1].equals(foods.getId()))
        {
            check.remove(i);
        }}
          f1=new File(namemenu);
          f2=new FileWriter(f1);
          f3=new BufferedWriter(f2);
           
    for (String l : check) {
                f3.write(l);
                f3.newLine();
            }
            
          
     } catch (Exception e) {
        System.out.println(e);
     }finally
     {
        try {check.clear();
            f3.close(); f2.close(); 
         R3.close(); R2.close();
        } catch (Exception e) {
            System.out.println(e);
        }
     }}

     
     public void clear(String namemenu)
     { 
          try {
            
            f1=new File(namemenu);
            f2=new FileWriter(f1);
            f3=new BufferedWriter(f2);


            check.clear();
            for(String f: check)
            {f3.write(f);}

        } catch (IOException e) {
            System.out.println(e);
        }finally{
            try {
                f3.close(); f2.close(); 
                R3.close(); R2.close();
            } catch (Exception e) {
               System.out.println(e);
            }
        }
          
     

     }

}
