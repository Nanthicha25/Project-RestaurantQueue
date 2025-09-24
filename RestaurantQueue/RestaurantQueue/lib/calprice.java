package lib;

public class calprice {
   
    public double normalclient(shopcart foods)
    {    
        return foods.getFoods().getPrice()*foods.getQuantity();
    }
}
