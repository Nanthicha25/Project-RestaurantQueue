package Stock;

import java.util.ArrayList;
import java.util.List;

import lib.*;

public class MaincourseStock implements stock{
List<food>maincoursestock=new ArrayList<>();
Datafilestock updatestock=new Datafilestock();

    @Override
    public void addfoodstock(food foods) throws InvalidOperationException {
        updatestock.writestock("MaincourseStock", foods);
    }

    @Override
    public void deletefoodstock(food foods) throws goodsNotFoundException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletefoodstock'");
    }

    @Override
    public void clearfoodstock() throws goodsNotFoundException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clearfoodstock'");
    }

    @Override
    public List<food> getAllfoodsstock() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllfoodsstock'");
    }

    @Override
    public food findByIdstock(String Id) throws goodsNotFoundException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByIdstock'");
    }}