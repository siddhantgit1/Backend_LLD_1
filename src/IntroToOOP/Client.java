package IntroToOOP;

public class Client {
    public static void main(String[] args) {
        Student x = new Student();
        x.name = "Siddhant";
        x.age = 24;
        x.psp = 69;
        x.gradYear = 2022;
        x.currentCompany = "Autodesk";
        System.out.println(x.currentCompany);
    }
}
