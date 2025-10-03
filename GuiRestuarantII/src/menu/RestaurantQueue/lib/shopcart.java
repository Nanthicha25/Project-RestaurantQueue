package lib;



public class shopcart {
    private final food foods;
    private int quantity;
    private String comment;
    Datafilebill updatebill=new Datafilebill();

    private void checkRep() {
        if (foods == null) {
            throw new RuntimeException("RI violated: product cannot be null.");
        }
         if (comment == null) {
            throw new RuntimeException("Comment not null");
        }
        if (quantity <= 0) {
            throw new RuntimeException("RI violated: quantity must be positive.");
        }
    }

    public shopcart(food foods, int quantity,String comment){
        this.foods = foods;
        this.quantity = quantity;
        this.comment=comment;
         checkRep();
        updatebill.write(foods,quantity,comment);
       
    }

    public food getFoods() { return foods; }
    public int getQuantity() { return quantity; }
    public String getcomment(){return comment;}

   
    public void increaseQuantity(int amount) {
        if (amount > 0) {
            this.quantity += amount;
        }checkRep();
        updatebill.write(foods,quantity,comment);
        
    }
    public void decreaseQuantity(int amount) {
        if (amount > 0 && quantity>=amount) {
            this.quantity -= amount;
        }
        checkRep();
        updatebill.write(foods,quantity,comment);
        
    }
   
   
}


