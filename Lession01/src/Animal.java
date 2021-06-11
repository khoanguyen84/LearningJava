public abstract class Animal {
    private String name;
    public int age;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String showInfo(){
        return "Name: " + this.name + ", Age: " + this.age;
//        return String.format("Name: %s, Age: %f", this.name, this.age);
    }
    public  abstract  String speak();
}
