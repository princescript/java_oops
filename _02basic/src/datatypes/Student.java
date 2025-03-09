package datatypes;

public class Student {
    String name;
    String address;
    int rollNumber;
    int standard;

    @Override
    public String toString(){
        return  String.format("Student :  name =%s, address =%s ,rollNumber = %d, standard =%d",name,address,rollNumber,standard);
    }
}
