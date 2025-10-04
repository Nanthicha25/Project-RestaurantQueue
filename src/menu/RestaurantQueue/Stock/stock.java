package Stock;

import java.util.List;
import lib.*;

public interface stock {

public void addfoodstock(Food foods) throws InvalidOperationException;
public void deletefoodstock(Food foods) throws goodsNotFoundException;
public void clearfoodstock() throws goodsNotFoundException;
public List<Food> getAllfoodsstock();
public Food findByIdstock(String Id) throws goodsNotFoundException;
}
