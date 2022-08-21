public class Main {

    private static final Employee[] employees = new Employee[10];


    public static void main(String[] args) {
        employees[0] = new Employee("Демьянова Ульяна Гордеевна", 1, 34000);
        employees[1] = new Employee("Чеботарев Сергей Владимирович", 2, 36988);
        employees[2] = new Employee("Матвеева Милана Владиславовна", 4, 34555);
        employees[3] = new Employee("Левина Мария Даниэльевна", 3, 49999);
        employees[4] = new Employee("Туманов Захар Максимович", 2, 54666);
        employees[5] = new Employee("Куликова Виктория Ильинична", 1, 50000);
        employees[6] = new Employee("Родина Камилла Александровна", 5, 47000);
        employees[7] = new Employee("Богданова Мария Сергеевна", 2, 36700);
        employees[8] = new Employee("Федоров Семён Ярославович", 3, 45000);
        employees[9] = new Employee("Соболева Анастасия Дмитриевна", 4, 42900);
        ///
        employees[8].setDepartment(5);
        System.out.println(employees[8]);
        //задание 1а
        printingEmployess();
        ///задание 1b
        findMinWages();
        int sum= calculateAmount();
        System.out.println("Сумма зарплат " + sum);
        calculateAverage();
        printIfFio();
    }

    public static void printingEmployess() {
        for (int i = 0; i < employees.length - 1; i++) {
            {
                System.out.println("Сотрудник = " + employees[i]);

            }
        }
    }

    //// посчитаем суииу затрат на зарплаты за месяц
    public static int calculateAmount() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getWages();
        }
        return sum;

    }

    ////Найдем сотрудника с минимальной зп
    public static void findMinWages() {
        Employee max = employees[0];
        Employee min = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getWages() > max.getWages()) {
                max = employees[i];
            } else if (employees[i].getWages() < min.getWages()) {
                min = employees[i];
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой" + max + "Сотрудник с минимальной заорплатой" + min);
    }
    //// среднее значение
    public  static void  calculateAverage(){
        int sum= calculateAmount();
        int average = sum / employees.length;
        System.out.println("средняя зарплата сотрудника  " + average);
    }

    /// вывести фмо сторудников
    public  static  void  printIfFio(){
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFio());
        }
    }
}







