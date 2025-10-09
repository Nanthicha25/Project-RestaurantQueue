package Stock;

import java.util.*;
import lib.*;

public class DessertStock implements stock{
Datafilestock updatestock=new Datafilestock();


@Override
public void addfoodstock(String namefood,String id)throws InvalidOperationException 
{ 
    updatestock.writestock("Dessert",namefood,id);}
   

@Override
public void clearfoodstock() throws InvalidOperationException {
  updatestock.clear("DessertStock");
  
}

@Override
public List<String> getAllfoodsstock() {
    return updatestock.Showallstock("DessertStock");
}


//public List<String> findstockByName(String namefood) throws goodsNotFoundException {
   //return updatestock.findbyname(namefood,"DessertStock");}


    
}
