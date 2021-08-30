//Employee salary method is encapsulated
public class Employee{
    String name;
    int age;
    private int salary; 

    public void setAge(int Age){
        age = Age;
    }

    public void setSal(int Salary){
        salary = Salary;
    }

    public int getSal(){
        return salary;
    }
}