package ff_overr;

//Parent class -Vehicle
public class Vehicle {

    public double fuelCost(int km){
        
        return  km*10.0;
    }
}


//Child class -Bike
public class Bike extends Vehicle {
    
    @Override
    public double fuelCost(int km){
        return km*5.0;
    }
}


//Child class -ElectricCar
public class ElectricCar extends Vehicle{
    
    @Override
    public double fuelCost(int km){
        
        return km*2.0;
    }
}


//Main class
public class Main {

    public static void main(String[] args) {
      
        //Aray of type Vehicle(parent class)- can hold any subclass object
        Vehicle[] vehi = new Vehicle[3];
        
        //Storing different object types in the same array
        
        vehi[0] = new Vehicle(); //base class object
        
        vehi[1] = new Bike(); //subclass object stored as Vehicle
        
        vehi[2] = new ElectricCar(); //Another subclass stored as Vehicle
        
        int i;
        
        //Iterating through the array - each element may be a different type
        for(i=0;i<vehi.length;i++){
            
         //Runtime polymorphism in action:
         //JVM decides at runtime which fuelCost() to call
         //based on the actual object type, not the array type
         double cost = vehi[i].fuelCost(10);
        
            System.out.println(vehi[i].getClass().getSimpleName()+ " - Travel cost for 10 km: " +cost);
        }
        
    }
    
}
