package Interface;

public class Bird implements IAnimal, IFlyable{
    public Bird(){
        
    }
    @Override
    public String speak(){
        return "Chip chip";
    }

    @Override
    public String move() {
        return "Fly or walking";
    }

    @Override
    public  String howToFly(){
        return "Fly";
    }
}
