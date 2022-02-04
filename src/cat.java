public class cat {
    private String name;
    public cat(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public String toString(){
        return "Cat: " + name;
    }
}
