package Menu;



import lib.food;
import lib.goodsNotFoundException;
import lib.InvalidOperationException;
import lib.Datafilemenu;
import java.util.ArrayList;
import java.util.List;

import lib.*;

public class Drinks implements menu {
Datafilemenu updatemenu=new Datafilemenu();

    @Override
    public void addfood(food foods,String image) throws InvalidOperationException {
      
        updatemenu.write("Drinks",foods,image);
    }

    @Override
    public void clearfood() throws goodsNotFoundException {
        
        updatemenu.clear("Drinks");
    }

 
        
     
     public List<String> getAllfoods()
     {return updatemenu.Showallmenu("Drinks");
     }
}
