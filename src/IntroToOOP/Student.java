package IntroToOOP;

public class Student {
    String name;
    int age;
    int psp;
    int gradYear;
    String currentCompany;

    void doSomething(){
        System.out.println("Please do something!");
    }

    public void setAge(int age) {
        if (age <= 25){
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}
