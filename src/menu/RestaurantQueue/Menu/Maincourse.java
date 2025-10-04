package Menu;

import java.util.ArrayList;
import java.util.List;

import lib.*;
public class Maincourse implements menu{
private ArrayList<Food> maincourse=new ArrayList<>();
Datafilemenu updatemenu=new Datafilemenu();
    private void checkRep() {
        if (maincourse == null) {
            throw new RuntimeException("RI violated: maincourse list cannot be null.");
        }
        // Check for duplicate products
        for (int i = 0; i < maincourse.size(); i++) {
            for (int j = i + 1; j < maincourse.size(); j++) {
                if (maincourse.get(i).equals(maincourse.get(j))) {
                    throw new RuntimeException("RI violated: catalog contains duplicate maincourse.");
                }
            }
        }
    }

    public Maincourse() 
    {    checkRep();}
    
    @Override
    public void addfood(Food foods) throws InvalidOperationException {
       boolean check = true;
        for(int i=0;i<maincourse.size();i++)
        {    //ถ้ารหัสอาหารซ้ำจะอัพเดทอาหารใหม่
            if(maincourse.get(i).getId().equals(foods.getId()))
            { maincourse.set(i, foods);
            check=false; break;}
            if(maincourse.get(i).getName().toLowerCase().equals(foods.getName().toLowerCase()))
            {
                throw new InvalidOperationException("Duplicate name in Maincourse ");
            }
             }
        if(check)    
       {maincourse.add(foods);}
        checkRep();
        updatemenu.write("Maincourse",foods);
    }

    @Override
    public void deletefood(Food foods) throws goodsNotFoundException {
        boolean check=true;
        for(Food f:maincourse)
        {if(f.equals(foods))
        {maincourse.remove(foods);
         updatemenu.delete("Maincourse",foods);
        check=false;
         break;
        }}
        if(check)
        {throw new goodsNotFoundException("Not found food in Maincourse");}
    }

    @Override
    public void clearfood() throws goodsNotFoundException {
        if(maincourse==null||maincourse.isEmpty())
        {
            throw new goodsNotFoundException("Maincourse don't have food");
        }
        maincourse.clear();
        checkRep();
        updatemenu.clear("Maincourse");
    }
     public Food findById(String Id)throws goodsNotFoundException
     {  boolean test=true;
        for(Food f:maincourse)
        {
            if(f.getId().equals(Id))
            {   test=false;
                return f;
            }
        }
        
        if(test)
        {throw new goodsNotFoundException("Your Id : "+Id+ "not found in Maincourse");}
        return null;
        
        
     }
   
 

    public List<Food> getAllfoods()
     {     return new ArrayList<>(maincourse);}
        
        
}
