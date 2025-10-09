package Menu;

import java.util.ArrayList;
import java.util.List;

import lib.*;
public class Maincourse implements menu{
Datafilemenu updatemenu=new Datafilemenu();
   

    @Override
    public void addfood(food foods) throws InvalidOperationException {
      
        updatemenu.write("Maincourse",foods);
    }

    @Override
    public void clearfood() throws goodsNotFoundException {
        
        updatemenu.clear("Maincourse");
    }

    public List<String> getAllfoods()
     {     return updatemenu.Showallmenu("Maincourse");}
        
        
}
