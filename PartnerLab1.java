import java.util.Scanner;
public class PartnerLab1 {

    public static void main(String[] args) {
        Scanner nameScnr = new Scanner(System.in);
        Scanner weightScnr = new Scanner(System.in);
        Elevator elevator1 = new Elevator();
        Elevator elevator2 = new Elevator();
        System.out.println("Enter the weight-limit of elevator 1: ");
        int limit1 = weightScnr.nextInt();
        System.out.println("Enter the weight-limit of elevator 2: ");
        int limit2 = weightScnr.nextInt();
        elevator1.setLimit(limit1);
        elevator2.setLimit(limit2);
        String name = " ";
        while(!name.equalsIgnoreCase("q")){
            System.out.println("Enter the name of the person you would like to add to elevator 1 (Enter q to stop): ");
            name = nameScnr.nextLine();
            if(!name.equalsIgnoreCase("q")){
                System.out.println("Enter the weight of the person:");
                int weight = weightScnr.nextInt();
                Person p = new Person(name,weight);
                if(elevator1.addPerson(p)){
                    System.out.println("Added " + name + " to Elevator 1.");
                }
                else{
                    System.out.println(name + " cannot be added to this elevator without exceeding the weight limit.");
                }
            }
        }
        name = " ";
        while(!name.equalsIgnoreCase("q")){
            System.out.println("Enter the name of the person you would like to add to elevator 2 (Enter q to stop): ");
            name = nameScnr.nextLine();
            if(!name.equalsIgnoreCase("q")){
                System.out.println("Enter the weight of the person:");
                int weight = weightScnr.nextInt();
                Person p = new Person(name,weight);
                if(elevator2.addPerson(p)){
                    System.out.println("Added " + name + " to Elevator 2.");
                }
                else{
                    System.out.println(name + " cannot be added to this elevator without exceeding the weight limit.");}
            }
        }
        System.out.println(elevator1.getInfo(1) + "\n" + elevator2.getInfo(2)); 
        }
}    

