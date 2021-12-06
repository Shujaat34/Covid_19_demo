package covid_19vaccination;

public class Patient {

    private String name;
    private int age;
    private int priority;

    public Patient(String name, int age, int priority) {
        this.name = name;
        this.age = age;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

}
