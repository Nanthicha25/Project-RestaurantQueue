package Menu;

import java.util.ArrayList;
import java.util.List;

import lib.*;

public class Dessert implements menu {
    private ArrayList<food> dessert=new ArrayList<>();
   Datafilemenu updatemenu=new Datafilemenu();
   
    private void checkRep() {
        if (dessert == null) {
            throw new RuntimeException("RI violated: desserts list cannot be null.");
        }
        // Check for duplicate products
        for (int i = 0; i < dessert.size(); i++) {
            for (int j = i + 1; j < dessert.size(); j++) {
                if (dessert.get(i).equals(dessert.get(j))) {
                    throw new RuntimeException("RI violated: catalog contains duplicate desserts.");
                }}}}
    public Dessert() 
    {    checkRep();}

    @Override
    public void addfood(food foods) throws InvalidOperationException {
        boolean check = true;
        
        for(int i=0;i<dessert.size();i++)
        {    //ถ้ารหัสอาหารซ้ำจะอัพเดทอาหารใหม่
            if(dessert.get(i).getId().equals(foods.getId()))
            { dessert.set(i, foods);
            check=false;}
            if(dessert.get(i).getName().equals(foods.getName()))
            {   check=false;
                throw new InvalidOperationException(foods.getName()+" Duplicate name Dessert");
            }
             }
        if(check)    
       {dessert.add(foods);}
        checkRep();
       updatemenu.write("Dessert",foods);
    }

    @Override
    public void deletefood(food foods) throws goodsNotFoundException {
       boolean check = true;
        for(food f:dessert)
        {if(f.equals(foods))
        {dessert.remove(foods);
         updatemenu.delete("Dessert",foods);
         check=false;
         break;
        }}
        if(check)
        {throw new goodsNotFoundException("Not food found in Dessert");}
    }

    @Override
    public void clearfood() throws goodsNotFoundException {
        boolean check=true;
        if(dessert==null||dessert.isEmpty())
        {   check=false;
            throw new goodsNotFoundException("Dessert don't have food");
        }
        if(check)
       { dessert.clear();
       updatemenu.clear("Dessert");}checkRep();
    }
     public food findById(String Id)throws goodsNotFoundException
     { boolean check=true;
        for(food f:dessert)
        {
            if(f.getId().equals(Id))
            {   check=false;
                return f;
            }
        }
        if(true)
        {throw new goodsNotFoundException("Your  Id :"+Id+" not found in Dessert");}
        return null;}

     
     @Override
     public List<food> getAllfoods() {
        return new ArrayList<>(dessert);
     
     }
    
}
