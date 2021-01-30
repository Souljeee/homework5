public class Main {
    public static void main(String[] args) {
       Employee[] empArray = new Employee[5];
       empArray[0] = new Employee("Петров Иван Васильевич", "Менеджер", "ivan@mail.ru", 8917650, 50,32);
       empArray[1] = new Employee("Зубенко Екатерина Андреевна","Администратор", "ekaterina@mail.ru",7745643,70,24);
       empArray[2] = new Employee("Петрова Виктория Андреевна","Разработчик","vika@mail.ru",2438299,100,43);
       empArray[3] = new Employee("Лукашев Алексей Максимович","Тестировщик","leha@mail.ru",3455439,100,44);
       empArray[4] = new Employee("Глазырин Дмитрий Алексеевич","Разработчик","dima@mail.ru",3455434,100,27);
       for (int i = 0; i < empArray.length; i++) {
            if(empArray[i].getAge() > 40){
                empArray[i].info();
                System.out.println();
            }
       }
    }
}
