package lib;
public final class food {
    private final String type;
    private final String Id;
    private final String Name;
    private final double price;
    
    private void checkRep() {
        if (type == null || type.isBlank()||type.isEmpty()) {
            throw new RuntimeException("RI violated: type cannot be blank.");
        }
        if (Id == null || Id.isBlank()||Id.isEmpty()) {
            throw new RuntimeException("RI violated: Id cannot be blank.");
        }
        if (Name == null || Name.isBlank() ||Name.isEmpty()) {
            throw new RuntimeException("RI violated: Name cannot be blank.");
        }
        if (price < 0) {
            throw new RuntimeException("RI violated: price cannot be negative.");
        }
    }


    public food(String type,String Id, String Name, double price) throws InvalidOperationException{
        if(type.equals("Dessert")||type.equals("Drinks")||type.equals("Maincourse"))
        {this.type=type;}
        else throw new InvalidOperationException("Don't have this type in menu");
        this.Id = Id;
        this.Name = Name;
        this.price = price;
        checkRep(); 
    }

   public String gettype() { return type; }
    public String getId() { return Id; }
    public String getName() { return Name; }
    public double getPrice() { return price; }


   /*  @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        food newfood = (food) obj;
        return Id.equals(newfood.Id);
    }

    @Override
    public int hashCode() {
        return Id.hashCode();
    }*/
}