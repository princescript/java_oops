package jon.companyname.corejava.vehicles;

public class Car {
    public static void main(String[] args) {
        System.out.print("Car");
        //access only allowed inside the same package when not public
//        MiniCycle miniCycle = new MiniCycle();

        //nested class acesss \\ inner class
        Cycle cycle = new Cycle();
        Cycle.MiniCycle miniCycle = cycle.new MiniCycle();
    }
    public void RunCar(){
        System.out.println("Car is Running");
    }
}
