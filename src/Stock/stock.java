package Stock;

import lib.InvalidOperationException;
import java.util.List;
import lib.*;

public interface stock {

public void addfoodstock(String namefood,String id) throws InvalidOperationException;
public void clearfoodstock() throws InvalidOperationException;
public List<String> getAllfoodsstock();
//public List<String> findstockByName(String namefood) throws goodsNotFoundException;
}
