package Menu;
import java.util.List;

import lib.*;;  

public interface menu {
public void addfood(food foods) throws InvalidOperationException;
public void clearfood() throws goodsNotFoundException;
public List<String> getAllfoods();
//public List<String> findById(String Id) throws goodsNotFoundException;
}
