public class Rollercoaster extends Attraction implements ISecurity{

    public Rollercoaster(String name, int rating){
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        return (visitor.getHeight() > 145 && visitor.getAge() > 12);
    }
}
