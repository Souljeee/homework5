public class Employee {
    private String name;
    private String position;
    private String email;
    private int phoneNumber;
    private int payment;
    private int age;


    public Employee(String name, String position, String email, int phoneNumber, int payment, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.payment = payment;
        this.age = age;
    }

    public void info(){
        System.out.printf("Имя: %s    Должность: %s   Email: %s    Номер телефона: %d    Зарплата: %d    Возраст: %d",name,position,email,phoneNumber,payment,age);
    }

    public int getAge() {
        return age;
    }
}

