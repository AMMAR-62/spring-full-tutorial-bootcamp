package main.java.com.example.masterclass.demo;

public class Main {
    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Doctor doctor = context.getBean(Doctor.class);
        Nurse doctor = context.getBean(Nurse.class);
        doctor.assist();
    }
}
