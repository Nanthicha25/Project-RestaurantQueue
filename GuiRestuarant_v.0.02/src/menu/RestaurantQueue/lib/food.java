package lib;
public final class food {
    private final String type;
    private final String Id;
    private final String Name;
    private final double price;
    private final String imagePath;
    
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
        if (imagePath == null || imagePath.isBlank()||imagePath.isEmpty()) {
            throw new RuntimeException("RI violated: Id cannot be blank.");
        }
    }

    public food(String type,String Id, String Name, double price, String imagePath) throws InvalidOperationException{
       
        this.type=type;
        this.Id = Id;
        this.Name = Name;
        this.price = price;
        this.imagePath = imagePath;
        checkRep(); 
    }

    public String gettype() { return type; }
    public String getId() { return Id; }
    public String getName() { return Name; }
    public double getPrice() { return price; }
    public String getImagePath() { return imagePath; }



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