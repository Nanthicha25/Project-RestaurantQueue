package lib;
import java.io.*;
import java.util.*;

public class Datafilestock {
    List<String>datafilestock=new ArrayList<>();
    File W1;
    FileWriter W2;
    BufferedWriter W3;
    Datafilecart datafilecart=new Datafilecart();
    File R1;
    FileReader R2;
    BufferedReader R3;
    String s;
    public void writestock(String namestock,String namefood,String id) 
    {  datafilestock.clear();
       try {
        R1=new File(namestock+"Stock");
        R2=new FileReader(R1);
        R3=new BufferedReader(R2);
        boolean check=true;
         while ((s = R3.readLine()) != null)         
         {   datafilestock.add(s);}

         
double price=0;
        if(namestock.equals("Dessert"))
        {if(R3 != null) R3.close();
    if(R2 != null) R2.close();
        R1=new File("Dessert");
        R2=new FileReader(R1);
        R3=new BufferedReader(R2);
        
        while((s=R3.readLine())!=null)
        { String text[]=s.split(",");
        if(text.length>1&&text[0].equals(namefood)&&text[1].equals(id))
        {price=Double.parseDouble(text[2]);
            check=false;}}
        R3.close();
    R2.close();}
       
    
     
        
        if(namestock.equals("Drinks"))
        {if(R3 != null) R3.close();
    if(R2 != null) R2.close();
        R1=new File("Drinks");
        R2=new FileReader(R1);
        R3=new BufferedReader(R2);
        
        while((s=R3.readLine())!=null)
        { String text[]=s.split(",");
        if(text.length>1&&text[0].equals(namefood)&&text[1].equals(id))
        {price=Double.parseDouble(text[2]);
         check=false;
        }} R3.close();R2.close();}
        
        
        if(namestock.equals("Maincourse"))
        {if(R3 != null) R3.close();
    if(R2 != null) R2.close();
        R1=new File("Maincourse");
        R2=new FileReader(R1);
        R3=new BufferedReader(R2);
        
        while((s=R3.readLine())!=null)
        { String text[]=s.split(",");
        if(text.length>1&&text[0].equals(namefood)&&text[1].equals(id))
        { price=Double.parseDouble(text[2]);
            check=false;} 
    }R3.close();
        R2.close();} 

    if(check){throw new InvalidOperationException("Don't have "+namefood +" in "+namestock);}
        
    
     for (String s : datafilestock){
    String text[] = s.split(",");
    if (text.length > 1 && text[0].equals(namefood)&& text[1].equals(id)) {
        throw new InvalidOperationException("Duplicate " + namefood +" : "+id+ " in " + namestock+"Stock");
    }
}     
        

   datafilestock.add(namefood+","+id+","+price+","+namestock);

         W1=new File(namestock+"Stock");
          W2=new FileWriter(W1);
          W3=new BufferedWriter(W2);  
      
    for(String f:datafilestock)
    { W3.write(f);
      W3.newLine();}

      
      
        } catch (Exception e) {
        System.out.println(e.getMessage());
    }finally
    {try {   datafilestock.clear();
        if (W3 != null) W3.close();
        if (W2 != null) W2.close();
        if (R3 != null) R3.close();
        if (R2 != null) R2.close();
    } catch (Exception e) {
        System.out.println(e);
    }}
}

public void delete(String namefood)
{
      String Namestock=null;
     
    try {
      
      datafilestock.clear();
        
          String stock[]={"MaincourseStock","DessertStock","DrinksStock"};
          boolean check=true;   

          for(String filestock:stock)
         { datafilestock.clear();
          R1=new File(filestock);
          R2=new FileReader(R1);
          R3=new BufferedReader(R2);
          while ((s=R3.readLine())!=null) {
            datafilestock.add(s);
          }
          if(!datafilestock.isEmpty()){
          for(int i=datafilestock.size()-1;i>=0;i--)
          {String text[]=datafilestock.get(i).split(",");
            if(text.length>3&&text[0].equals(namefood))
            { 
              Namestock=text[3];
              datafilestock.remove(i); check=false;
               break;
            }
          }}if (R3 != null) R3.close();
        if (R2 != null) R2.close();
          if(Namestock!=null){break;}
        }
         if(check)
        {
          throw new goodsNotFoundException("Don't have food : "+namefood +" in Allstock");
        }
        if(Namestock!=null)
        { W1=new File(Namestock+"Stock");
          W2=new FileWriter(W1);
          W3=new BufferedWriter(W2); 
        for(String deletestock:datafilestock)
        {
          W3.write(deletestock);
          W3.newLine();
        }
        } 

     datafilecart.updatedelete(namefood);
       
    } catch (Exception e) {
        System.out.println(e.getMessage());
}finally{
    try {
        datafilestock.clear();
        
        if (W3 != null) W3.close();
        if (W2 != null) W2.close();
        if (R3 != null) R3.close();
        if (R2 != null) R2.close();
    } catch (Exception e) {
         System.out.println(e.getMessage());
    }}
}
public void clear(String namestock)
{
    try { 
        R1=new File(namestock);
          R2=new FileReader(R1);
          R3=new BufferedReader(R2);
          while((s=R3.readLine())!=null)
          {
           datafilestock.add(s);
          }
          if(datafilestock.isEmpty()||datafilestock==null)
          {
            throw new goodsNotFoundException("Don't have food in "+namestock);
          }
        
        W1=new File(namestock);
        W2=new FileWriter(W1);
        W3=new BufferedWriter(W2);
        datafilecart.clear();
        datafilestock.clear();
    } catch (Exception e) {
       System.out.println(e.getMessage());
    }
    finally
    {
        try {
         datafilestock.clear();
      
                if (W3 != null) W3.close();
                if (W2 != null) W2.close();
                if (R3 != null) R3.close();
                if (R2 != null) R2.close();
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
}
 public void updateStock(String namestock, food foods) {
        try {
            
            R1 = new File(namestock);
            R2 = new FileReader(R1);
            R3 = new BufferedReader(R2);

            while ((s = R3.readLine()) != null) {
                datafilestock.add(s);
            }
            R3.close();
            R2.close();

            boolean found = false;

            
            for (int i = 0; i < datafilestock.size(); i++) {
                String[] text = datafilestock.get(i).split(",");
                if (text.length > 1 && text[1].equals(foods.getId())) {
                    // อัพเดทข้อมูลใหม่แทนที่เก่า
                    datafilestock.set(i, foods.getName() + "," + foods.getId() + "," + foods.getPrice() + "," + foods.gettype());
    
                    found = true;
                    break;
                }
            }

            if (!found) {
                throw new InvalidOperationException("Don't have " + foods.getId() + " in " + namestock);
            }
            // เขียนกลับไปยังไฟล์ใหม่ (overwrite)
            W1 = new File(namestock);
            W2 = new FileWriter(W1);
            W3 = new BufferedWriter(W2);

            for (String line : datafilestock) {
                W3.write(line);
                W3.newLine();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                datafilestock.clear();
                if (W3 != null) W3.close();
                if (W2 != null) W2.close();
                if (R3 != null) R3.close();
                if (R2 != null) R2.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
     public List<String> Showallstock(String namestock)
     {List<String>Showallstock=new ArrayList<>();
      Showallstock.clear();
        try {R1=new File(namestock);
          R2=new FileReader(R1);
          R3=new BufferedReader(R2);
          while((s=R3.readLine())!=null)
          {
            Showallstock.add(s);
          }
          if(Showallstock.isEmpty()||Showallstock==null)
          {
            throw new goodsNotFoundException("Don't have food in "+namestock);
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
      return Showallstock;
      
     }
 public List<String> findbyname(String namefood)
     {datafilestock.clear();
try {   String stock[]={"MaincourseStock","DessertStock","DrinksStock"};
        for(String filestock:stock)
        {  R1=new File(filestock);
          R2=new FileReader(R1);
          R3=new BufferedReader(R2);
          while((s=R3.readLine())!=null)
          {String text[]=s.split(",");
          if(text[0].equals(namefood))
            {datafilestock.add(s); break;}
          }
        if (R3 != null) R3.close();
        if (R2 != null) R2.close();
        if(!datafilestock.isEmpty())
        {
          break;
        }}
        
          if(datafilestock.isEmpty())
          {
            throw new goodsNotFoundException(namefood+" not found in Allstock");
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
        return datafilestock;
     }


}





       
