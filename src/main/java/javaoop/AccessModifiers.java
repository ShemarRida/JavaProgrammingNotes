package javaoop;

public class AccessModifiers {
    private String name;
    private Integer age;
    private String DOB;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
    protected void conclusion(){
        System.out.println("My name is " + getName() + ". I am " + getAge() + " years old. I was born " + getDOB());
    }

    public static void main(String[] args) {
        AccessModifiers person = new AccessModifiers();
        person.setName("Shemar Rida");
        person.setAge(19);
        person.setDOB("07/12/2000");
        System.out.println("Name: " + person.getName() + "\n" + "Age: " + person.getAge() + "\n" + "Date Of Birth: " + person.getDOB());
        person.conclusion();
    }
}
