package lib;
import java.io.*;
import java.util.*;
public class Datafilestock {
    List<String>datafilestock=new ArrayList<>();
    File W1;
    FileWriter W2;
    BufferedWriter W3;

    File R1;
    FileReader R2;
    BufferedReader R3;
    String s;
    public void writestock(String namestock,Food foods)
    {  
       try {
        R1=new File(namestock);
        R2=new FileReader(R1);
        R3=new BufferedReader(R2);
        boolean check=true;
         while ((s = R3.readLine()) != null)         
         {   datafilestock.add(s);}

         

        if(namestock.equals("DessertStock"))
        {
        if (R3 != null) R3.close();
        if (R2 != null) R2.close(); 
        R1=new File("Dessert");
        R2=new FileReader(R1);
        R3=new BufferedReader(R2);
        
        while((s=R3.readLine())!=null)
        { String text[]=s.split(",");
        if(text.length>1&&text[0].equals(foods.getName())&&text[1].equals(foods.getId()))
        {check=false;}
        }if(check){throw new InvalidOperationException("Don't have "+foods.getName() +" in Dessert");}
    }

        
        if(namestock.equals("DrinksStock"))
        {
        if (R3 != null) R3.close();
        if (R2 != null) R2.close(); 
        R1=new File("Drinks");
        R2=new FileReader(R1);
        R3=new BufferedReader(R2);
        
        while((s=R3.readLine())!=null)
        { String text[]=s.split(",");
        if(text.length>1&&text[0].equals(foods.getName())&&text[1].equals(foods.getId()))
        {check=false;
         
        }}if(check){throw new InvalidOperationException("Don't have "+foods.getName() +" in Drinks");}
    }
        
        if(namestock.equals("MaincourseStock"))
        {if (R3 != null) R3.close();
        if (R2 != null) R2.close();
        R1=new File("Maincourse");
        R2=new FileReader(R1);
        R3=new BufferedReader(R2);
        
        while((s=R3.readLine())!=null)
        { String text[]=s.split(",");
        if(text.length>1&&text[0].equals(foods.getName())&&text[1].equals(foods.getId()))
        { check=false;}}if(check){throw new InvalidOperationException("Don't have "+foods.getName() +" in Maincourse");}
    
        } 
     for (String s : datafilestock){
    String text[] = s.split(",");
    if (text.length > 1 && text[0].equals(foods.getName())&& text[1].equals(foods.getId())) {
        throw new InvalidOperationException("Duplicate " + foods.getName() +" and "+foods.getId()+ " in " + namestock);
    }
    if (text.length > 1 && text[0].equals(foods.getName()) ) {
        throw new InvalidOperationException("Duplicate " + foods.getName() + " in " + namestock);
    }
    if (text.length > 1 && text[1].equals(foods.getId()) ) {
        throw new InvalidOperationException("Duplicate " + foods.getId() + " in " + namestock);
    }
}
   datafilestock.add(foods.getName()+","+foods.getId()+","+foods.getPrice()+","+foods.gettype());

         W1=new File(namestock);
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
    }
    }
       

    }
}
