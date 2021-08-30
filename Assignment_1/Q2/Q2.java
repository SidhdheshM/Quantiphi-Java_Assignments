public class Q2{
    public static void main(String args[]){
        Employee e = new Employee();
        e.name = "Sid";
        e.setAge(22);
        e.setSal(50000);
        System.out.println("Emplyee name: " + e.name);
        System.out.println("Employee age: " + e.age);
        System.out.println("Employee salary: " + e.getSal());
    }
}

