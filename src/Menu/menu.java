package Menu;
import lib.food;
import lib.goodsNotFoundException;
import lib.InvalidOperationException;
import java.util.List;

import lib.*;;  

public interface menu {
public void addfood(food foods,String image) throws InvalidOperationException;
public void clearfood() throws goodsNotFoundException;
public List<String> getAllfoods();
//public List<String> findById(String Id) throws goodsNotFoundException;
}
