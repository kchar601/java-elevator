public class Person {
    private String name;
    private int weight;

    public Person(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String getInfo(){
        return "\n\tName: " + this.name + "\tWeight: " + this.weight;
    }

    public int getWeight(){
        return this.weight;
    }

    public String getName(){
        return this.name;
    }
}
