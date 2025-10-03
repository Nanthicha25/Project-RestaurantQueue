package lib;

import java.io.*;
import java.util.*;

public class calprice {
    File W1;
    FileWriter W2;
    BufferedWriter W3;
    String s;
    File R1;
    FileReader R2;
    BufferedReader R3;
    
    List<String>price=new ArrayList();
    public double Calprice()
    {double cal=0;
        try {
       R1=new File("BillandCart");
        R2=new FileReader(R1); 
        R3=new BufferedReader(R2);
     while ((s=R3.readLine())!=null) {
        price.add(s);
     }
    
     for(int i=0;i<price.size();i++)
     {
        String text[]=price.get(i).split(",");
        if(text.length>4)
        {
        double p=Double.parseDouble(text[4]);
         cal+=p;
        }
     }
    System.out.println(cal);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }finally
    {
        try {
           price.clear();
        if (W3 != null) W3.close();
        if (W2 != null) W2.close();
        if (R3 != null) R3.close();
        if (R2 != null) R2.close();  
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
       
    }
    return cal;
        

    }
   
}
