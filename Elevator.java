import java.util.ArrayList;
public class Elevator {
    private int weightLimit;
    private int currentWeight = 0;
    private ArrayList<Person> peopleInElevator;

    public Elevator(int weightLimit, int currentWeight)
    {
        this.weightLimit = weightLimit;
        this.currentWeight = currentWeight;
    }

    public Elevator()
    {
        this.weightLimit = 0;
        peopleInElevator = new ArrayList();
    }

    public String getInfo(int n)
    {
        String info = "\nElevator " + n + ":" + "\n\tWeight Limit: " + this.weightLimit;
        for(Person p: peopleInElevator){
            info+= p.getInfo();
        }
        return info;
    }

    public void setWeight(int currentWeight)
    {
        this.currentWeight = currentWeight;
    }

    public void setLimit(int weightLimit){
        this.weightLimit = weightLimit;
    }

    public Boolean addPerson(Person p)
    {
        if((this.currentWeight + p.getWeight()) <= this.weightLimit)
        {
            peopleInElevator.add(p);
            this.currentWeight = this.currentWeight + p.getWeight();
            return true;
        }
        else{return false;}
    }

    public ArrayList<Person> addPeople(ArrayList<Person> people)
    {
        int i = 0;
        for (Person person : people) {
            for(Person p : people){
                if(person.getWeight() < p.getWeight()){
                    people.remove(p);
                    people.add(i, p);
                } 
                i++;
            }
            i = 0;
        }
        for (Person per : people) {
            if(addPerson(per)){
                System.out.println("Added " + per.getName() + " to Elevator 1.");
            }
            else{
                System.out.println(per.getName() + " cannot be added to this elevator without exceeding the weight limit.");
            }
        }
        return people;
    }
}
