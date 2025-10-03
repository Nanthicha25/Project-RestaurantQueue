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
        {   if(drinks.get(i).getName().toLowerCase().equals(foods.getName().toLowerCase())&&!drinks.get(i).getId().equals(foods.getId()))
            {check=false;
             throw new InvalidOperationException(foods.getName()+" Duplicate name in Drinks");
            }
            //ถ้ารหัสอาหารซ้ำจะอัพเดทอาหารใหม่
            if(drinks.get(i).getId().equals(foods.getId()))
            { drinks.set(i, foods);
            check=false; } 
       
            }    
            
            
           if(check)    
       {drinks.add(foods);  }
        checkRep();
        updatemenu.write("Drinks",foods);
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

   //  public List<String> findById(String Id)throws goodsNotFoundException
   //  {  return updatemenu.findbyId(Id,"Drinks");}
        
     
     public List<String> getAllfoods()
     {return updatemenu.Showallmenu("Drinks");
     }
}
