package lib;



public class shopcart {
    private final String namefood;
    private int quantity;
     private String comment;
     Datafilecart updatecart=new Datafilecart();
    private void checkRep() {
        if (namefood == null||namefood.isBlank()||namefood.isEmpty()) {
            throw new RuntimeException("RI violated: product cannot be null.");
        }
         if (comment == null||comment.isBlank()||comment.isEmpty()) {
            throw new RuntimeException("Comment not null");
        }
        if (quantity <= 0) {
            throw new RuntimeException("RI violated: quantity must be positive.");
        }
    }

    public shopcart(String namefood, int quantity,String comment){
        this.namefood = namefood;
        this.quantity = quantity;
        this.comment=comment;
         checkRep();
         updatecart.write(namefood,quantity,comment);
       
    }

    public String getNameFoods() { return namefood; }
    public int getQuantity() { return quantity; }
    public String getcomment(){return comment;}

 
    public void decreaseQuantity(String namefood, int quantity,String comment) throws InvalidOperationException {
        if (quantity< 0 ) {
            throw new InvalidOperationException("Invalid quantity");
        }
        checkRep();
       updatecart.decreasegoods(namefood,quantity,comment);
        
    }
    public void deletecart(String namefood,String comment)
    {
     updatecart.delete(namefood,comment);
    }
    public void clearcart()
    {
        updatecart.clear();
    }
    
}


