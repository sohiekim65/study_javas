package InheritanceVehicle;
public class Vans extends Vehicle {
    
    public int windows_count(int oneway_count){
        int result = oneway_count*3;
        return result;
    }
}
