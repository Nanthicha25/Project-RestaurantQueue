package Menu;

import java.util.ArrayList;
import java.util.List;

import lib.*;

public class Drinks implements menu {
private ArrayList<food> drinks=new ArrayList<>();
Datafilemenu updatemenu=new Datafilemenu();
   private void checkRep() {
        if (drinks == null) {
            throw new RuntimeException("RI violated: drinks list cannot be null.");
        }
        // Check for duplicate products
        for (int i = 0; i < drinks.size(); i++) {
            for (int j = i + 1; j < drinks.size(); j++) {
                if (drinks.get(i).getId().equals(drinks.get(j).getId())) {
                    throw new RuntimeException("RI violated: catalog contains duplicate drinks.");
                }
            }
        }
    }

    

    @Override
    public void addfood(food foods) throws InvalidOperationException {
       boolean check = true;
        for(int i=0;i<drinks.size();i++)
        {   //ถ้ารหัสอาหารซ้ำจะอัพเดทอาหารใหม่
            if(drinks.get(i).getId().equals(foods.getId()))
            { drinks.set(i, foods);
            check=false; break;} 
       
            if(drinks.get(i).getName().toLowerCase().equals(foods.getName().toLowerCase()))
            {check=false;
             throw new InvalidOperationException(foods.getName()+" Duplicate name in Drinks");
            }}    
            
            
           if(check)    
       {drinks.add(foods);  }
        checkRep();
        updatemenu.write("Drinks",foods);
    }

    @Override
    public void deletefood(food foods) throws goodsNotFoundException {
        boolean check=true;
        for(food f:drinks)
        {if(f.equals(foods))
        {drinks.remove(foods);
         updatemenu.delete("Drinks",foods);
         check=false;
         break;
        }}
        if(check)
        {throw new goodsNotFoundException("Not found food in Drinks");}
        
    }

    @Override
    public void clearfood() throws goodsNotFoundException {
        if(drinks==null||drinks.isEmpty())
        {
            throw new goodsNotFoundException("Drinks don't have food");
        }
        drinks.clear();
        checkRep();
        updatemenu.clear("Drinks");
    }

     public food findById(String Id)throws goodsNotFoundException
     {  boolean check=true;
        for(food f:drinks)
        {
            if(f.getId().equals(Id))
            {   check=false;
                return f;
            }
        }
        if(true)
        {throw new goodsNotFoundException("Your  Id :"+Id+" not found in Drinks");}
        return null;

     }
     public List<food> getAllfoods()
     {return new ArrayList<>(drinks);
     }
}
