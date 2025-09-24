package lib;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Datafilemenu {
    List<String> check = new ArrayList<>();
    String s;
    File W1;
    FileWriter W2;
    BufferedWriter W3;

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

        if(!foods.gettype().equals("Drinks"))
        {R1=new File("Drinks");
          R2=new FileReader(R1);
          R3=new BufferedReader(R2);
           
        {  while ((s = R3.readLine()) != null){
             String text[]=s.split(",");
            if(text.length>1 && text[1].equals(foods.getId()))
            {   write=false;
                throw new InvalidOperationException(foods.getId()+" Duplicate Id Drinks");
            }
            if(text.length>1 && text[0].equals(foods.getName()))
            {   write=false;
                throw new InvalidOperationException(foods.getName()+" Duplicate name Drinks");
            }}}}

        
        
        if(!foods.gettype().equals("Maincourse"))
        {R1=new File("Maincourse");
          R2=new FileReader(R1);
          R3=new BufferedReader(R2);
           
        {  while ((s = R3.readLine()) != null){
             String text[]=s.split(",");
            if(text.length>1 && text[1].equals(foods.getId()))
            {   write=false;
                throw new InvalidOperationException(foods.getId()+" Duplicate Id Maincourse");
            }
            if(text.length>1 && text[0].equals(foods.getName()))
            {   write=false;
                throw new InvalidOperationException(foods.getName()+" Duplicate name Maincourse");
            }}}}

            if(!foods.gettype().equals("Dessert"))
        {R1=new File("Dessert");
          R2=new FileReader(R1);
          R3=new BufferedReader(R2);
           
        {  while ((s = R3.readLine()) != null){
             String text[]=s.split(",");
            if(text.length>1 && text[1].equals(foods.getId()))
            {   write=false;
                throw new InvalidOperationException(foods.getId()+" Duplicate Id Dessert");
            }
            if(text.length>1 && text[0].equals(foods.getName()))
            {   write=false;
                throw new InvalidOperationException(foods.getName()+" Duplicate name Dessert");
            }}}}

        //เช็คว่าไอดีในข้อมูลเก่าตรงกับช้อมูลใหม่มั้ย ถ้าตรงจะอัพเดทเป็นข้อมูลใหม่
        for (int i = 0; i < check.size(); i++) {  
          String id[]=check.get(i).split(",");   //แบ่งอาร์เรย์ตาม ","
            if(id.length>1&&id[1].equals(foods.getId()))
    {  
         write=false;  
         check.set(i,foods.getName()+","+foods.getId()+","+foods.getPrice()+","+foods.gettype());
        
    }}

       //ถ้าไอดีไม่ซ้ำจะ add ปกติ
        if(write){
            check.add(foods.getName()+","+foods.getId()+","+foods.getPrice()+","+foods.gettype());
           
        }
        W1=new File(namemenu);
          W2=new FileWriter(W1);
          W3=new BufferedWriter(W2);

         for (String l : check) {
                W3.write(l);
                W3.newLine();
            }
    
    }catch(Exception e)
    {  //เพื่อให้ตอน throws แสดงแค่ข้อความไม่แสดง Exception
       System.out.println(e.getMessage());
    }finally{
    try {   check.clear();
        if (W3 != null) W3.close();
        if (W2 != null) W2.close();
        if (R3 != null) R3.close();
        if (R2 != null) R2.close();
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
            if(delete.length>1&&delete[0].equals(foods.getName())&&delete[1].equals(foods.getId()))
        {
            check.remove(i); break;
        }}
          W1=new File(namemenu);
          W2=new FileWriter(W1);
          W3=new BufferedWriter(W2);
           
    for (String l : check) {
                W3.write(l);
                W3.newLine();
            }
            
          
     } catch (Exception e) {
        System.out.println(e);
     }finally
     {
        try {check.clear();
        if (W3 != null) W3.close();
        if (W2 != null) W2.close();
        if (R3 != null) R3.close();
        if (R2 != null) R2.close();
        } catch (Exception e) {
            System.out.println(e);
        }
     }}

     
     public void clear(String namemenu)
     { 
          try {
            
            W1=new File(namemenu);
            W2=new FileWriter(W1);
            W3=new BufferedWriter(W2);

            check.clear();

        } catch (IOException e) {
            System.out.println(e);
        }finally{
            try {
        if (W3 != null) W3.close();
        if (W2 != null) W2.close();
        if (W3 != null) R3.close();
        if (W2 != null) R2.close();
            } catch (Exception e) {
               System.out.println(e);
            }
        }
          
     

     }

}
