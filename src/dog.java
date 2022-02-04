public class dog {
    private String name;
    public dog(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void bark(){
        System.out.println("woof!");
    }
    public String toString(){
        return "Dog: " + name;
    }
}
