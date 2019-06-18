public class TabaccoStall extends Stall implements ISecurity {

    public TabaccoStall(String name, String owner, int parkingSpot, int rating) {
        super(name, owner, parkingSpot, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        return (visitor.getAge() >= 18);
    }
}
