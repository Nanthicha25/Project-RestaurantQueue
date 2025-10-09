package lib;

import java.io.*;
import java.util.*;

public class DatafileQueue {
    String s;
    File W1;
    FileWriter W2;
    BufferedWriter W3;
    calprice allprice=new calprice();
    List<String> datafilequeue=new ArrayList<>();
    File R1;
    FileReader R2;
    BufferedReader R3;
    Datafilecart datafilecart=new Datafilecart();
     List<String> NumQueue = new ArrayList<>();
    private int Nextqueue()
    {int queue=0;
        try {
        R1=new File("Queue");
        R2=new FileReader(R1);
        R3=new BufferedReader(R2);
        while((s=R3.readLine())!=null)
        {
            NumQueue.add(s);
        }
        for(int i=0;i<NumQueue.size();i++)
        { String text[]=NumQueue.get(i).split(",");
          if(text.length>1){
            try {
              int q=Integer.parseInt(text[0]);
            if(q>queue)
            {
                queue=q;
            }  
            } catch (NumberFormatException e) {
                // TODO: handle exception
            }
               }} 
          
        } catch (Exception e) {
            System.out.println(e.getMessage());
    }finally
    {
        try {NumQueue.clear();
        if (R3 != null) R3.close();
        if (R2 != null) R2.close();
        } catch (Exception e) {
         System.out.println(e.getMessage());
        }}
        return queue+1;}
    
    public void addqueue()
    {try { datafilequeue.clear();
        R1=new File("BillandCart");
        R2=new FileReader(R1);
        R3=new BufferedReader(R2);
        while((s=R3.readLine())!=null)
        {
            datafilequeue.add(s);
        }
        int updatequeue=Nextqueue();
        W1=new File("Queue");
        W2=new FileWriter(W1,true);
        W3=new BufferedWriter(W2);
        double Allprice=allprice.Calprice();
         for(int i=0;i<datafilequeue.size();i++)
         {   W3.write(updatequeue+","+datafilequeue.get(i)+","+Allprice);
            W3.newLine();
           
         }
       datafilecart.clear();
    
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }finally
    {
        try {datafilequeue.clear();
            if (W3 != null) W3.close();
        if (W2 != null) W2.close();
        if (R3 != null) R3.close();
        if (R2 != null) R2.close();
        } catch (Exception e) {
         System.out.println(e.getMessage());
        }
    }

    }

    public void delete(int queue)
    { datafilequeue.clear();
       
        try {
        R1=new File("Queue");
        R2=new FileReader(R1);
        R3=new BufferedReader(R2);
        while((s=R3.readLine())!=null)
        {
            datafilequeue.add(s);
        }
         if (R3 != null) R3.close();
        if (R2 != null) R2.close();
        if(datafilequeue.isEmpty())
        {
            throw new InvalidOperationException("Don't have queue");
        }
        boolean check=true;
       for(int i = datafilequeue.size() - 1; i >= 0; i--)
        { String[] text = datafilequeue.get(i).split(",");
            int q = Integer.parseInt(text[0]);
            if(q==queue)
            {
                datafilequeue.remove(i);
                check=false;
                
            }
        }
        if(check)
        {
            throw new InvalidOperationException("Don't have this queue: "+queue+" in my Queue");
        }
        if(!datafilequeue.isEmpty()){
        W1=new File("Queue");
        W2=new FileWriter(W1);
        W3=new BufferedWriter(W2);
        
        
        for(int j=0;j<datafilequeue.size();j++)
         {  String text[]=datafilequeue.get(j).split(",");
           int checkq=Integer.parseInt(text[0]);
           if(checkq<queue)
           { W3.write(checkq+","+text[1]+","+text[2]+","+text[3]+","+text[4]+","+text[5]+","+text[6]);
            W3.newLine();}
            else{
              W3.write(checkq-1+","+text[1]+","+text[2]+","+text[3]+","+text[4]+","+text[5]+","+text[6]);
            W3.newLine();  } }
           
        if (W3 != null) W3.close();
        if (W2 != null) W2.close(); 
           }else{
        W1=new File("Queue");
        W2=new FileWriter(W1);
        W3=new BufferedWriter(W2);}
            
         
        
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }finally
    {
        try {datafilequeue.clear();
            if (W3 != null) W3.close();
        if (W2 != null) W2.close();
        if (R3 != null) R3.close();
        if (R2 != null) R2.close();

        } catch (Exception e) {
         System.out.println(e.getMessage());
        }}}
    
        public void clear()
        {
        try {
                W1=new File("Queue");
                W2=new FileWriter(W1);
                W3=new BufferedWriter(W2);
                datafilequeue.clear();
            } catch (Exception e) {
        System.out.println(e.getMessage());
    }finally
    {
        try {datafilequeue.clear();
            if (W3 != null) W3.close();
        if (W2 != null) W2.close();
        if (R3 != null) R3.close();
        if (R2 != null) R2.close();

        } catch (Exception e) {
         System.out.println(e.getMessage());
        }}}

        public List<String> findQueue(int queue)
        {List<String> YourQueue=new ArrayList<>();
     try {
        datafilequeue.clear();
         R1=new File("Queue");
        R2=new FileReader(R1);
        R3=new BufferedReader(R2);
                
                while ((s=R3.readLine())!=null) {
                    datafilequeue.add(s);
                }

                for(int i=0;i<datafilequeue.size();i++)
                {String text[]=datafilequeue.get(i).split(",");
                int q=Integer.parseInt(text[0]);
                    if(q==queue)
                    {
                      YourQueue.add(datafilequeue.get(i));

                    }
                }
                 if (R3 != null) R3.close();
               if (R2 != null) R2.close();
                if(YourQueue.isEmpty())
                {
                  throw new InvalidOperationException("Don't have queue : "+queue);
                }
        

            } catch (Exception e) {
        System.out.println(e.getMessage());
    }finally
    {
        try {
            datafilequeue.clear();
            
        if (R3 != null) R3.close();
        if (R2 != null) R2.close();

        } catch (Exception e) {
         System.out.println(e.getMessage());
        }}
        return YourQueue;}
      
        

        public List<String> Showallqueue()
        {
        try {
            datafilequeue.clear();
        R1=new File("Queue");
        R2=new FileReader(R1);
        R3=new BufferedReader(R2);
                
      while ((s=R3.readLine())!=null) 
       { datafilequeue.add(s);}  
       if (R3 != null) R3.close();
        if (R2 != null) R2.close();

       if(datafilequeue.isEmpty())
        {
            throw new InvalidOperationException("Don't have queue");
        }
            }catch (Exception e) {
        System.out.println(e.getMessage());
    }finally
    {
        try {
            
            if (W3 != null) W3.close();
        if (W2 != null) W2.close();
        if (R3 != null) R3.close();
        if (R2 != null) R2.close();

        } catch (Exception e) {
         System.out.println(e.getMessage());}}
        return datafilequeue;
        }
    
}

