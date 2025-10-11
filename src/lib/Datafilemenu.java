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
   Datafilecart datafilecart=new Datafilecart();
    File R1;
    FileReader R2;
    BufferedReader R3;
    Datafilestock datafilestock = new Datafilestock();
    public void write(String namemenu,food foods,String image){
        datafilemenu.clear();
    try{  
          R1=new File(namemenu);
          R2=new FileReader(R1);
          R3=new BufferedReader(R2);
        
         if(image==null||image.isBlank())
         {
             throw  new InvalidOperationException("Must have image");}
        boolean write=true ;
        //อ่านข้อมูลเก่า
        while ((s = R3.readLine()) != null) {        
            datafilemenu.add(s);}
          R3.close(); 
          R2.close(); 
        if(!foods.gettype().equals("Drinks"))
        {
        File  CheckR1=new File("Drinks");
        FileReader  CheckR2=new FileReader(CheckR1);
         BufferedReader CheckR3=new BufferedReader(CheckR2);
           
        {  while ((s = CheckR3.readLine()) != null){
             String text[]=s.split(",");
             if(text.length>1 && text[1].equals(foods.getId()) && text[0].equals(foods.getName()))
            {   
                throw new InvalidOperationException(foods.getName()+" : "+foods.getId()+" Duplicate in Drinks");
            }
            if(text.length>1 && text[1].equals(foods.getId()))
            {   
                throw new InvalidOperationException(foods.getId()+" Duplicate Id Drinks");
            }
            if(text.length>1 && text[0].equals(foods.getName()))
            {  
                throw new InvalidOperationException(foods.getName()+" Duplicate name Drinks");
            }}}
        CheckR3.close(); 
         CheckR2.close();
        }

        
        
        if(!foods.gettype().equals("Maincourse"))
        {
         File  CheckR1=new File("Maincourse");
        FileReader  CheckR2=new FileReader(CheckR1);
         BufferedReader CheckR3=new BufferedReader(CheckR2);
           
        {  while ((s = CheckR3.readLine()) != null){
             String text[]=s.split(",");
             if(text.length>1 && text[1].equals(foods.getId()) && text[0].equals(foods.getName()))
            {   
                throw new InvalidOperationException(foods.getName()+" : "+foods.getId()+" Duplicate in Maincourse");
            }
            if(text.length>1 && text[1].equals(foods.getId()))
            {   
                throw new InvalidOperationException(foods.getId()+" Duplicate Id Maincourse");
            }
            if(text.length>1 && text[0].equals(foods.getName()))
            {   
                throw new InvalidOperationException(foods.getName()+" Duplicate name Maincourse");
            }}}
         CheckR3.close(); 
         CheckR2.close();
        }

            if(!foods.gettype().equals("Dessert"))
        {
        File  CheckR1=new File("Dessert");
        FileReader  CheckR2=new FileReader(CheckR1);
         BufferedReader CheckR3=new BufferedReader(CheckR2);
           
        {  while ((s = CheckR3.readLine()) != null){
             String text[]=s.split(",");
             if(text.length>1 && text[1].equals(foods.getId()) && text[0].equals(foods.getName()))
            {  
                throw new InvalidOperationException(foods.getName()+" : "+foods.getId()+" Duplicate in Dessert");
            }
            if(text.length>1 && text[1].equals(foods.getId()))
            {   
                throw new InvalidOperationException(foods.getId()+" Duplicate Id Dessert");
            }
            if(text.length>1 && text[0].equals(foods.getName()))
            {   
                throw new InvalidOperationException(foods.getName()+" Duplicate name Dessert");
            }}}
        CheckR3.close(); 
         CheckR2.close();
        }

        
        
        for (int i = 0; i < datafilemenu.size(); i++) {  
          String Checkdata[]=datafilemenu.get(i).split(",");   //แบ่งอาร์เรย์ตาม ","
          if(Checkdata.length>1&&Checkdata[0].equals(foods.getName())&&Checkdata.length>1 && Checkdata[1].equals(foods.getId()))
         {
           throw new InvalidOperationException("Duplicat food : "+foods.getName()+" and Id : "+foods.getId()+" in "+foods.gettype());
         }
           if(Checkdata.length>1 && Checkdata[1].equals(foods.getId()))
            {   
                throw new InvalidOperationException("Duplicate Id :"+foods.getId()+" in "+foods.gettype());
            }
         if(Checkdata.length>1&&Checkdata[0].equals(foods.getName()))
         {
           throw new InvalidOperationException("Duplicat Name : "+foods.getName()+" in "+foods.gettype());
         }
         
        if(Checkdata.length>1&&Checkdata[1].equals(foods.getId())&&!Checkdata[0].equals(foods.getName()))
         {
           throw new InvalidOperationException("Can not change namefood");
         }
         if(Checkdata.length>1&&Checkdata[1].equals(foods.getId())&&!Checkdata[3].equals(foods.gettype()))
         {
           throw new InvalidOperationException("Can not change typefood");
         }
        
        
        }



       //ถ้าไอดีไม่ซ้ำจะ add ปกติ
        if(write){
            datafilemenu.add(foods.getName()+","+foods.getId()+","+foods.getPrice()+","+foods.gettype()+";"+image);
           
        }
        W1=new File(namemenu);
          W2=new FileWriter(W1);
          W3=new BufferedWriter(W2);

         for (String f : datafilemenu) {
                W3.write(f);
                W3.newLine();
            }
    
    }catch(Exception e)
    {  //เพื่อให้ตอน throws แสดงแค่ข้อความไม่แสดง Exception
       System.out.println(e.getMessage());
    }finally{
    try { datafilemenu.clear(); 
        if (W3 != null) W3.close();
        if (W2 != null) W2.close();
        if (R3 != null) R3.close();
        if (R2 != null) R2.close();
    } catch (Exception e) {
        System.out.println(e);
    }}

}
public void managepromotion(String namemenu,food foods)
{datafilemenu.clear();
    try{  
          R1=new File(namemenu);
          R2=new FileReader(R1);
          R3=new BufferedReader(R2);
          
        boolean write=true ;
        //อ่านข้อมูลเก่า
        while ((s = R3.readLine()) != null) {        
            datafilemenu.add(s);}
          R3.close(); 
          R2.close(); 
        String image="No image";
        boolean check=true;
        //เช็คว่าไอดีชื่อในข้อมูลเก่าตรงกับช้อมูลใหม่มั้ย ถ้าตรงจะอัพเดทเป็นข้อมูลใหม่
        for (int i = 0; i < datafilemenu.size(); i++) {  
          String updatetext[]=datafilemenu.get(i).split(",");   //แบ่งอาร์เรย์ตาม ","
            if(updatetext.length>1&&updatetext[1].equals(foods.getId())&&updatetext[0].equals(foods.getName())&&updatetext[3].equals(foods.gettype()))
    {  
         write=false;  
         datafilemenu.set(i,foods.getName()+","+foods.getId()+","+foods.getPrice()+","+foods.gettype());
       File CheckR1=new File(foods.gettype()+"Stock");
       FileReader CheckR2=new FileReader(CheckR1);
       BufferedReader CheckR3=new BufferedReader(CheckR2);

        while((s=CheckR3.readLine())!=null)
        {String text[]=s.split(",");
         if(text.length>1&&text[1].equals(foods.getId()))   
         {
            datafilestock.updateStock(foods.gettype()+"Stock",foods); check=false;
         }
        }
        CheckR3.close(); CheckR2.close(); break;}
         
         if(check)
         {
           throw new InvalidOperationException("Don't have : "+foods.getName()+" in "+foods.gettype()+"Stock");
         }
        
        }

List<String>CheckCart=new ArrayList<>();
      CheckCart.clear();
      File  CheckR1=new File("BillandCart");
      FileReader  CheckR2=new FileReader(CheckR1);
      BufferedReader  CheckR3=new BufferedReader(CheckR2); 
while((s=CheckR3.readLine())!=null)
{
    CheckCart.add(s);
}
if(!CheckCart.isEmpty())
{
    for(int i=0;i<CheckCart.size();i++)
    {String text[]=CheckCart.get(i).split(",");
        if(text.length>0&&text[0].equals(foods.getName()))
        {
         datafilecart.updatewrite(foods.getName(),foods.getPrice());
        }
    }
}CheckR3.close(); CheckR2.close();
CheckCart.clear();

       //ถ้าไอดีไม่ซ้ำจะ add ปกติ
        if(write){
            datafilemenu.add(foods.getName()+","+foods.getId()+","+foods.getPrice()+","+foods.gettype());
           
        }
        W1=new File(namemenu);
          W2=new FileWriter(W1);
          W3=new BufferedWriter(W2);

         for (String f : datafilemenu) {
                W3.write(f);
                W3.newLine();
            }
    
    }catch(Exception e)
    {  //เพื่อให้ตอน throws แสดงแค่ข้อความไม่แสดง Exception
       System.out.println(e.getMessage());
    }finally{
    try { datafilemenu.clear(); 
        if (W3 != null) W3.close();
        if (W2 != null) W2.close();
        if (R3 != null) R3.close();
        if (R2 != null) R2.close();
    } catch (Exception e) {
        System.out.println(e);
    }

}}
     public void delete(String id)
     { String Namefood=null;
      String Namemenu=null;
List<String>Checkstock=new ArrayList<>(); 
    try {
      
      datafilemenu.clear();
         Checkstock.clear();
          String menu[]={"Maincourse","Dessert","Drinks"};
          boolean check=true;   

          for(String filemenu:menu)
          {datafilemenu.clear();
            File CheckR1=new File(filemenu);
          FileReader CheckR2=new FileReader(CheckR1);
          BufferedReader CheckR3=new BufferedReader(CheckR2);
          while ((s=CheckR3.readLine())!=null) 
          {  datafilemenu.add(s);}
          
          if(!datafilemenu.isEmpty()){
          for(int i=datafilemenu.size()-1;i>=0;i--)
          {String text[]=datafilemenu.get(i).split(",");
            if(text.length>3&&text[1].equals(id))
            { Namefood=text[0];
              Namemenu=text[3];
              datafilemenu.remove(i); check=false;
               break;
            }
          }}
          if(CheckR3!=null){CheckR3.close();}
          if(CheckR2!=null){CheckR2.close();}
        if(Namemenu!=null)
        {break;}
        }

         if(check)
        {
          throw new goodsNotFoundException("Don't have food Id : "+id +" in Allmenu");
        }
        if(Namemenu!=null)
        { 
           File CheckR1=new File(Namemenu+"Stock");
          FileReader CheckR2=new FileReader(CheckR1);
          BufferedReader CheckR3=new BufferedReader(CheckR2);
          while ((s=CheckR3.readLine())!=null) {
            Checkstock.add(s);
          }
          if(!Checkstock.isEmpty()){
          for(int i=Checkstock.size()-1;i>=0;i--)
          {String text[]=Checkstock.get(i).split(",");
            if(text.length>1&&text[1].equals(id))
            {  if(Namefood!=null)
              {datafilestock.delete(Namefood);
               break;}
            }
          }}
          if(CheckR3!=null){CheckR3.close();}
          if(CheckR2!=null){CheckR2.close();}}
        
          if(Namemenu!=null){
           W1=new File(Namemenu);
          W2=new FileWriter(W1);
          W3=new BufferedWriter(W2);
    for (String l : datafilemenu) {
                W3.write(l);
                W3.newLine();
            }}
            
          
     } catch (Exception   e) {
        System.out.println(e.getMessage());
     }finally
     {
        try {datafilemenu.clear();
          Checkstock.clear();
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
            datafilemenu.clear();
            W1=new File(namemenu);
            W2=new FileWriter(W1);
            W3=new BufferedWriter(W2);

            
         datafilestock.clear(namemenu+"Stock");
         
        } catch (IOException e) {
            System.out.println(e);
        }finally{
            try {
                datafilemenu.clear();
        if (W3 != null) W3.close();
        if (W2 != null) W2.close();
        if (R3 != null) R3.close();
        if (R2 != null) R2.close();
            } catch (Exception e) {
               System.out.println(e);
            }
        }
     }
     public List<String> Showallmenu(String namemenu)
     {List<String>Showallmenu=new ArrayList<>();
      Showallmenu.clear();
      datafilemenu.clear();
        try {R1=new File(namemenu);
          R2=new FileReader(R1);
          R3=new BufferedReader(R2);
          while((s=R3.readLine())!=null)
          {
            Showallmenu.add(s);
          }
          if(Showallmenu.isEmpty()||Showallmenu==null)
          {
            throw new goodsNotFoundException("Don't have food in "+namemenu);
          }
          for(int i=0;i<Showallmenu.size();i++)
          {String text[]=Showallmenu.get(i).split(",");
          if(text.length>3)
          { datafilemenu.add(text[0]+","+text[1]+","+text[2]+","+text[3]);}
          }
          
         
     } catch (Exception e) {
        System.out.println(e.getMessage());
     }finally{
        try {
          
        if (R3 != null) R3.close();
        if (R2 != null) R2.close();
        } catch (Exception e) {
             System.out.println(e.getMessage());
        }}
      return datafilemenu;
      
     }

     public List<String> findbyId(String id)
     {datafilemenu.clear();
try {   String menu[]={"Maincourse","Dessert","Drinks"};
        for(String filemenu:menu)
        {  R1=new File(filemenu);
          R2=new FileReader(R1);
          R3=new BufferedReader(R2);
          while((s=R3.readLine())!=null)
          {String text[]=s.split(",");
          if(text.length>1&&text[1].equals(id))
            {datafilemenu.add(text[0]+","+text[1]+","+text[2]+","+text[3]); break;}
          }
        if (R3 != null) R3.close();
        if (R2 != null) R2.close();
        if(!datafilemenu.isEmpty())
        {
          break;
        }
        }
          if(datafilemenu.isEmpty())
          {
            throw new goodsNotFoundException("Your Id : "+id+" not found in Allmenu");
          }
     } catch (Exception e) {
        System.out.println(e.getMessage());
     }finally{
        try {
          
        if (R3 != null) R3.close();
        if (R2 != null) R2.close();
        } catch (Exception e) {
             System.out.println(e.getMessage());
        }}
        return datafilemenu;
     }

}
