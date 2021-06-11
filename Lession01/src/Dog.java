public class Dog extends Animal{
    private int legs;
    public Dog(String name, int age, int legs) {
        super(name, age);
        this.legs = legs;
    }

    @Override
    public String showInfo(){
        return super.showInfo() + ", Legs: " + this.legs;
//        return String.format("%s, Legs: %f", super.showInfo(), this.legs);
    }
    @Override
    public String speak(){
        return "Gogooogooo";
    }
}