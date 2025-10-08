package Menu;
import java.util.List;

import lib.*;;  

public interface menu {
public void addfood(food foods) throws InvalidOperationException;
public void deletefood(food foods) throws goodsNotFoundException;
public void clearfood() throws goodsNotFoundException;
public List<food> getAllfoods();
public food findById(String Id) throws goodsNotFoundException;
}
