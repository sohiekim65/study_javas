package InheritanceVehicle;
public class Cars extends Vehicle{
    int _oneway_count = 0;

    Cars(int oneway_count){
        this._oneway_count = oneway_count;
        System.out.println("");
    }

    public int speed(int kms, int hours){
        int result = (kms/hours) + _oneway_count;
        return result;
    }
}
