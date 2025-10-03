package Menu;

import java.util.ArrayList;
import java.util.List;

import lib.*;
public class Maincourse implements menu{
private ArrayList<food> maincourse=new ArrayList<>();
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

    @Override
    public void addfood(food foods) throws InvalidOperationException {
       boolean check = true;
        for(int i=0;i<maincourse.size();i++)
        {   if(maincourse.get(i).getName().toLowerCase().equals(foods.getName().toLowerCase())&&!maincourse.get(i).getId().equals(foods.getId()))
            {
                throw new InvalidOperationException("Duplicate name in Maincourse ");
            }
              //ถ้ารหัสอาหารซ้ำจะอัพเดทอาหารใหม่
            if(maincourse.get(i).getId().equals(foods.getId()))
            { maincourse.set(i, foods);
            check=false; }
           
             }
        if(check)    
       {maincourse.add(foods);}
        checkRep();
        updatemenu.write("Maincourse",foods);
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
 //    public List<String> findById(String Id)throws goodsNotFoundException
  //   {   return updatemenu.findbyId(Id,"Maincourse");}
        
    public List<String> getAllfoods()
     {     return updatemenu.Showallmenu("Maincourse");}
        
        
}
