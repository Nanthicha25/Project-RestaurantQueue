package Menu;
import java.util.List;

import lib.*;;  

public interface menu {
public void addfood(Food foods) throws InvalidOperationException;
public void deletefood(Food foods) throws goodsNotFoundException;
public void clearfood() throws goodsNotFoundException;
public List<Food> getAllfoods();
public Food findById(String Id) throws goodsNotFoundException;
}
