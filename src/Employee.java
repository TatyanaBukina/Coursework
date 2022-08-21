import java.util.Objects;

public class Employee {

    private String fio;
    private int department;
    private double wages;
    private int id;
    private static int idCounter = 0;

    public Employee(String fio, int department, double wages) {
        this.fio = fio;
        this.department = department;
        this.wages = wages;
        this.id = ++idCounter;

    }


    public String getFio() {
        return fio;
    }

    public int getDepartment() {
        return department;
    }

    public double getWages() {
        return wages;
    }

    public void setDepartment(int department) {
        if (department < 0 || department > 5) {
            throw new IllegalArgumentException("Неправильно указан номер отдела,укажите номер от 1 до 5");
        }
        this.department = department;
    }

    public void setWages(double wages) {
        if (wages < 0) {
            throw new IllegalArgumentException("Неправильно ввели данные");
        }
        this.wages = wages;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Employee employee = (Employee) object;
        return id == employee.id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return
                " id=" + id +
                ", ФИО= " + fio +
                ", Отдел=" + department +
                ", Зарплата=" + wages;
    }

    }

