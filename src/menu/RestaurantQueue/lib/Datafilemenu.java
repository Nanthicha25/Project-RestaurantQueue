package lib;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Datafilemenu {
    List<String> datafilemenu = new ArrayList<>();
    String s;
    File W1;
    FileWriter W2;
    BufferedWriter W3;

    File R1;
    FileReader R2;
    BufferedReader R3;
  
    public void write(String namemenu,Food foods){
    try{ 
          R1=new File(namemenu);
          R2=new FileReader(R1);
          R3=new BufferedReader(R2);
          
        boolean write=true ;
        //อ่านข้อมูลเก่า
        while ((s = R3.readLine()) != null) {        
            datafilemenu.add(s);}

        if(!foods.gettype().equals("Drinks"))
        {if (R3 != null) R3.close();
         if (R2 != null) R2.close();
          R1=new File("Drinks");
          R2=new FileReader(R1);
          R3=new BufferedReader(R2);
           
        {  while ((s = R3.readLine()) != null){
             String text[]=s.split(",");
            if(text.length>1 && text[1].equals(foods.getId()))
            {   write=false;
                throw new InvalidOperationException(foods.getId()+" Duplicate Id Drinks");
            }
            if(text.length>1 && text[0].toLowerCase().equals(foods.getName().toLowerCase()))
            {   write=false;
                throw new InvalidOperationException(foods.getName()+" Duplicate name Drinks");
            }}}}

        
        
        if(!foods.gettype().equals("Maincourse"))
        {if (R3 != null) R3.close();
         if (R2 != null) R2.close();
          R1=new File("Maincourse");
          R2=new FileReader(R1);
          R3=new BufferedReader(R2);
           
        {  while ((s = R3.readLine()) != null){
             String text[]=s.split(",");
            if(text.length>1 && text[1].equals(foods.getId()))
            {   write=false;
                throw new InvalidOperationException(foods.getId()+" Duplicate Id Maincourse");
            }
            if(text.length>1 && text[0].toLowerCase().equals(foods.getName().toLowerCase()))
            {   write=false;
                throw new InvalidOperationException(foods.getName()+" Duplicate name Maincourse");
            }}}}

            if(!foods.gettype().equals("Dessert"))
        {if (R3 != null) R3.close();
         if (R2 != null) R2.close();
         R1=new File("Dessert");
          R2=new FileReader(R1);
          R3=new BufferedReader(R2);
           
        {  while ((s = R3.readLine()) != null){
             String text[]=s.split(",");
            if(text.length>1 && text[1].equals(foods.getId()))
            {   write=false;
                throw new InvalidOperationException(foods.getId()+" Duplicate Id Dessert");
            }
            if(text.length>1 && text[0].toLowerCase().equals(foods.getName().toLowerCase()))
            {   write=false;
                throw new InvalidOperationException(foods.getName()+" Duplicate name Dessert");
            }}}}

        //เช็คว่าไอดีในข้อมูลเก่าตรงกับช้อมูลใหม่มั้ย ถ้าตรงจะอัพเดทเป็นข้อมูลใหม่
        for (int i = 0; i < datafilemenu.size(); i++) {  
          String id[]=datafilemenu.get(i).split(",");   //แบ่งอาร์เรย์ตาม ","
            if(id.length>1&&id[1].equals(foods.getId()))
    {  
         write=false;  
         datafilemenu.set(i,foods.getName()+","+foods.getId()+","+foods.getPrice()+","+foods.gettype());
        
    }}

       //ถ้าไอดีไม่ซ้ำจะ add ปกติ
        if(write){
            datafilemenu.add(foods.getName()+","+foods.getId()+","+foods.getPrice()+","+foods.gettype());
           
        }
        W1=new File(namemenu);
          W2=new FileWriter(W1);
          W3=new BufferedWriter(W2);

         for (String l : datafilemenu) {
                W3.write(l);
                W3.newLine();
            }
    
    }catch(Exception e)
    {  //เพื่อให้ตอน throws แสดงแค่ข้อความไม่แสดง Exception
       System.out.println(e.getMessage());
    }finally{
    try {   datafilemenu.clear();
        if (W3 != null) W3.close();
        if (W2 != null) W2.close();
        if (R3 != null) R3.close();
        if (R2 != null) R2.close();
    } catch (Exception e) {
        System.out.println(e);
    }}
    
   

}
     public void delete(String namemenu,Food foods)
     {try {
          R1=new File(namemenu);
          R2=new FileReader(R1);
          R3=new BufferedReader(R2);
        
          //อ่านข้อมูลเก่า
        while ((s = R3.readLine()) != null) {
                        datafilemenu.add(s);}
                        
          for (int i = 0; i < datafilemenu.size(); i++) {  
          String delete[]=datafilemenu.get(i).split(",");   //แบ่งอาร์เรย์ตาม ","
            if(delete.length>1&&delete[0].toLowerCase().equals(foods.getName().toLowerCase())&&delete[1].equals(foods.getId()))
        {
            datafilemenu.remove(i); break;
        }}
          W1=new File(namemenu);
          W2=new FileWriter(W1);
          W3=new BufferedWriter(W2);
           
    for (String l : datafilemenu) {
                W3.write(l);
                W3.newLine();
            }
            
          
     } catch (Exception e) {
        System.out.println(e);
     }finally
     {
        try {datafilemenu.clear();
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

            datafilemenu.clear();

        } catch (IOException e) {
            System.out.println(e);
        }finally{
            try {
        if (W3 != null) W3.close();
        if (W2 != null) W2.close();
        if (R3 != null) R3.close();
        if (R2 != null) R2.close();
            } catch (Exception e) {
               System.out.println(e);
            }
        }
          
     

     }

}
