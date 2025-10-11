package lib;



import lib.*;
import java.io.*;
import java.util.*;

public class Datafilecart {
    List<String> datafilecart = new ArrayList<>();
    String s;
    File W1;
    FileWriter W2;
    BufferedWriter W3;
    boolean check=true;
    File R1;
    FileReader R2;
    BufferedReader R3;
    public void write(String namefood, int quantity,String comment) 
    { 
      try {
        R1=new File("C:\\Users\\nanth\\OneDrive\\Documents\\NetBeansProjects\\RestaurantQueue\\src\\RestaurantQueue\\BillandCart");
        R2=new FileReader(R1);
        R3=new BufferedReader(R2);
         while ((s=R3.readLine())!=null) {
            datafilecart.add(s);}
       boolean checkstock=true;
       double price=0;
            List<String>Checkstock=new ArrayList<>();
            Checkstock.clear();
         String stock[]={"MaincourseStock","DessertStock","DrinksStock"};
         for(String filestock:stock)
      {  File CheckR1=new File(filestock);
          FileReader CheckR2=new FileReader(CheckR1);
          BufferedReader CheckR3=new BufferedReader(CheckR2);
          while ((s=CheckR3.readLine())!=null) {
            Checkstock.add(s);
          }
          for(int i=0;i<Checkstock.size();i++)
          {String text[]=Checkstock.get(i).split(",");
            if(text.length>1&&text[0].equals(namefood))
            { price=Double.parseDouble(text[2]);
              checkstock=false; break;
            }
          }
          if(CheckR3!=null){CheckR3.close();}
          if(CheckR2!=null){CheckR2.close();}}
          if(checkstock)
          {
            throw new InvalidOperationException("Don't have this food : "+namefood+" in stock");
          }
        double allprice= price * quantity;
        for (int i = 0; i < datafilecart.size(); i++){
         String text[]=datafilecart.get(i).split(",");
          if(text.length>3&&text[0].equals(namefood)&&text[3].equals(comment))
            {  int newquantity=quantity+Integer.parseInt(text[2]);
                allprice=price*newquantity;
               datafilecart.set(i, namefood+","+price+","+newquantity+","+comment+","+allprice); 
               check=false;
               break;
            }}
        
            if(check)
            {
                datafilecart.add(namefood+","+price+","+quantity+","+comment+","+allprice);
            }
        W1=new File("C:\\Users\\nanth\\OneDrive\\Documents\\NetBeansProjects\\RestaurantQueue\\src\\RestaurantQueue\\BillandCart");
        W2=new FileWriter(W1);
        W3=new BufferedWriter(W2); 
        for(String s:datafilecart)
        {
           W3.write(s);
           W3.newLine();
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }finally
    {
        try {
             datafilecart.clear();
        if (W3 != null) W3.close();
        if (W2 != null) W2.close();
        if (R3 != null) R3.close();
        if (R2 != null) R2.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
       

    }
public void Changequantity(String namefood,int quantity,String comment)
{
   try {
        R1=new File("C:\\Users\\nanth\\OneDrive\\Documents\\NetBeansProjects\\RestaurantQueue\\src\\RestaurantQueue\\BillandCart");
        R2=new FileReader(R1);
        R3=new BufferedReader(R2);
         while ((s=R3.readLine())!=null) {
            datafilecart.add(s);}
       boolean check=true;
       
      for(int i=0;i<datafilecart.size();i++)
      {String text[]=datafilecart.get(i).split(",");
      
       if(text[0].equals(namefood)&&text[3].equals(comment))
       {double price=Double.parseDouble(text[1]);
        double allprice=price*quantity;
        datafilecart.set(i,namefood+","+price+","+quantity+","+comment+","+allprice);
        check=false;break;
       }
      }
      if(check)
      {
        throw new InvalidOperationException("Don't have : "+namefood+" in cart");
      }
        W1=new File("C:\\Users\\nanth\\OneDrive\\Documents\\NetBeansProjects\\RestaurantQueue\\src\\RestaurantQueue\\BillandCart");
        W2=new FileWriter(W1);
        W3=new BufferedWriter(W2); 
        for(String writefile:datafilecart)
        {
           W3.write(writefile);
           W3.newLine();
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }finally
    {
        try {
             datafilecart.clear();
        if (W3 != null) W3.close();
        if (W2 != null) W2.close();
        if (R3 != null) R3.close();
        if (R2 != null) R2.close();
        } catch (Exception e) {
            System.out.println(e);
        }     
}}
    public void delete(String namefood,String comment)
    { try {datafilecart.clear();
        R1=new File("C:\\Users\\nanth\\OneDrive\\Documents\\NetBeansProjects\\RestaurantQueue\\src\\RestaurantQueue\\BillandCart");
        R2=new FileReader(R1);
        R3=new BufferedReader(R2);
         while ((s=R3.readLine())!=null) {
            datafilecart.add(s);}
        boolean check=true;
        for(int i=datafilecart.size()-1;i>=0;i--)
        {String text[]=datafilecart.get(i).split(",");
         if(text.length>3&&text[0].equals(namefood)&&text[3].equals(comment))
         {  datafilecart.remove(i); check=false;
            break;
         }}
        if (R3 != null) R3.close();
        if (R2 != null) R2.close();

       if(check)
       {
        throw new InvalidOperationException("Cart don't have this food : "+namefood);
       }

         W1=new File("C:\\Users\\nanth\\OneDrive\\Documents\\NetBeansProjects\\RestaurantQueue\\src\\RestaurantQueue\\BillandCart");
        W2=new FileWriter(W1);
        W3=new BufferedWriter(W2); 
        for(String s:datafilecart)
        {
           W3.write(s);
           W3.newLine();
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }finally
    {
        try {
             datafilecart.clear();
        if (W3 != null) W3.close();
        if (W2 != null) W2.close();
        if (R3 != null) R3.close();
        if (R2 != null) R2.close();
        } catch (Exception e) {
            System.out.println(e);
        }}}

        public void clear()
        {try {R1=new File("C:\\Users\\nanth\\OneDrive\\Documents\\NetBeansProjects\\RestaurantQueue\\src\\RestaurantQueue\\BillandCart");
        R2=new FileReader(R1);
        R3=new BufferedReader(R2);
         while ((s=R3.readLine())!=null) {
            datafilecart.add(s);}
            if (R3 != null) R3.close();
            if (R2 != null) R2.close();
            if(datafilecart.isEmpty())
            {
         throw new InvalidOperationException("Cart don't have food");
            }
            
            W1=new File("C:\\Users\\nanth\\OneDrive\\Documents\\NetBeansProjects\\RestaurantQueue\\src\\RestaurantQueue\\BillandCart");
        W2=new FileWriter(W1);
        W3=new BufferedWriter(W2);
        
        datafilecart.clear();
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }finally{
            try {
                 datafilecart.clear();
        if (W3 != null) W3.close();
        if (W2 != null) W2.close();
        if (R3 != null) R3.close();
        if (R2 != null) R2.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
            
        }

        public void updatewrite(String namefood,double newprice) 
    { 
      try {
        R1=new File("C:\\Users\\nanth\\OneDrive\\Documents\\NetBeansProjects\\RestaurantQueue\\src\\RestaurantQueue\\BillandCart");
        R2=new FileReader(R1);
        R3=new BufferedReader(R2);
         while ((s=R3.readLine())!=null) {
            datafilecart.add(s);}
      
        for(int i=0;i<datafilecart.size();i++)
        {String text[]=datafilecart.get(i).split(",");
        if(text.length>3&&text[0].equals(namefood))
        {int quantity=Integer.parseInt(text[2]);
         String comment=text[3];
         double allprice=newprice*quantity;
            datafilecart.set(i, namefood+","+newprice+","+quantity+","+comment+","+allprice);
        }
        }
        W1=new File("C:\\Users\\nanth\\OneDrive\\Documents\\NetBeansProjects\\RestaurantQueue\\src\\RestaurantQueue\\BillandCart");
        W2=new FileWriter(W1);
        W3=new BufferedWriter(W2); 
        for(String s:datafilecart)
        {
           W3.write(s);
           W3.newLine();
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }finally
    {
        try {
             datafilecart.clear();
        if (W3 != null) W3.close();
        if (W2 != null) W2.close();
        if (R3 != null) R3.close();
        if (R2 != null) R2.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
       

    }
    public void updatedelete(String namefood)
    {try {datafilecart.clear();
        R1=new File("C:\\Users\\nanth\\OneDrive\\Documents\\NetBeansProjects\\RestaurantQueue\\src\\RestaurantQueue\\BillandCart");
        R2=new FileReader(R1);
        R3=new BufferedReader(R2);
         while ((s=R3.readLine())!=null) {
            datafilecart.add(s);}
      
        for(int i=datafilecart.size()-1;i>=0;i--)
        {String text[]=datafilecart.get(i).split(",");
        if(text.length>0&&text[0].equals(namefood))
        {  datafilecart.remove(i);}}
        
        
       
        W1=new File("C:\\Users\\nanth\\OneDrive\\Documents\\NetBeansProjects\\RestaurantQueue\\src\\RestaurantQueue\\BillandCart");
        W2=new FileWriter(W1);
        W3=new BufferedWriter(W2); 
        for(String s:datafilecart)
        {
           W3.write(s);
           W3.newLine();
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }finally
    {
        try {
             datafilecart.clear();
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
