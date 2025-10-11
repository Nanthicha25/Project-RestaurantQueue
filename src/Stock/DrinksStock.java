package Stock;



import lib.Datafilestock;
import lib.InvalidOperationException;
import java.util.List;

import lib.*;

public class DrinksStock implements stock {
Datafilestock updatestock=new Datafilestock();

    @Override
    public void addfoodstock(String namefood,String id)throws InvalidOperationException 
    {updatestock.writestock("Drinks",namefood,id);
   
    }


    @Override
    public void clearfoodstock() throws InvalidOperationException {
     
        updatestock.clear("DrinksStock");
        
    }

    @Override
    public List<String> getAllfoodsstock() {
        
        return updatestock.Showallstock("DrinksStock");
    }

    //@Override
    //public List<String> findstockByName(String namefood) throws goodsNotFoundException {
     //   return updatestock.findbyname(namefood,"DrinkStock");}

    }