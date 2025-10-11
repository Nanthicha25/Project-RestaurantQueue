package Stock;


import lib.Datafilestock;
import lib.InvalidOperationException;
import java.util.List;
import lib.*;
public class MaincourseStock implements stock{
Datafilestock updatestock=new Datafilestock();

    @Override
    public void addfoodstock(String namefood,String id)throws InvalidOperationException
    {    updatestock.writestock("Maincourse",namefood,id);
   
    }


    @Override
    public void clearfoodstock() throws InvalidOperationException {
        
       updatestock.clear("MaincourseStock");
       
    }

    @Override
    public List<String> getAllfoodsstock() {
     return updatestock.Showallstock("MaincourseStock");
    }

    //@Override
    //public List<String> findstockByName(String namefood) throws goodsNotFoundException {
    //    return updatestock.findbyname(namefood,"MaincourseStock");}
        

    }