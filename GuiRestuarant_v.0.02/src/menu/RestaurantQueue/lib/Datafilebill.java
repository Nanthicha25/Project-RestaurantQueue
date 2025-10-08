package lib;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Datafilebill {
    List<String> check = new ArrayList<>();
    String s;
    File f1;
    FileWriter f2;
    BufferedWriter f3;

    File R1;
    FileReader R2;
    BufferedReader R3;
  
    public void write(food foods,int quantity,String comment){
    try{ //if(comment == null || comment.isBlank()) comment = "No comment";
      
          R1=new File("bill");
          R2=new FileReader(R1);
          R3=new BufferedReader(R2);
          
          boolean write=true ;
          //อ่านข้อมูลเก่า
        while ((s = R3.readLine()) != null)
                      {   check.add(s);}
        //เช็คว่าชื่ออาหารในข้อมูลเก่าตรงกับช้อมูลใหม่มั้ย ถ้าตรงจะอัพเดทเป็นข้อมูลใหม่
        for (int i = 0; i < check.size(); i++) {  
          String data[]=check.get(i).split(",");   //แบ่งอาร์เรย์ตาม ","
          if(data.length==4)
        {  if(data[0].equals(foods.getName())&&(data[3].equals(comment)))
        { write=false;  
         check.set(i,foods.getName()+","+foods.getPrice()+","+quantity+","+comment); break;}}

         if(data.length==3)
        {  if(data[0].equals(foods.getName()))
        { write=false;  
         check.set(i,foods.getName()+","+foods.getPrice()+","+quantity+","+"No comment "); break;}}
        }
        
       
       //ถ้าชื่อไม่ซ้ำจะ add ปกติ
        if(write){
            check.add(foods.getName()+","+foods.getPrice()+","+quantity+","+comment);    }

            f1=new File("bill");
          f2=new FileWriter(f1);
          f3=new BufferedWriter(f2);
         for (String l : check) {
                f3.write(l); f3.newLine();}}
    catch(Exception e)
    {
       System.out.println(e);}
    finally{
    try {
         check.clear();
         f3.close(); f2.close(); 
         R3.close(); R2.close();
    } catch (Exception e) {
        System.out.println(e);
    }}}
    
   
}
