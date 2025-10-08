package Stock;

import java.util.List;
import lib.*;

public interface stock {

public void addfoodstock(food foods) throws InvalidOperationException;
public void deletefoodstock(food foods) throws goodsNotFoundException;
public void clearfoodstock() throws goodsNotFoundException;
public List<food> getAllfoodsstock();
public food findByIdstock(String Id) throws goodsNotFoundException;
}
