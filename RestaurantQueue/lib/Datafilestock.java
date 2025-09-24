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
    public void writestock(String namestock,food foods)
    {  
       try {
        R1=new File(namestock);
        R2=new FileReader(R1);
        R3=new BufferedReader(R2);
        
         while ((s = R3.readLine()) != null)         
         {   datafilestock.add(s);}

        if(namestock=="DessertStock")
        {
        R1=new File("Dessert");
        R2=new FileReader(R1);
        R3=new BufferedReader(R2);
        
        while((s=R3.readLine())!=null)
        { String text[]=s.split(",");
        if(text.length>1&&text[0].equals(foods.getName())&&text[1].equals(foods.getId()))
        {
         datafilestock.add(foods.getName()+","+foods.getId()+","+foods.getPrice()+","+foods.gettype());
        }}}

        
        if(namestock=="DrinksStock")
        {
        R1=new File("Drinks");
        R2=new FileReader(R1);
        R3=new BufferedReader(R2);
        
        while((s=R3.readLine())!=null)
        { String text[]=s.split(",");
        if(text.length>1&&text[0].equals(foods.getName())&&text[1].equals(foods.getId()))
        {
         datafilestock.add(foods.getName()+","+foods.getId()+","+foods.getPrice()+","+foods.gettype());
        }}}
        
        if(namestock=="MaincourseStock")
        {
        R1=new File("Maincourse");
        R2=new FileReader(R1);
        R3=new BufferedReader(R2);
        
        while((s=R3.readLine())!=null)
        { String text[]=s.split(",");
        if(text.length>1&&text[0].equals(foods.getName())&&text[1].equals(foods.getId()))
        {
         datafilestock.add(foods.getName()+","+foods.getId()+","+foods.getPrice()+","+foods.gettype());
        }}}
    
        W1=new File(namestock);
          W2=new FileWriter(W1);
          W3=new BufferedWriter(W2);  

    for(String f:datafilestock)
    { W3.write(f);}

    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
       

    }
}
